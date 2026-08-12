# Dv. Web 3 - aula 11 - Node.js/JSON web service e primeiros passos

## Promises/Promessas

Promises são objetos que representam a eventual conclusão(ou falha) de uma operação assíncrona e fornecem uma maneira de lidar com resultados assíncronos e sincronos de forma prática.

A gente usa as promises basicamente para mandar nosso programa fazer outra coisa enquanto ele espera que uma tarefa longa seja concluida.

As **promises** tem 3 estados:
* Pending(pendente) - Quando ela é criada;
* FulFilled(realizada) - Quando a operação assíncrona é concluída com sucesso, passando para o estado cumprido e retorna um valor ou resultado.
* Rejected(rejeitada) - Se a operação falha, a promise passa para o estado rejeitado e retorna um erro.

**Metodo thn/catch com promises**

Com promises, podemos usar o método `then()` para tratar resultados bem sucedidos e o `catch()` para tratar os erros.

EX:
````javascript

let minhaPromise = new Promise(function(resolve, reject){
    //faça algo, se der certo chama o resolve, se não chame o reject
});

minhaPromise.then(function(resultado){
    //trata o resultado bem-sucedido
}).catch(function(erro){
    //trata o erro
})
````

Como os métodos **Promise.prototype.then** e **Promise.prototype.catch** retornam ***PROMISES***, eles podem ser encadeados.

## Callback

_Callbacks_ são funções que são passadas como **argumento para outras funções** e são chamadas quando algum **evento/operação assíncrona é resolvidos**. Basicamente estas são funções que são executadas após outra função concluir sua execução.

EX:

````javascript

function calcula(num1, num2, callback){
    const resultado = num1 + num2;
    callback(resultado);
}

function imprimeResultado(resultado){
    console.log(`O resultado da operação é: ${resultado}`);
}

// Chamando a função calcula passando os argumentos e a função callback
calcula(1, 1, imprimeResultado());
````

## Async e Await

A programação async e await é uma técnica utilizada em linguagens de programação modernas, para **lidar com operações assíncronas de for síncrona**.

O **async/await** facilitaram bastante a escrever códigos, pois podemos usar agora a palavra-chave **async** antes de uma função assíncrona e **await** antes das chamadas dessas operações. Para capturar erros dessas operações podemos simplesmente usar o _try/catch_.

EX:

````javascript

async function fetchUserData(){
    try{
        const response = await fetch('https://jsonplaceholder.typicode.com/users/1');
        const data = await response.json();
        console.log(data);
    }catch(error){
        console.error(error);
    }
}

fetchUserData();

````

## Primeiros passos com Node.js

**Desenvolvendo a estrutra do projeto**

Todo projeto em node.js tem presente algumas estruturas, uma delas é o **package.json** que é um arquivo de configuração. usamos o comando `npm init -y` para cria-lo, o "-y" é opcional ele determina tudo como "yes", assim criando um arquivo padrão.

**Gerenciadores de pacote**

Gerenciadores de pacotes são repositórios de código aberto nos quais devs disponibilizam soluções para o uso da comunidade.
Estas soluções são programas que  utilizamos para ganhar tempo no desenvolvimento de nosso próprio código, e vão desde libs (bibliotecas) pequenas e específicas até frameworks com vários recursos prontos. E um pacote (ou módulo) é como chamamos o conjunto do código que determinada lib ou framework utiliza para executar.

Assim como para todas as instalações de libs externas utilizamos o comando (ambos são gerenciadores de pacotes):

[Link oficial do npm](https://docs.npmjs.com) `npm install <nome do pacote>`

[Link oficial do yarn](https://yarnpkg.com) `yarn add <nome do pacote>`

**Instalação global VS. Local**

Os pacotes de código podem ser instalados **localmente**, estando _disponíveis somente para o projeto no qual foi instalado_ através da pasta **node_modules**. Nesse caso se utiliza os comandos comuns mesmo `npm install <nome do pacote>` ou `yarn add <nome do pacote>`.

A instalação local facilita o gerenciamento de versão das libs que utilizamos e muitas vezes, um pacote que instalamos “puxa” um ou vários outros pacotes auxiliares que ele precisa para funcionar. 

Instalados **globalmente**, sendo instalados em um **diretório geral do NPM** e ficando disponíveis para _todos os projetos em seu computador_, sem a necessidade de instalar separadamente em cada projeto. Nesse caso usamos os comandos `npm install -g <nome do pacote>` ou `yarn add global <nome do pacote>`.

***O ideal é não poluir o diretório global com libs que poderão ser utilizadas em somente um projeto.***

Para caso precisemos ajudar nosso terminal na busca e escrita, podemos usar a biblioteca **chalk** para o node.

**commonjs - cjs**

Cada **arquivo ".js"** é um módulo independente e suas funções, variáveis e classes _não são compartilhados com o restante do código_, a não ser quando são explicitamente exportados e importados em outros módulos.

A função que o NodeJS utiliza para importar módulos em um arquivo é `require()`.

Os módulos podem importar e exportar **todas as funções declaradas** no arquivo ou **apenas algumas**, de acordo com o necessário. Este formato de exportação e importação de módulos é conhecido como **CommonJS ou CJS.**

Caso tenhamos uma função dentro de outra, caso exportemos a função menos aninhada, as outras vão junto.

1 - caso seja necessário exportar e importar mais de uma função, podemos fazer isso exportando um único objeto no final do arquivo/módulo

2 - funções podem ser importadas desestruturando o mesmo objeto

Exemplos : 

````javascript

//exportar apenas uma função em um arquivo:
module.exports = function soma(num1, num2) {
    return num1 + num2;
};


function soma(num1, num2) {
    return num1 + num2;
};

module.exports = soma;

// 1 - exportando mais de uma função

function soma(num1, num2) {
    return num1 + num2;
}
function multiplica(num1, num2) {
    return soma(num1, num2) * 2;
}
module.exports = { multiplica, soma };

// 2- importando as funções 

const { multiplica, soma } = require('./caminho/arquivo');
const resultadoMult = multiplica(2, 2);
const resultadoSoma = soma(2, 2);
````

O mesmo princípio se aplica para módulos externos que instalamos em nosso projeto a partir de um gerenciador de pacotes como o NPM (com `npm install <nome da lib>`); nesse caso não precisamos passar o caminho, pois o JavaScript vai acessar os métodos necessários a partir da pasta node_modules

**Biblioteca Fyle System - FS**

Para ler um arquivo no FS utilizamos o método readFile(), utilizamos a sintaxe: `fs.readFile (<File>, <Encoding>, <CallBack>];`. Onde o CallBack será uma função com dois parâmetros (um de insucesso e outro com sucesso): `function(err, data)`

EX: 

````javascript



import chalk from 'chalk';
import fs from 'fs';

function trataErro(erro){
    throw new Error(chalk.red(erro.code, "Algo deu errado"));
}

//versão sem promise
function pegaArquivo(caminhoDoArquivo){
    const encoding = 'utf-8';
    fs.readFile(caminhoDoArquivo, enconding, (erro, texto) => {
        if(erro){
            trataErro(erro);
        }
        console.log(chalk.green(texto));
    })
}

// versão com promise
function pegaArquivo(caminhoDoArquivo){
    const encoding = 'utf-8';
    fs.promises
    .readFile(caminhoDoArquivo, enconding)
    .then((texto) => console.log(texto))
    .catch((erro) => trataErro(erro))
}

// versão async await
async function pegaArquivo(caminhoDoArquivo){
    const encoding = 'utf-8';
    try{
        const texto = await fs.promises.readFile(caminhoDoArquivo, enconding)
        console.log(chalk.blueBright(texto));
    }catch(erro){
        trataErro(erro);
    }

}

pegaArquivo('./arquivos/arquivo.md');

````