# Aula 04 - Dados estruturados e não estruturados -MySQL ou MariaDB

O **MariaDB** foi criado com o intuito de fornecer uma alternativa de código aberto robusta e independente após a aquisicação da mySQl pela oracle.
As aplicações desenvolvidas en MySQL podem ser **migradas** para MariaDB quase sem qualquer alterações.

O MariaDB é um sistema de gerenciamento de banco de dados relacional (RDBMS) de código aberto que é uma bifurcação (fork) do MySQL.

O MariaDB é um RDBMS, o que significa que ele é baseado em um modelo de dados relacional.

## Introdução ao JSON

**O que é?**: Um formato de texto leve pra troca de dados entre sistemas.
**Por que usar?**: Fácil de ler e escrever para humanos e máquinas, e é suportado por quase todas as linguagens de programação.

**A anatomia de um JSON**:

As chaves de um json são sempre colocadas como _strings_.

````javascript

{
    //Chave | Valor
    "Nome":  "Juan";
    "Idade": 21;
    "Casado": true;
}

````

O sql permite que **armazenemos documentos JSON não estruturados dentro de um coluna de tabela estruturada**;
O JSON nativo oferece o melhor dos dois mundos: **Integridade dos BDs relacionais** com a **flexibilidade da notação de objetos**

O JSON nativo permite que o BD entenda a estrutura interna do documento. Facilitando assim as pesquisas que podem ser feitas a partir de uma única coluna.

**Como inserir o JSON dentro de uma tabela relacional**

````
VALUES('João', '{\"idade": 30, "endereço": "Algum lugar"});
insert fatec values (2, '{"nome": "joão", "idade": 30, "casado": true, "filhos": ["Maria", "Pedro"] }');

````

Podemos usar a função JSON_PRETTY para extrair e visualizar os dados de um JSON no MySQL;   
``SELECT JSON_PRETTY(dados) AS JSON_DOCUMENTO from clientes``

O JSON é amplamente utilizado em aplicações web e mobile para a troca de dados entre o cliente e o servidor.

## Serialização de uma classe

A serialização de uma classe é o processo de **transformar um objeto da classe** em um **formato que possa ser armazenado em um arquivo ou enviado através de uma rede**.
Esse processo é usado para permitir que os objetos sejam armazenados ou transmitidos de uma maneira que possa ser reconstruída mais tarde, mantendo todas as suas informações

Muitas linguagens de programação atuais fornecem esse recurso seja atrávess do JSON ou do XML.

Além disso, muitas vezes é possível personalizar a serialização de uma classe, definindo como os atributos serão serializados e deserializados.

## JSON no MySQL

O tipo de dados JSON no MySQL permite que você armazene dados em formato JSON e use funções JSON para manipular esses dados.