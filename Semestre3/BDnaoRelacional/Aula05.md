# Aula 05 - Arquitetura de Banco de Dados não convêncionais 

**Evolução Do armazenamento de dados**:
|Modelo Tradicional | Novo Paradigma |
|-------------------|----------------|
|Estrutura rígida em tabelas e colunas | Banco de dados não convêncionais|
|Foco no modelo relacional estrito | Falta de estrutura rígida |
| | Formatos adaptáveis: Documentos, gráficos e objetos |

A arquitetura de _banco de dados não convencional_ é caracterizada pela **falta** de estrutura rígida de tabelas e colunas.
Em vez disso, os dados são armazenados em um formato mais flexível, como **documentos, gráficos ou objetos**.

Um exemplo de banco de dados não convencional é o _banco de dados orientado a documentos_.
Nesse modelo, os dados são armazenados em documentos que podem ter uma estrutura complexa, **com campos e subdocumentos aninhados.**
Cada documento é único e pode ser **indexado** para facilitar a recuperação de dados.

Outro exemplo é o **banco de dados orientado a grafos**, que armazena dados em _nós e arestas_ que representam **relacionamentos** entre eles.
Esse tipo de banco de dados é especialmente útil para a **análise de redes e dados relacionais complexos**.

Esses bancos de dados podem ser implementados em _ambientes distribuídos_, o que **melhora** o ***desempenho e a confiabilidade dos sistemas***.

**O paradigma não convencional(NoSQL)**:

Uma alternativa aos bancos de dados tardicionais, para empresas que precisem lidar com cenários complexos de dados.
* Flexibilidade: Sem estrutura rígida pré-definida. Armazena dados de diferentes tipos em formato adaptável.
* Escalabilidade: Capacidade de crescer e processar grandes volumes sem gargalos estruturais.
* Ambientes distribuídos: Melhora drástica no desempenho e na confiabilidade dos sistemas.

**Iniciando um projeto em BIG DATA**:

1. Definição: Quais tipos de dados serão guardados/armazenados?;
2. Origem: Onde será feita a busca e aquisição dos dados?;
3. Repositório: Desenvolvimento de um lago de dados(DATA LAKE);
4. Captura: Estabelecer formas de captura, como APIs(APPPLICATION PROGRAMMING INTERFACE);
5. Fontes: Pesquisar quais fontes disponibilizam as APIs;
6. Viabilidade: Analisar os custos e o tempo de operação;

Normalmente, para que as informações tenham uma _alta disponibilidade_, é ideal criar um **único repositório**.

No Data Lake, os dados são armazenados da mesma forma em que houve a aquisição, de maneira bruta. Esse tipo de repositório pode ser criado na nuvem.
No processo de criação do Data Lake, é importante que **todos** os membros da equipe, _desde desenvolvedores até os diretores_, participem e entendam como estão sendo organizados e armazenados os dados, para que seja eficiente a busca e resgate dos dados quando necessário.

**O conceito de Data Lake**:
* O que é: Um armazenamento que consolida grandes volumes de dados em um único local.
* A regra de Ouro: Os dados são mantidos em sua forma original/bruta no momento da aquisição, sem necessidade de estruturação ou conversão prévia.
* O benefício: Economia significativa de tempo e recursos computacionais, facilitando acesso e análise futura.
Diferente dos bancos de dados relacionais que exigem uniformidade, um data lake unifica os três tipos fundamentais de dados(estruturados, semi-estruturados, não estruturados)

**O fluxo de transformação dos dados**:

1. Fonte de dados: Múltiplas origens estrtuturadas e não estrtuturadas;
2. Data lake: Dados consolidados em formatos brutos;
3. Transformação/Poração dos dados: Processamento e higienização;
4. dados Prontos: Disponíveis para cada uso diferente - Data wareHouse(DW) e DataMarts(DM);

Outra vantagem do Data Lake é que ele é **escalável** e pode ***crescer com a quantidade de dados armazenados***. Isso significa que, à medida que seus dados crescem, você pode **adicionar mais capacidade de armazenamento ao Data Lake sem interromper o processo de análise ouo acesso aos dados**.

**A era da nuvem(Cloud computing)**

A infraestrutura essencial para bancos de dados, armazenamento e tratamento de grandes volumes de informação.

A definição oficial(NIST): Um modelo que permite acesso sob demanda via redes a um conjunto compartilhado de recursos computacionais, rapidamente provisionados e liberados com mínimo esforço administrativo.

**Modelos de nuvem**:
1. Nuvem Pública: Repositórios em servidores web destinados às pessoas como um todo.
2. Nuvem Privada: Infraestruturas exclusivas e utilizadas internamente pelas empresas.
3. Nuvem Híbrida: A combinação Estratégica de ambientes públicos e privados.

Com o Cloud Computing, as empresas podem alugar a capacidade de armazenamento e processamento de que precisam de provedores de serviços em nuvem, sem se preocupar com infraestrutura física.

**Por que a nuvem para BigData**: Os provedores oferecem BDs e serviços de análise ideais para grandes volumes. Benefícios diretos:
* Zero custo físico: Elimina os gastos com estruturas físicas de armazenamento.
* Escalabilidade Imediata: Ajustes rápidos conforme a necessidade da empresa muda.
* Acesso Global: Colaboração em tempo real para equipes distribuídas geograficamente.

**O Ciclo de valor da informação**:
* Coleta expandida: Uso de banco de dados internos e externos para expandir o alcançe da informação.
* Correção e segurança: Higienização e Proteção do repositório no data lake.
* Atividades analíticas: Interpretação estratégica dos dados processados. Identificação e resposta ás perguntas-chave do negócio.

## Os 5Vs da BigData

* Volume: trilhões de dados coletados diariamente, das mais variadas fontes possíveis, sobretudo de redes sociais, navegadores de internet e e-commerces. Quanto mais dados, melhor.
* Velocidade: Reação em tempo real frente ao imenso volume de dados que devem ser analisados e tratados de forma adequada.
* Veracidade: Garantia de que as fontes de onde os dados foram obtidos são confiáveis e imparciais.
* Variedade: dados advindos de sistemas estruturados (atualmente pouco utilizados) e não estruturados. Diversas fontes de dados podem gerar informações de extrema importância ao serem combinadas. Auxilia análises preditivas.
* Valor: os dados são hoje o petróleo das empresas. Deve-se verificar o poder e importância que os dados trarão à organização, bem como analisar o retorno financeiro com implementação de projetos em Big Data.

**As três etapas do Big Data**:
1. Coleta de dados: Variedade e volume. Trabalho extenso.
2. Tratamento dos dados: Veracidade, agregação, integração, correção e segurança de dados.
3. Atividades Analíticas: Interpretação e identificação de perguntas-chave.

O armazenamento em nuvem supre muito bem a necessidade de grande poder computacional que o big data exige.

> Para Taurion (2013), Big Data, sobretudo no setor público, garante uma maior transparência em virtude de aumentar o acesso a dados inacessíveis até então, além de promover cruzamento de dados e consequentemente um aumento das chances de se visualizar desvios na gestão de órgãos públicos.

Outro grande impacto da big data é a prevísibilidade.

> Segundo Taurion (2013), há estudos que comprovam que ao se analisar os padrões comportamentais de dados, pode-se prever por exemplo o surgimento de uma pandemia, tempestade, seca ou até mesmo de uma crise financeira.

**Otimização da venda cruzada**: também conhecida por ***cross-selling***, é uma prática pela qual, na compra de um produto, o usuário se depara com sugestões para incrementar sua compra.
Essas sugestões são geradas por meio de algoritmos de identificação de padrão comportamental de consumidores.

