# Aula 03

## Capítulo 2 do livro - Design Centrado no Usuário (DCU)

### 2.1 Princípios do DCU

O DCU é uma abordagem para desenvolver sistemas interativos **focados no usuário**. Levando em consideração as necessidades, limitações, contextos e etc.
A proposta do DCU é que a qualidade da interface/experiência resulta não só da funcionalidade do sistema, mas de como o **usuário percebe, utiliza, e vivência** o sistema.

#### 2.1.1 Fundamentos filosóficos e históricos 

 O surgimento do DCu está profundamente relacionado ao IHC e da usabilidade especialmente nas décadas de 1980 1990. Pois nesse período os técnicos estavam percebendo que muitos sistemas bons, _"falhavam"_ por serem difíceis de usar.

Inpirado em princípios da **engenharia cognitiva** e da **psicologia do usuário**, o DCU busca alinhar os objetivos do sistema com os modelos mentais dos usuários.
Donald Norman defende que os sistemas devem ser _"Inteligentemente burros"_, ou seja simples, previsíveis e consistentes, _mesmo que seja necessário o ocultar a complexidade do código subjacente_.
O DCU Também se fundamenta em valores éticos e sociais, pra isso aborda práticas como **testes com usuários reais, feedback contínuo e melhoria interativa**.

#### 2.1.2 Definições normativas: ISO 9241-210

A ISO 9241-210 Define o DCU como: Uma abordagem ao design de sistemas interativos que visa tornar os sistemas _utilizáveis_, centrando-se na utilização do sistema, na compreensão e no contexto do usuário, com uma **participação ativa** do usuário ao longo de todo o processo de projeto e desenvolvimento.

Segundo a norma, os **princípios fundamentais** do DCU são:

* O design baseado na compreensão explícita dos usuários tarefas e ambientes. Isso significa que o projeto de interface começa com estudo sistemático dos usuários reais;
* Os usuários estão envolvidos ativamente durante todo o processo de design e desenvolvimento. Usuários reais são consultados desde a fase de concepção até o lançamento e manutenção;
* O design e impulsionado e refinado por meio da avaliação centrada no usuário. Prototipagem e testes com usuários devem ser realizados em ciclos iterativos.
* O processo é iterativo. O DCU prevê ciclos de design, prototipagem, teste e reformulação. A interação com os usuários não é pontual, mas contínua.
* O design atende a toda a experiência do usuário. Vai além da interface visual ou da funcionalidade, considera emoções, expectativas e etc
* A equipe de projeto é multidisciplinar. O sucesso do DCU depende da colaboração entre designers, engenheiros e etc.

#### 2.1.3 O papel do usuário no DCU

O ponto central do DCU é a valorização do usuário como **especialista de sua própria experiência**. Isso não quer dizer que o usuário irá tomar as decisões de design, mas sim que sua perspectiva deve ser respeitada, investigada e integrada ao projeto.
O DCU valoriza também a diversidade de perfis, reconhecendo que diferentes pessoas podem interagir de formas distintas com o sistema.

O _design universal_ se baseia em sete princípios estabelecidos por _ron mace e equipe_:
* Uso equitativo;
* Flexibilidade no uso;
* Simples e intuitivo;
* Informação perceptível;
* Tolerância a erros;
* Baixo esforço físico;
* Tamanho e espaço apropriados para uso;

### 2.2 Etapas do processo de design

O processo de design centrado no usuário é caracterizado por uma estrutura **iterativa, participativa e orientada a dados impíricos**, as etapas mais comuns dos modelos para esse processo seriam:
* Entendimento do contexto;
* Especificação de requisitos;
* Geração de soluções;
* Prototipagem;
* Avaliação com usuários;
* Refinamento;

Essas etapas não ocorrem necessáriamente de forma linear, elas ocorrem em _ciclos sucessivos de aprimoramento_.

#### 2.2.1 Entendimento análise do contexto de uso
O DCU começa compreendendo profundamente o **contexto de uso** do usuário. Esta etapa visa mapear:
* Quem são os usuários(idade, perfil, etc);
* Quais tarefas serão realizadas;
* Em quais ambientes ocorrerá a interação(Fisíco, social, tecnológico);

Esses levantamentos podem ser realizados por meio de:
* Entrevistas;
* Observações;
* Shadowing;
* Diários de uso;
* Etnografia;
* Análise de stakeholders;
* Mapas de Empatia;

A meta aqui é evitar suposições e tomar decisões com base em dados reais. Afinal um erro comum é considerar os usuários _"Iguais a nós"_, o que leva a decisões enviesadas.

#### 2.2.2 Definição e Especificação de Requisitos

Após compreender o contexto devemos definir os **requisitos funcionais e não funcionais**, dando ênfase nas necessidades dos usuários. Aqui indentificamos:
* O que o sistema deve fazer(funções essenciais);
* Como ele deve se comportar(desempenho, usabilidade, acessibilidade, segurança);
* Quais restrições devem ser consideradas(tecnológicas, orçamentárias, legais);

Os requisitos não devem ser definidos apenas pelos desenvolvedores ou gestores. Os usuários devem participar ativamente da construção dessa lista também.
Ferramentas como:
* Personas;
* Cénarios de uso;
* Mapas de jornada do usuário;
* Histórias de Usuário(user stories)

Essas ferramentas ajudam a dar vida aos requisitos, tornando-os mais compreensíveis e reais.

#### 2.2.3 Geração de soluções e ideação

Após a definição de requisitos, iniciamos a de **exploração de soluções/Ideação**, o foco aqui é gerar diversas possibilidades de solução para os problemas encontrados.
Métodos usados nessa etapa:
* Brainstorming;
* Cocriação com usuários;
* Design Participativo;
* Mapas Mentais;
* StoryBoards;
* Sketches;
* Benchmarking;

#### 2.2.4 Prototipagem

Nessa etapa criamos protótipos baseados nas melhores soluções encontradas na etapa anterior. Tais protótipos podem variar em fidelidade, complexidade e interatividade;
* Protótipos de baixa fidelidade: esboços em papel, wireframes, floxugramas;
* Protótipos de média fidelidade: maquetes digitais com navegação limitada;
* Protótipos de alta fidelidade: simulações próximas do produto final, com visual e interatividade completos;

#### 2.2.5 Avaliação e testes com usuário

Agora que temos os protótipos, realizamos uma avaliação **centrada no usuário**, algumas formas de realizar essa avaliação:
* Testes de usabilidade: usuários executam tarefas enquanto são observados;
* Entrevistas pós-teste: coleta de percepções e sentimentos;
* Análise de Métricas: Tempo de execução, erros, cliques, taxa de sucesso;
* Testes A/B: Comparação entre variações de interface;
* Eye tracking: Mapeamento do olhar sobre a interface;

Esses testes devem ser feitos com usuários reais, em situações reais ou simuladas. E os resultados devem retroalimentar o processo de design.

#### 2.2.6 Iteração e Refinamento

Um dos **pilares** do DCU é a **iteratividade do processo**. Pois as avaliações são o começo de novos ciclos, os dados coletados devem orientar alterações.
Esse **Refinamento contínuo** garante que o sistema evolua em sintonia com as necessidades do usuário.

### 2.4 DCU na Prática profissional

No contexto Profissional a DCU tem se tornado um diferencial competitivo e um aliado na criação de produtos que realmente atendam ás necessidades e expectativas dos usuários.

#### 2.4.1 Integração do DCU no fluxo de trabalho

Para emplentar o DCU em empresas e projetos, é necessário primeiro, uma mudança na cultura organizacional. Essa transformação passa pela conscientização de que o foco na UX não é uma coisa extra. Nesse sentido, a adoção do DCU demanda:
* Capacitação da equipe: Investir em treinamentos para que profissionais de diversas áreas compreendam os fundamentos e a importância da DCU.
* Metodologias ágeis e colaborativas: Frameworks como o scrum e o design thinking facilitam a integração do feedback dos usuários no processo iterativo
* Ferramentas de prototipagem e testes: A utilização de ferramentas digitais para a criação de protótipos, aliada a métodos de teste, é fundamental para materializar as hipóteses de design e validaras soluções propostas.

#### 2.4.3 Metodologias de avaliação e mensuração de resultados

Uma parte essencial da aplicação da DCU é a mensuração dos resultados e o refinamento constante do sistema. Algumas das metodologias usadas para isso seriam:
* Testes de Usabilidade: Medem a facilidade com que os usuários executam tarefas específicas. Estudos qualitativos/quantitavos permitem identificar gargalos e oportunidades de melhoria.
* Entrevistas e grupos focais: Coletam feedback detalhado sobre a experiência dos usuários, possibilitando uma análise profunda dos pontos positivos e negativos da interface.
* Análise de métricas digitais: utilizam-se ferramentas de análise para mapear comportamento dos usuários em tempo real.
* Testes A/B: Permitem comparar diferentes versões de um mesmo elemento ou funcionalidade, identificando qual abordagem gera melhores resultados em termos de engajamento e conversão.

#### 2.4.4 Desafios e lições aprendidas na prática profissional

* Gerenciamento de expectativas: Em muitos casos, há uma discrepância entre o que os usuários dizem desejar e o que realmente precisam.
* Equilíbrio entre inovação e usabilidade: Inovar na interface sem comprometer a usabilidade pode ser um desafio. Produtos que tentam incorporar inovações tecnológicas sem considerar a familiaridade dos usuários frequentemente resultam em interfaces confusas e de baixa aceitação.
* Integração de feedback em ciclos curtos: Garantir que o feedback dos usuários seja incorporado de forma rápida e eficaz no ciclo de desenvolvimento exige processos bem definidos e uma comunicação eficaz entre as equipes.
* Aspectos éticos e de privacidade: Coletar dados de usuários para testes de análise deve sempre respeitar as normas de privacidade e as legislações vingentes.

