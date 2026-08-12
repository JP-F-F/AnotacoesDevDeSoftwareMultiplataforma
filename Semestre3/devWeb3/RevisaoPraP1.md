
## Questão 01: Sistema de Configuração (Módulo `fs` e JSON):

Você foi designado para criar um sistema de configuração para um projeto da FATEC. O primeiro passo é preparar o ambiente: **inicialize um novo projeto Node.js** em uma pasta exclusiva utilizando o comando **npm init**. Em seguida, **crie manualmente um arquivo chamado config.json** contendo as **chaves "campus", "curso" e "semestre"**. Desenvolva um script index.js que utilize o **módulo nativo fs** para ler esse arquivo de forma assíncrona e, após a leitura bem-sucedida, exiba no console a mensagem: "Configuração carregada para o curso [CURSO] no campus [CAMPUS]".

Nesta questão, o objetivo é manipular arquivos JSON e entender a leitura assíncrona.

**Passo 1: Preparação**
* No terminal: `npm init -y`(inicia um projeto node em uma pasta exclusiva)
* Arquivo `config.json`:

````json
{
    "campus": "Diadema",
    "curso": "Desenvolvimento de Software Multiplataforma",
    "semestre": "3º"
}
````

**Passo 2: Script `index.js`**
```javascript

// fs importa o módulo nativo FILE SYSTEM do Node
const fs = require('fs');

// Lendo o arquivo de forma assíncrona
fs.readFile('config.json', 'utf8', (err, data) => {
    if (err) {
        console.error("Erro ao ler o arquivo:", err);
        return;
    }
    
    // Convertendo o texto do arquivo para um objeto JavaScript
    const config = JSON.parse(data);
    
    // Exibindo a mensagem formatada
    console.log(`Configuração carregada para o curso ${config.curso} no campus ${config.campus}`);
});
```

> **Explicação Detalhada:**
> **`fs.readFile`**: É uma função assíncrona que não trava a execução do programa enquanto o disco lê o arquivo.
> **`JSON.parse(data)`**: O arquivo é lido como uma "string" bruta. Para acessar as propriedades como `config.curso`, precisamos transformá-la em um objeto.
> **`(err, data) => { ... }`** é a nossa função de callback

## Questão 02: Sistema de Logs (Append e Verificação de Arquivo)

Para monitorar o uso de um laboratório na FATEC, precisamos de um **sistema de logs**. **Inicialize um projeto Node.js** e configure o **arquivo package.json** para que o script principal **seja executado através do comando npm start**. O desafio consiste em criar um código que _verifique a existência_ de um arquivo chamado **log.txt**. Caso o arquivo exista, o programa deve **ler o conteúdo** e **adicionar ao final (append) uma nova linha com o texto "Novo acesso registrado em: "** seguido da data e hora atual do sistema. Caso o arquivo não exista, o script deve criá-lo automaticamente com a primeira entrada de log.

Aqui trabalhamos com a persistência de dados e manipulação de datas[cite: 6].

**Configuração `package.json`:**

````json

// Criando comando personalizado

"scripts": {
  "start": "node index.js" 
}
````

**Script de Log:**

````javascript
const fs = require('fs');

// constante com o nome do arquivo
const logPath = 'log.txt';

// captura o momento em um objeto. | Converte para o formato padrão de data e hora do sistema
const agora = new Date().toLocaleString();

const novaEntrada = `Novo acesso registrado em: ${agora}\n`;

// fs.appendFile cria o arquivo se não existir e adiciona ao final se existir sim isso é nativo da função
fs.appendFile(logPath, novaEntrada, (err) => {
    if (err) throw err;
    console.log('Log atualizado com sucesso!');
});
````

> **Explicação Detalhada:**
> **`fs.appendFile`**: Esta função é extremamente útil pois ela resolve dois problemas de uma vez: se o arquivo `log.txt` não existir, o Node o cria; se já existir, ele apenas adiciona o conteúdo ao final (append), sem apagar o que já estava lá.
> **`new Date()`**: Captura a estampa de tempo (timestamp) atual do servidor.

## Questão 03: API de Consulta Acadêmica (Servidor HTTP e JSON)

Desenvolva um **servidor Node.js** que _simule uma API de consulta acadêmica_. O servidor deve **escutar na porta 3000** e possuir **duas rotas principais**: ao acessar a **raiz (/)**, o aluno deve receber uma resposta em _formato HTML com o título "Portal de APIs Acadêmicas"_. Ao acessar a rota **/instituicao**, o servidor deve **retornar um objeto JSON** contendo as informações: _{ "nome": "Faculdade Tecnológica de São Paulo", "cidade": "São Paulo", "status": "online" }_. Certifique-se de configurar corretamente o Content-Type para cada tipo de resposta (HTML e JSON).

O foco aqui é o cabeçalho de resposta (`Content-Type`) e rotas básicas[cite: 11].

**Script do Servidor:**

````javascript
const http = require('http');

const server = http.createServer((req, res) => {
    if (req.url === '/') {
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        res.end('<h1>Portal de APIs Acadêmicas</h1>');
    } 
    else if (req.url === '/instituicao') {
        const dados = {
            nome: "Faculdade Tecnológica de São Paulo",
            cidade: "São Paulo",
            status: "online"
        };
        res.writeHead(200, { 'Content-Type': 'application/json' });
        res.end(JSON.stringify(dados));
    }
});

server.listen(3000, () => console.log('Servidor rodando na porta 3000'));
````

> **Explicação Detalhada:**
>**`res.writeHead`**: Informa ao navegador o que ele está recebendo. Se for `text/html`, ele renderiza como página; se for `application/json`, ele entende como dados.
> **`JSON.stringify`**: Transforma o objeto JavaScript em uma string JSON para que possa ser enviado via protocolo HTTP.

## Questão 04: Roteador Institucional (Tratamento de URL e Status 404)

Como parte de uma atividade de infraestrutura na FATEC, você deve criar um **roteador institucional em Node.js** utilizando o _módulo http_. O servidor deve ser **capaz de distinguir requisições para três destinos**: _/fatec_, respondendo com o texto "Bem-vindo à Faculdade de Tecnologia"; _/fecap_, respondendo com "Bem-vindo a FATEC Diadema"; e _qualquer outra rota_ acessada deve retornar um erro 404 personalizado com a mensagem "Recurso não encontrado no servidor". O foco aqui é a lógica de tratamento da URL da requisição (req.url) e o envio dos códigos de status HTTP corretos.

Nesta questão, exercitamos a lógica de rotas e o envio de códigos de erro[cite: 15, 18].

**Script do Roteador:**
````javascript

const http = require('http');

const server = http.createServer((req, res) => {
    const url = req.url;

    res.setHeader('Content-Type', 'text/plain; charset=utf-8');

    if (url === '/fatec') {
        res.statusCode = 200;
        res.end("Bem-vindo à Faculdade de Tecnologia");
    } 
    else if (url === '/fecap') { // Nota: Conforme solicitado na questão 4
        res.statusCode = 200;
        res.end("Bem-vindo a FATEC Diadema");
    } 
    else {
        res.statusCode = 404;
        res.end("Recurso não encontrado no servidor");
    }
});

server.listen(3000);

````

> **Explicação Detalhada:**
> **`res.statusCode`**: O status `200` indica sucesso, enquanto o `404` é o código padrão mundial para "Não Encontrado".
> **Lógica de Roteamento**: O servidor analisa a `req.url` para decidir qual bloco de código executar.


## Questão 05: Automação de Dados (Leitura de CSV e Exportação)

Como parte de uma atividade de automação de dados na FATEC, você deve desenvolver um **sistema de exportação de listas de alunos**. Após inicializar o seu projeto **com npm init**, crie um **script que simule a geração de um relatório**. O programa deve **ler um arquivo** chamado estudantes.csv (que você deve criar com alguns nomes e RAs) e **gerar um novo arquivo** chamado export_relatorio.txt. Este novo arquivo deve **conter o conteúdo original, mas com um cabeçalho adicional**: "Relatório Gerado para FATEC - [Data Atual]". O script deve ser **disparado através de um comando personalizado** no package.json chamado **npm run export**, garantindo que o processo de leitura e escrita utilize as funções do módulo fs para manipulação de arquivos no servidor.

Simulamos um processo de ETL (Extração, Transformação e Carregamento) simples.

**Configuração `package.json`:** criando o comando personalizado.
````json
"scripts": {
  "export": "node export.js"
}
````

Aí depois é só rodar o comando `npm run export`, que faz referência ao export no nosso JSON que é uma referência ao nosso arquivo, fazendo assim com que o script seja executado.

**Script `export.js`:**

````javascript

const fs = require('fs');

const input = 'estudantes.csv';
const output = 'export_relatorio.txt';
const dataAtual = new Date().toLocaleDateString();

fs.readFile(input, 'utf8', (err, conteudo) => {
    if (err) {
        console.log("Crie o arquivo estudantes.csv primeiro!");
        return;
    }

    const cabecalho = `Relatório Gerado para FATEC [${dataAtual}]\n`;
    const resultadoFinal = cabecalho + conteudo;

    fs.writeFile(output, resultadoFinal, (err) => {
        if (err) throw err;
        console.log(`Relatório exportado para ${output}`);
    });
});
````

**Como criar o comando personalizado**:

> **Explicação Detalhada:**
> **Workflow**: O script primeiro lê todo o conteúdo do CSV para a memória e depois escreve um novo arquivo concatenando o cabeçalho solicitado[cite: 21, 22].
> * **`npm run export`**: É um comando customizado. Diferente do `start`, comandos criados por você exigem a palavra `run`.


## Lista de Artigos para Estudo

Para dominar esses tópicos de Desenvolvimento Web III, recomendo a leitura destes temas:

1.  **Node.js File System (fs) - Documentação Oficial:** Para entender todas as variações de leitura e escrita (Sync vs Async).
2.  **Anatomy of an HTTP Transaction:** Artigo oficial do Node.js sobre como lidar com `req` (requisição) e `res` (resposta).
3.  **Entendendo Códigos de Status HTTP (MDN Web Docs):** Essencial para saber quando usar 200, 201, 404 ou 500.
4.  **Trabalhando com JSON no JavaScript (MDN):** Para dominar as funções `JSON.parse()` e `JSON.stringify()`.

