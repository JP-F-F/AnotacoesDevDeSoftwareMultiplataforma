# TP_06

## Introdução

**Padrões de Projeto**:
Abstrações genéricas que ocorrem nas aplicações;

**Desenvolvimento baseado em componentes**
Sistemas desenvolvidos pela integração de componentes;

``Ele menciona frameWorks aqui mas tá errado, então vou corrigir``

**Bibliotecas(Que é diferente de framework)**
Coleção de classes abstratas e concretas que podem ser adaptadas e estendidas para criação de aplicações.

**Empacotamentos de Sistemas Legados**
Interfaces podem ser definidas para prover acesso a sistemas legados.

**Sistemas orientados a serviços**
Sistemas desenvolvidos pela ligação com serviços compartilhados;
Serviços podem ser internos;

**Linhas de produto de aplicação**
Tipo de aplicação generalizado em uma arquitetura comum que pode ser adaptada de diferentes modos para diferentes clientes.

**Integração de COTS(commercial off-the-shelf)**
Termo que permite desenvolver a partir de componentes já criados e realizar adaptações.
Sistemas desenvolvidos pela integração de aplicações existentes.

**Aplicações Verticais Configuráveis**
Desenvolvimento de sistemas genéricos que podem ser configurados ás necessidades de um sistema específico.

Os projetos devem ser capazes de solucionar o problema atual mas também devem ser flexíveis para serem reutilizados no futuro.

Bons projetistas de software reutilizam soluções já existentes(padrões de projeto e tal).

Padrões de projeto ajudam a reutilizar arquiteturas e técnicas testadas e aprovadas por desenvolvedores. Além de ajudar a melhorar a documentação/manutenção, ao fornecer uma expecificação explícita de interações e classes e objetos.

Reusabilidade não vem de _copiar e colar_ nem de simplesmente reaproveitar modulos de software.

**Padrões de Projeto** descrevem problemas recorrentes no projeto de sistemas e sua solução em termos de interfaces de objetos.

Padrões de projetos são as vezes confundidos com algoritmos. Pra deixar claro:
* Algoritmo - Conjunto claro de instruções/etapas para atingir um objetivo;
* Padões de Projeto - Descrição geral de uma solução;

**Padrões mais básicos** são adiomáticos, servindo as vezes apenas pra uma linguagem.
**Padrões Universais** são arquitetônicos, servindo universalmente para as linguagens.

**Critica aos padrões**

> Gambiarras para uma linguagem de programação fraca - Paul graham.

Muitas vezes a necessidade de padrões surge quando uma linguagem ou tecnologia tem uma deficiência no nível de abstração. Em casos assim os padrões ajudam bastante.

Soluções ineficientes devido a devs não adpatarem o padrão ao seu projeto.

Muitos quando aprendem essas soluções, querem aplica-las em tudo, inclusive em situções que códigos simples já resolveriam o problema.

## Catalogo de soluções - padrão gof

**Os 4 Elementos principais dos padrões**:
* **Nome do padrão** - É importante para descrever o problema e suas soluções.
* **Problema** - Descreve quando aplicar o padrão, detalhes de estruturas de classe e condições necessárias
* **Solução** - A solução apresenta uma forma genérica de resolver o problema, sem mostrar nenhum projeto.
* **Consequências** - São as vantagens e desvantagens de aplicar o padrão.

Alguns autores sugerem que tambem estão presente nos padrões de projetos:
* O **PROPÓSITO** do padrão descreve brevemente o problema e a solução.
* A **MOTIVAÇÃO** explica a fundo o problema e a solução que o padrão torna possível.
* As **ESTRUTURAS DE CLASSES** mostram cada parte do padrão e como se relacionam.
* **EXEMPLOS DE CÓDIGO** em uma das linguagens de programação populares tornam mais fácil
compreender a ideia por trás do padrão.

Alguns catálogos de padrão listam outros detalhes úteis, tais como a aplicabilidade do padrão, etapas de implementação, e relações com outros padrões.

Padrões de projeto são classificados apartir de 2 critérios.

**Classificação quanto ao escopo**: Especifica se o padrão se aplica pra objetos ou classes.
* Classes: Trata do relacionamento entre classe e subclasse.
* Objeto: Trata relacionamentos entre objetos.

**Classificação quanto ao seu propósito**
* **PADRÕES CRIACIONAIS** – CRIAÇÃO (CREATIONAL): Se preocupam com o processo de criação de objetos. Todos os Padrões Criacionais tratam da melhor maneira como instanciar objetos;
* **PADRÕES ESTRUTURAIS (STRUCTURAL)**: Lidam com a composição de classes ou de objetos. Descrevem como classes e objetos podem ser combinados para formar grandes estruturas; Objetos padrões descrevem como objetos podem ser compostos em grandes estruturas utilizando composição ou inclusão de objetos com outros objetos.
* **PADRÕES COMPORTAMENTAIS (BEHAVIORAL)**: Caracterizam as maneiras pelas quais classes ou
objetos interagem e distribuem responsabilidades. Descreve padrões de comunicação entre
objetos ou classes. Caracteriza o modo como classes e objetos interagem e compartilham
responsabilidades.