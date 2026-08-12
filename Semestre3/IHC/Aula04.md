# Aula 04 - Personas

[Nessa aula o professor deixou esse artigo para lermos](https://guia.dev/pt/pillars/business/personas.html).

Persona é a representação **fictícia do cliente ideal para um negócio**. É baseada em dados e características de clientes reais como: comportamento, dados demográficos, problemas, desafios e objetivos.

## Persona VS Atores

Um ator nas definições de UML, é a representação de um papel ou tipo de usuário dentro de um caso de uso.Desta forma um ator não possui profundidade com relação a quem de fato pode ser esse usuário.
**O que acaba criando softwares difíceis de usar.**

A persona nasceu justamente para aprofundar a visão com relação aos atores. Abaixo um comparativo que ilustra melhor a diferença entre eles:

![Tabela de comparação ator vs persona](../Imagens/TblAtorXpersona.png)

Uma persona não substitui em todas as situações a figura do ator, principalmente quando o usuário do software refere-se a um **sistema ou dispositivo**.

## Personas do Negócio

As personas normalmente são elaboradas pelos profissionais de design, produto, negócio ou marketing.
**Elas são fruto de um trabalho de pesquisas com clientes ou possíveis clientes.**

Algumas dicas no uso de personas no dia a dia:

* Tornar visível a todos nos times de desenvolvimento.
* Novas personas e atualizações podem ser apresentadas verbalmente aos times.
* Novos integrantes em um time devem ser “apresentados” as personas.
* Apresentações e/ou demonstrações de entregas podem usar as personas, reforçando a memória dos times e revalidando sempre o propósito do software de atendê-las.

## Tipos de persona

**Buyer Personas**: representam o consumidor e são na maioria dos casos as personas do negócio que o software atenderá. Por ter foco no consumidor é amplamente usada no mundo de marketing.
**Proto Personas**: também representa o consumidor, porém é criada através de sessões de brainstorming realizadas pela própria empresa sem usar dados de pesquisas com os cliente.
**Audience Personas**:  representam o perfil dos usuários que consomem materiais da empresa. É usada com a finalidade de aumentar a audiência e visibilidade da marca.
**Brand Personas**: está direcionada a composição de como as pessoas veem a empresa.

As personas não possuem uma limitação com relação ao contexto aplicado, desta forma, áreas como a de suporte ao cliente e operação de TI, embora não sejam o cliente da empresa, demandam necessidades ao software.

## Suporte ao cliente como persona

**Um software bem construído quando é entregue não deve depender mais das pessoas que o codificaram.**

Partindo deste ponto, deve ser possível que o suporte ao cliente seja realizado por _times que não participaram da codificação do software_.

É bom que o time de desenvolvimento auxilie as vezes, mas eles não podem ser a única solução pra esses problemas.

Elaborar uma persona focada no perfil das pessoas que farão o suporte ajudará aos times tratarem de forma adequada essa necessidade

Sobre esse tipo de persona, é importante então que times de desenvolvimento avaliem a cada entrega questões como:

* Se ocorrer algum problema com essa funcionalidade, o suporte conseguirá atuar?
* A forma de resolução dos problemas será amigável ou o suporte terá que saber “coisas de dev”.
* Se não houver resolução, terá que recorrer ao time de desenvolvedores(as)? O que pode ser feito para evitar isso?

## Operação de Ti como persona 

Manter o software em execução, monitorá-lo e analisar desempenho são algumas das tarefas que um time de operação pode realizar. É adequado que isso possa ser realizado **sem a dependência** de desenvolvedores(as), logo os times de desenvolvimento precisam então considerar como viabilizar isso durante a implementação.

Sobre esse tipo de persona, é importante então que times de desenvolvimento avaliem a cada entrega questões como:

* Os serviços de monitoramento poderão coletar e acompanhar todas as informações necessárias que o time de Operações precisa?
* Em casos de falhas na execução da aplicação, o time de Operações terá condições de restabelecer o adequado funcionamento?
* Todas as informações para implantação e execução do software estão disponíveis ao time de Operações, ou há dependências do time de desenvolvedores(as)?
