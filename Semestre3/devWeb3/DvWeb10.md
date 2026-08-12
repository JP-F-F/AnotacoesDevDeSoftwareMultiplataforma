# DW3 - Aula 10 - Node.js/JSON Web service e Primeiros passos

## Introdução a Web Service

O conceito clássico de Web Services seria: _“é um conjunto de métodos invocados por outras aplicaçõesutilizando tecnologias Web”_

De uma forma resumida um Web Service é um serviço de aplicação que utiliza protocolo WEB (exemplo: http, https, XML, etc.) independente da linguagem, sistema operacional e que suportam aplicações ponto a ponto ou aplicações distribuídas.

O princípio de funcionamento de um Web Services. Uma **arquitetura de ponto-a-ponto** entre dois computadores(cliente e servidor), a comunicação utiliza um protocolo Web que é uma **regra de comunicação**.

Um Web Service disponibiliza uma funcionalidade na web, através do protocolo HTTP e suas funcionalidades variam muito e dependem do tipo e forma de negócio da empresa.

**Código de acordo com o tipo de conteúdo**

É comum a utilização em soluções web que retorne um arquivo PDF, uma imagem, um arquivo     compactado, etc. Para isso é apresentado alguns tipos de conteúdos (os mais utilizados):

|Código | Tipo de Conteúdo |
|----------|----------------|
| application | json JSON |
| application | xml XML |
| application | zip ZIP |
| application | pdf PDF |
| text | plain TXT |
| text | css CSS |
| text | html HTML |
| image | png PNG |
| image | jpeg JPEG |
| image | gif GIF |

**Criando um servidor HTTP**

_Relembrando que um servidor HTTP é um servidor web, ou seja, é um servidor no qual vai executar um site e web services._

No servidor, o cliente solicita algo utilizando o **objeto chamado “request”**. A resposta do servidor para o cliente é realizada pelo **objeto chamado “response”**.

EX:

````JavaScript

const http = require('http');

var server = http.createServer(function (request, response){

    response.writeHead(200, {"content-type": "text/plain"});

    response.end("opa, tamo funcionando");
});

server.listen(3000);
console.log("Servidor iniciado em 'link do servidor'")

````

## Função Callback

A função callback tem como tradução literal “chamada de retorno”, porém em programação Node.JS é vista como uma função de retorno.

Ela é executada (não imediatamente), a aplicação que chama o servidor (web Server) continua a executar outras funcionalidades. Quando o servidor termina de resolver aquela chamada, ele faz um “callback”, isso é, retorna para a aplicação que direcionou.

Exemplo anterior só que com callback???:

````JavaScript

const http = require('http');

var callback = function(request, response){

    response.writeHead(200, {"content-type": "text/plain"});

    response.end("opa, tamo funcionando");
};

var server = http.createServer(callback);

server.listen(3000);
console.log("Servidor iniciado em 'link do servidor'")

````

## Rotas no Servidor com HTTP

Até o presente momento, estamos acessando um único arquivo, apenas uma rota, chamado de rota raiz, uma vez que não existe outra é a principal, acessada no IP (localhost – 127.0.0.1) e através da porta 3000 (em nosso exemplo).

Os caminhos de cada rota são chamados de **URI (Uniform Resource Identifier ou Identificador de Recursos Universal)** que é o _identificador de um recurso_ (imagem, site, etc.), pois tudo o que está disponível na internet precisa de um identificador único para que não seja confundido.

O recurso do Web Service é dividido em algumas partes:

* Primeiro temos o protocolo, que não obrigatoriamente precisa ser um http, isso irá depender do tipo de serviço requisitado, em nosso caso, como estamos focando em soluções web, vamos adotar o HTTP como protocolo padrão.
* Na sequência temos a **URL** que pode ser direcionado por um IP (Internet Protocolo) ou URN (Uniform Resource Name ou Nome de Recursos Universal);
* A porta que será acessado o Web Service (programada previamente) e na sequência a URI que vai identificar a rota do serviço utilizado.

EX: HTTP(protocolo)//localhost(URL):3000(porta)/rota1(URI)

Exemplo de código:

````JavaScript

const http = require('http');
const url = require('url');

var callback = function(request, response){

    response.writeHead(200, {"content-type": "text/plain"});

    var parts = url.parse(request.url);

    if(parts.path === "/"){
        response.end("Site Principal");

    } else if (parts.path === "/rota"){
        response.end("Página 2");

    }else{
        response.end("Rota Inválida Fi:" parts.path);
    }

};

var server = http.createServer(callback);

server.listen(3000);
console.log("Servidor iniciado em 'link do servidor'")
````

## Arquicos em web service

Uma forma interessante de utilizar com web service é através da requisição retornar arquivos.
Importante que todos os arquivos estejam todos no mesmo diretório no qual vai constar o projeto JavaScript. Recomenda-se deixar no caminho padrão.

Para utilizar arquivos há necessidade de se utilizar a f**unção readFile(response, file)** que fará a leitura do arquivo JSON e enviará o seu conteúdo na resposta(response) no site em questão.

A programação inicialmente necessita adicionar o **modulo “fs”** no qual disponibiliza diversas funcionalidades úteis para acessar e interagir com o **file system**.

Exemplo de código:

````JavaScript

const fs = require('fs');
const http = require('http');
const url = require('url');

function readFile(response, file){
    fs.readFile(fule, function(err, data){
        response.end(data);
    })
}

var callback = function(request, response){

    response.writeHead(200, {"content-type": "application/json; charset=utf-8"});

    var parts = url.parse(request.url);
    var path = parts.path;

    if(parts.path === "/"){
        response.end("Site Principal");

    } else if (parts.path === "/rota"){
        readFile(reponse, "jsonPrincipal.json");
    }else if (parts.path === "/rota/segundoJson"){
        readFile(response, "jsonSecundario.json");
    }else {
        response.end("Rota não mapeada Fi:" parts.path);
    }

};

var server = http.createServer(callback);

server.listen(3000);
console.log("Servidor iniciado em 'link do servidor'")
````