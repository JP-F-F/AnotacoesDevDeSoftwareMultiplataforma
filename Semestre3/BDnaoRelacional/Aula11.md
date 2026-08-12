# BD não ralacional - Aula 11 - Teoria! Modelagem NoSQL Definições e Motivação

**A fundação da modelagem de Dados**

**O condeito Universal**: Um processo fundamental em sistemas de banco de dados que envolve a definição da estrutura. Define rigorosamente como os dados são armazenados, organizados e acessados.

**A abordagem NoSQL**: Uma abordagem específica para a nova geração não-relacional. Exige repensar as fundações devido ás diferenças cruciais na forma de gerenciar e consultar as informações.

**Relacional VS. NoSQL**

| | Bancos Relacionais | Bancos NoSQL |
|-|--------------------|--------------|
|Armazenamento| Dados confinados em tabelas| Formatos Diversos(Documentos, grafos, chave-valor)|
|Estrutura(Schema)| Esquemas rígidos e estritamente pré-definidos| Estruturas Dinâmicas adapatáveis e flexíveis|
|Foco no design| Mapeamento de relacionamentos complexos| Otimização para formas específicas de gerenciamento e consulta|

**Esqueça as TABElAS. Pense na APLICAÇÃO**

Prioridades NoSQL:
* **Acesso**: como exatamente os dados serão acessados?
* **Complexidade**: Qual a carga e a complexidade das consultas?
* **Escala**: Como o sistema vai crescer estruturalmente?
* **Resiliência**: Qual a tolerância a falhas exigidas?

## Os 4 pilares da motivação NoSQL

* **Volume Extremo**: Capacidade nativa para lidar com volumes cada vez maiores e estruturas de dados altamente complexas.
* **Desempenho Superior**: Resolução de gargalos de velocidade que os BDs relacionais/tradicionais não conseguem enfretar.
* **Escalabilidade**: Arquitetura projetada para crescimento/distribuição fluida de recursos.
* **Flexibilidade**: Eliminação da fricção causada por esquemas rígidos, permitindo evolução contínua.

## Modelagem NoSQL: definições e motivação

A modelagem de dados é um processo fundamental em sistemas de bancos de dados, que envolve a **definição da estrutura dos dados** a serem armazenados e a **maneira como esses dados serão organizados e acessados**.

Em vez de pensar em termos de tabelas e relacionamentos, é necessário considerar as características e requisitos específicos do banco de dados NoSQL em questão, como a forma como os dados serão acessados, a complexidade das consultas, a escalabilidade e a tolerância a falha.

Na modelagem de dados para bancos de dados NoSQL, é necessário levar em consideração a es**trutura específica do banco de dados**, bem como as **necessidades e requisitos** do sistema que irá utilizar esses dados.

Por exemplo, se estivermos trabalhando com um banco de dados NoSQL baseado em **documentos**, como o MongoDB, _podemos criar um modelo de dados que agrupe informações relacionadas em documentos_, que podem ser aninhados e indexados para facilitar a consulta.
Se estivermos trabalhando com um banco de dados NoSQL baseado em **grafos**, como o Neo4j, podemos modelar dados como _nós e arestas_, que representam entidades e relações, respectivamente

Em resumo, a modelagem NoSQL é uma **abordagem específica de modelagem de dados** para bancos de dados NoSQL, que envolve _considerações diferentes daquelas usadas na modelagem de dados para bancos de dados relacionais tradicionais_.
Essa abordagem é motivada pela **necessidade de lidar com volumes maiores e mais complexos de dados**, bem como pelos desafios de escalabilidade, desempenho e flexibilidade que muitos bancos de dados relacionais tradicionais não conseguem enfrentar.

## Sites para leitura

[site1](http://www.devmedia.com.br/banco-de-dados-nosql-um-novo-paradigma-revista-sql-magazine-102/25918)
[site2](https://dicasdeprogramacao.com.br/6-motivos-para-usar-bancos-de-dados-nosql/)