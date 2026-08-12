# IHC - aula 05 - Requisitos de IHC e levantamento de dados

## Tipos de requisitos: funcionais e não funcionais

**O sucesso de um sistem iterativo começa com a correta definição dos requisitos**

Os requisitos não se limitam somente as funcionalidades do sistema, mas envolvem **aspectos qualitativos da interação**, como _usabilidade, acessibilidade, desempenho e satisfação do usuário_

Requisitos seriam **as especificações formais e informais que definem o que o sistema deve fazer e como ele deve se comportar.**

### Requisitos funcionais

Estes decrevem **o que o sistema deve fazer**, ou seja suas funcionalidades e comportamentos esperados de acordo com as ações do usuário.
> Requisitos Funcionais são declarações de serviços prestados pelo sistema sommervile(2011)
incluindo:

* Entradas que o sistema deve aceitar;
* Saídas que o sistema deve produzir;
* Regras de processamento;
* Reações a comandos do usuário;
* Interação com outros sistemas;

> No contexto de IHC esses requisitos devem **antecipar os comportamentos esperados da interface**c como fluxos de navegação, ações disponíveis de cada tela e reações aos comandos do usuário (Garrett, 2011)

### Requisitos não funcionais

Esses requisitos que não estão diretamente ligados a funções do sistema, mas sim as qualidades que o sistema deve ter. Como:
* Usabilidade;
* Acessibilidade;
* Eficiência;
* Confiabilidade;
* Escalabilidade;
* Segurança;
* Portabilidade;
* Estética;

> Esses requisitos são críticos no contexto de IHC, pois definem a experiência de uso. (Pressman 2016)

### Requisitos de Interface 

Essa categoria de requisitos está somente ligada ao ambito de IHC, esses requisitos são uma _intersecção entre os requisitos funcionais e não funcionais_, eles especificam:
* Layouts e componentes da interface;
* Fluxos de interação;
* Regras de navegação;
* Tipos de controle(botões, sliders, campos);
* Comportamentos esperados em ações do usuário;
* Feedback visual, sonoro e tátil;

> A especificação de requisitos de interface requer uma proximidade do usuário real, pois suas preferências, necessidades e limitações impactam diretamente a escolha das soluções de interação (Nielsen, 1993)

### A importância da clareza e testabilidade

Independe da categoria, os requisitos devem ser:
* Claros, evitando ambiguidade/subjetividade;
* Mensuráveis, com critérios objetivos de verificação;
* Rastreáveis, associados as funções, personas ou contextos específicos;
* Prioritários, com definição de importância ou urgência;

> Requisitos mal definidos ou ambíguos são uma das principais causas de fracassos em projetos de software, gerando expectativas não atendidas e retrabalho durante a implementação(Sommerville, 2011)

## Métodos de coleta de dados

A coleta de dados é uma etapa fundamental para o levantamento de requisitos. Por meio de métodos qualitativos e quantitativos, é possível identificar precisamente as necessidades do usuário, os contextos de uso, os comportamentos reais e as expectativas quanto ao sistema.

> A combinação de múltiplos métodos conhecida como triangulação, é recomendada para garantir maior validade e confiabilidade dos dados obtidos(Dix et al. 2004)

### Classificação dos métodos

Esses métodos podem ser classificados em diferentes categorias, conforme **grau de estruturação, envolvimento do usuário, abordagem metodológica e tipo de dado coletado**

**Quanto a estrutura**:
* Estruturados: com roteiro fixo e padronizado(ex:questionários fechados);
* Semiestruturados: com roteiro flexível(ex: entrevistas);
* Não estruturados: livres e exploratórios(ex: observação etnográfica);

**Quanto a natureza do dado**:
* Quantitativos: números, métricas, estatísticas;
* Qualitativos: percepções, sentimentos, narrativas;

**Quanto a abordagem**:
* Diretos: o usuário é questionado ou participa ativamente;
* Indiretos: o comportamento do usuário é registrado sem intervenção;

**Quanto a temporalidade**:
* Sincrônicos: realiazados em tempo real(ex: entrevistas presenciais);
* Assíncronos: realizados em momentos diferentes(ex: formulários online);

### Análise de logs e métricas digitais 

Em sistemas já existentes, é possível coletar dados sobre o comportamento do usuário a partir de **registros automáticos(logs)**.
Metricas comuns:
* Número de acessos e tempo de permanência;
* Cliques em elementos da interface;
* fluxos de navegação;
* Taxa de conversão e abandono;
* Dados de uso por dispositivos, localização, perfil;

**Vantagens**:
* Dados objetivos e em larga escala;
* Aplicável a qualquer sistema online;
* Permite acompanhamento contínuo;

**Desvantagens**:
* Não explica os "porquês" do comportamento;
* Exige cuidado com privacidade e ética no uso de dados;

### Técnicas complementares

Outros métodos também são utilizados no levantamento de dados pra IHC:

* **Diários de uso**: usuários anotam suas experiências ao longo do tempo;
* **Workshops de cocriação**: usuários participam da geração de ideias;
* **Analise de tarefas**: descrição passo a passo das ações do usuário;
* **Mapas de empatia**: visualização dos sentimentos, pensamentos e dores do usuário;
* **Card sorting**: organização de conteúdos por categorias;
* **eye tracking**: rastreamento ocular em tempo real;

> A escolha dos métodos deve considerar o objetivo do projetom o perfil dos usuários, os recursos disponíveis e o tempo de execução(Shneiderman et al., 2016)

## Entrevistas questionários e observações

As técnicas de **entrevista, questionários e observações** são amplamente utilizadas para o levantamento de dados para definição de requisitos. Embora sejam técnias distintas em abordagem e profundidade, elas pode ser **combinadas estrategicamente** conforme o estágio do projeto, os objetivos da investigação e o perfil do público-alvo.

### Entrevistas