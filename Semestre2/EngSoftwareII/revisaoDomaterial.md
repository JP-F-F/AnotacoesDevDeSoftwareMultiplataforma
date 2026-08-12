**Software** = instruções que quando realizadas produzem a função e desempenho desejado/estruturas de dados que permitem manipular informações/Documentos que descrevem o uso e operação do programa.

## Domínios de aplicação de software

* **Software de sistema** - Conjunto de programas que ***atende a outros programas***. Alguns sistemas processam estruturas de informações complexas, mas determinadas. E 4 outras aplicações de sistema processam dados amplamentes indeterminados.
* **Software de aplicação** - São programas independentes que solucionam uma **necessidade específica de negócio**. Essas aplicações processam **dados comerciais ou técnicos** de uma forma que fique mais fácil as _operações administrativas e tomadas de decisão técnicas/administrativas_.
* **Software de engenharia/científico** - Uma ampla variedade de programas de **"cálculo em massa"**, desde astronomia, hábitos de consumo e etc.
* **Software embarcado** - Reside em um produto ou sistema e é utilizado **implementar e controlar caracteristicas e funções para o usuário** e para o sistema. Executa funções **limitadas e específicas** ou funções significativas e capacidade de controle(funções digitais de automoveis).
* **Software para linha de produto** - É composto por **componentes reutilizáveis**. É projetado para prover capacidades específicas de utilização por muitos clientes diferentes. Tendem a se concentrar em um **mercado hermético e limitado/lidar com consumidor em massa**.
* **Aplicações web/aplicativos móveis** - Essa categoria voltada a redes é bem ampla, contemplando apps voltados para navegador, computação em nuvem e etc.
* **Software de Inteligência Artificial** - Usa heurísticas para solucionar problemas complexos que **não são passíveis de computação ou análise direta**.

De acordo com o IEEE [IEE17] a definição para engenharia de software seria:
Aplicação de uma abordagem sistemática, disciplinada e quantificável no desenvolvimento/operação/manutenção de um software. Isto é a **aplicação** de ES.


## As camadas da Engenharia de Software:

A **Engenharia de software** engloba **processos, métodos e ferramentas** que possibilitam a construção de sistemas complexos, dentro do prazo e com qualidade.
O _processo de software_ tem cinco _atividades estruturais_: **comunicaçõa, planejamento, modelagem, construção e entrega**.

* **Ferramentas** - fornecem **suporte automatizado** ou semiautomatizado para os processos e para os metódos(as camdas superiores a essa). Quando integramos ferramentas e as tais geram informações que possam ser utilizadas por outras ferramentas, se estabelece um _sistema_ para o suporte ao desenvolvimento de software, chamado **Engenharia de Software com o auxílio do computador**

* **Métodos** - fornecem as **informações técnicas** para desenvolver o software. Estes envolvem uma variedade de tarefas, que incluem: **comunicação, análise de requisitos, modelagem de projeto, construção de programa, testes e suporte**. Os métodos se baseiam no conjunto de princípios básicos que governam cada área da tecnologia, incluindo atividades de **modelagem e outrasd técnicas descritivas**.

* **Processo** - Define uma metodologia que deve ser estabelecida para a entrega efetiva de tecnologia. O processo é a **base para o controle do gerenciamento de projetos** e estabelece o **contexto que será aplicado os métodos técnicos**, são produzidos **artefatos** e estabelecidos **marcos**.

O fundamento principal da ES é a **Qualidade**. Que deve estar fundada em um **comprometimento organizacional**. A gestão da qualidade total, ou seis Sigma e filosofias similares.

## O BPM(business process mangement) com a Metodologia BPMN

### O que é BPMN:

BPM = Um conceito que une gestão de negócios e tecnologia da informação. Se utiliza **métodos, técnicas e ferramentas** para **analisar, modelar, publicar, otimizar e controlar** processos, envolvendo RH, aplicações, documentos e outras fontes de informação.
Essa metodologia compreende um conjunto de disciplinas focadas no **mapeamento, na otimização de processos e no design e redesign** de sistemas organizacionais e de informação.
Essa metodologia mostra graficamente a descrição dos processos de negócios em modelos que facilitam a compreensão do funcionamento das organizações.
A BPM pode ainda ser vista como ciência gerencial que **analisa processos de ponta  a ponta**.
De acordo com a ABPMN, processo = junção de atividades e comportamentos executados por humanos/máquinas para alcançar resultados. 
Um dos desafios básicos é gerenciar seus processos para entregar valor para seus clientes com o menor custo possível.

#### Os processos de negócio

Existem três tipos de processos de negócio, sendo eles os primários, os de apoio e os de gerenciamento.

* **Processos primários** - São as atividades vitais da organização, processos que não se limitam a um setor ou departamento, podendo ligar diversos departamentos até organizações para entregar valor ao cliente. Esses processos geram uma visão completa de toda o ciclo de vida da cadeia de criação de valor.
* **Processos de apoio** - Esses fornecem suporte aos primários. A diferença entre esses é os primários, é que os primários vão dar valor a outros processos e não aos clientes. O de apoio buscam prover uma visão especializada e funcional, auxiliando a sustentação de processos primários.
* **Processos de Gerenciamento** - Esses processos tem como objetivo gerenciar, apontar irregularidades e manter a qualidade dos outros tipos de processo, garantindo que eles atinjam suas metas. Eles támbem indicam pontos de melhorias, finalizando o ciclo de vida de BPM.

* **Nível 1 - Processos** - Representam os grandes processos da empresa, sendo chamado também de _cadeia de valor_/_Macro-processos_. EX: Vendas
* **Nível 2 - Sub-processos** - É a decomposição de um processo nos seus componentes principais, pode ou não representar a lógica e as regras entre os sub-processos. EX: Cadastrar cliente.
* **Nível 3 - Atividades** - É a decomposição de um sub-processo em suas principais atividades. Geralmente representamos a lógica e as regras de negócio, evitando os detalhes operacionais.
* **Nível 4 - Tarefas** - São os passos necessários pra completar uma atividade e representam as ações operacionais detalhadas. EX: Preencher campo matrícula CPF.

Quando vamos fornecer a descrição dos processos de negócio, utilizamos uma linguagem de modelagem gráfica. Dentre as diversas notações de modelagem de processos, se destaca a **Bussiness Process Modeling Notation(BPMN)**, por ser a mais utilizada.
O **BPMN** é um padrão de linguagem comumente usado para descrever processos em BPM.

**A BPMN** possui uma vários elementos básicos(evento, atividade/tarefa, artefatos, gateway e raia) usados para representar ações e determinar o comportamento de um processo.
Descrevendo os elementos:

* **Evento** - é algo que acontece durante o fluxo de um processo e causa impacto no mesmo, o que acarreta em uma ação que pode iniciar a execução de um novo processo, podendo alterar o caminho dele, seu comportamento, afetar a execução ou ainda finalizá-lo e concluí-lo.
Existem 3 tipos de evento:
    * iniciais - indicam o ínicio de uma nova instância do processo;
    * intermediários - acontece entre o começo e o fim do processo;
    * finais - indicam o término da instância de um processo;

* **Atividade/tarefa** - representa os passos executados em um processo, podendo ser orientados a tarefas ou decompostos em subprocessos. Atividades podem ser executadas tanto por humanos(manual) quanto por máquinas(automática);

* **Artefatos** - Fornecem informações sobre o processo mas não alteram seu fluxo, complementam os diagramas com informações visuais como uma anotação no diagrama ou até como um agrupamento de componentes para realizar uma marcação visual.
    * Objeto de dados - seu objetivo é disponibilizar informações;
    * Depósito de dados - seu objetivo é fornecer uma estrutura de atualização de dados ou  informações relativas ao processo;
    * Grupo - Seu objetivo é indicar o agrupamento de elementos dentro do diagrama;
    * Anotação - Tem como objetivo de inserir informações adicionais ao diagrama.

------------------- Adicionar a imagem dos icones aqui depois------------------------

* **Raias** - Servem para agrupar elementos da modelagem. Elas são compostas por:
    * Piscinas(pool) - Representam um autor em determinado processo;
    * Pistas(lane) - Representam a subdivisão da piscina, são usadas para organizar e categorizar participantes de um processo;
    * Marcos(milestones) - Servem pra mostrar as etapas dum processo indicando a mudança de uma fase; 


### AS IS e TO-BE

Geralmente o estudo de processo de negócios começa com uma fase de descrição/fase de designer, para capturar o AS-IS/processos de negócios atuais.

Atividades dessa fase:
* O modelo de processo de negócio visita a organização-alvo;
* Lê a documentação existente;
* conduz entrevistas;
* estuda e representa as informações coletadas em processo modelo;

Já na fase de redesign é criado um modelo de processo **TO-BE** para visualizar como o processo ficará após as alterações, usando os resultados da análise e/ou nos objetivos pré-definidos como base, para adequar-se a uma nova **estratégia corporativa** ou a um **novo sistema de TI**.

Os procedimentos iniciais da BPM procuram _conhecer as estratégias corporativas_ para moldar os processos visando os **objetivos da empresa**.

## Tutorial do software bizagi??

### Intro - visão por processos

Para visualizar melhor as atividades e pessoas envolvidas em um processo ou rotina, podemos usar esquemas gráficos. qual a ordem e relação entre as atividades e setores?

Para que o processo fique bem organizado e auto-explicativo precisamos deixar as atividades em ordem de realização e tenham **descrições breves e claras**.

Gostaria de enfatizar aqui que é de **suma importância ler a documentação** da notação do BPMN pois existem **diversos tipos de eventos e simbolos**.
por exemplo temos além dos eventos gerais, os eventos de início condicional, evento intermediário condicional, evento paralelo de início e etc.

### Principais objetos no BPMN

***Eventos de compensação***
* Evento intermediário de compensação - permite lidar com compensação (????);
* Evento final de compensação - indica que o fluxo foi finalizado e é necessária uma compensação(????);

**Evento final de erro** - permite o envio de uma exceção de erro quando o fluxo chega ao fim;
**Evento de fim de cancelamento** - permite o cancelamento excepcional quando um fluxo chega ao fim(é usado apenas em subprocessos);
**Evento de término** - O processo e todas as suas atividades terminam, independentemente de haver um ou mais fluxos pendentes.

***Atividades*** - tarefa é uma ativiade simples usada para trabalhos simples que não podem ser dividos em mais detalhes.
**Alguns tipos de tarefas**:
* Serviço - a tarefa é realizada pelo sistema; 
* tarefa recebida;
* envio de tarefas;
* tarefa manual;

**Subprocessos** são atiividades compostas cujos detalhes são definidos em novo fluxo de atividades.

***Gateways*** são elementos para controlar convergências e divergências do fluxo;

|Tipo Gateway | Divergência | Convergência |
|-------------|-------------|--------------|
|Gateway Inclusivo| Quando há várias rotas disponíveis e elas podem acontecer ao mesmo tempo, mas não necessariamente ocorre todas| Sincroniza em um caminho várias rotas de divergência disponibilizadas por uma gateway inclusivo de divergência|
|Gateway Paralelo| para pontos no fluxo onde existem atividades que podem acontecer ao mesmo tempo ou em qualquer ordem| Junta várias rotas executadas em paralelo em somente uma|
|Gateway Exclusivo baseado em dados| apenas uma rota pode ser tomada entre as disponíveis, essa decisão é tomada após uma avaliação condicional| Permite que caminhos diferentes se transformem em apenas um caminho |
|Gateway Exclusivo baseado em eventos| Divide rotas que são tomadas paralelamente, após a ocorrência de uma das rotas, apenas um caminho é tomado e os outros se tornam inativos|
|Gateway Complexo| usado quando há necessidade de controlar quantas rotas concluidas são necessárias para passar á próxima tarefa| pode ser usado quando há necessidade de se tomar uma decisão completa|

***Indicativos de Fluxo***:
* Sequência de fluxo: É representado por uma seta continua que indica o caminho seguido pelo processo.
* Fluxo de Mensagem: É representada por uma seta descontinua que representa troca de mensagem entre dois processos.
* Associação: Uma associação é usada para associar informações e artefatos com objetos de fluxo. É representado por uma linha pontilhada.

***Artefatos***: 
* Anotações: Caixa de texto usada para informação adicional sobre o processo.
* Agrupamento: usado para agrupar atividades com o propósito de documentação e análise.
* Objeto de dados: Fornece informações sobre quais documentos, dados e etc são usados/utilizados no processo.
* Depósito de dados: Fornece um mecanismo para a atividade recuperar ou atualizar informações documentadas.

## Modelos de Ciclo de vida de Software(cascata, Espiral e prototipagem)

Os softwares modernos são caracterizados por **contínuas modoficações, prazos apertados** e um **foco na satisfação do cliente usuário**.
Um fundamento de todos os modelos de processo é **Entender o problema** antes de desenvolver a solução.

Essa disponibilização envolve três ações: Entrega, suporte e feedback.

A Engenharia de Software estabele cinco atividades metodológicas: _comunicação, planejamento, modelagem, construção e entrega_.

### Modelos de processos prescritivos

Esses modelos definem um **conjunto prescrito de elementos**(atividades metodológicas, tarefas, artefatos e etc) de processo e um fluxo de trabalho de processo prevísivel.

Modelos de processo de desenvolvimento de software:
* Modelo em Cascata;
* Modelo em Espiral;
* Modelo de Prototipagem;

O modelo **cascata**, chamado tambem de modelo sequencial linear, começa com a comunicação(especificação de requisitos) do cliente, avançando pelas fases de planejamento, modelagem, construção e entrega, e terminando com a manutenção continua do software desenvolvido.

No modelo de **Prototipação**, os usuários podem ter uma ideia prévia do sistema final, conforme os desenvolvedores desenvolvem o programa.
**Problemática:** O engenheiro de software pode querer fazer concessões na implementação para que o protótipo entre em operação logo. A também o problema que os envolvidos enxergam o que parece ser uma versão operacional do software.

### Comparação entre modelos

**Prós do modelo cascata**: Fácil de entender e planejar, bom para projetos pequenos e bem compreendidos, analise e testes simples e diretos.
**Contras**: Não se adapta bem a mudanças, os testes ocorrem nas fases finais do processo, o cliente só aprova no final.

**Prós da Prototipação**: O impacto das alterações aos requisitos é reduzido, o cliente se envolve bastante desde o início, funciona bem para projetos pequenos, menor probabilidade de rejeição do produto.
**Contras**: O envolvimento do cliente pode causar atrasos, desperdicio de trabalho em protótipos descartáveis, dificil planejar e gerenciar