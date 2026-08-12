# Aula 3 - Dados estruturados e não estruturados

**O modelo Relacional**
A represetação dos dados ocorre por tabelas.
* Linhas: Registros com endereço único(ID/chave);
* Colunas: Atributos e características dos dados;
* Relações: A conexão entre valores registrados e seus atributos;

**Revisão do que é banco de dados relacional**:
banco baseado no modelo relacional, a representação dos dados ocorre por **tabelas**, em que cada _linha_ é um **registro com o seu endereço**, que também pode ser chamado de **ID ou de chave**. Na tabela, as _colunas_ têm as características, que são chamadas de **atributos dos dados**. As relações entre os dados são a razão pela qual esse tipo de banco tem o seu nome, pois, para cada atributo haverá um **valor registrado que o relaciona com os respectivos dados**.

**Linguagem de consulta estruturada(SQL)**:
* Definição: Linguagem padrão para criar e consultar informações em grandes volumes de dados.
* Base Matemática: Fundametada na álgebra relacional, garantindo lógica estrita.
* Vantagem: Consistência interna superior, ideal para processamento rápido e confiável.

**SQL: A linguagem da Precisão**
* Definição: SQL(Structured Query Language) é o padrão para criar e consultar dados;
* A base: Fundamentada na Álgebra Relacional;
* O benefício: Linguagem matemática consistente que garante confiabilidade para grandes volumes de dados estruturados;

**O padrão ACID**

A -> Atomicidade: Tudo ou nada, todas devem ser realizadas com sucesso ou nenhuma é realizada -> Indivisibilidade;
C -> Consistência: Garante que todas as restrições e regras sejam mantidas antes e depois de transações -> Coerência;
I -> Isolamento: Garante que as transações ocorram em paralelo, sem interferir uma na outra(existem 4 níveis de isolamento: leitura não confirmada, leitura confirmada, repetição de leitura e serializável) -> Bloqueado;
D -> Durabilidade: Garante que alterações feitas numa transação sejam permanentes. -> Persistência;

**A Fronteira NoSQL**

***Not Only SQL***
* Definição: Termo genérico para bancos de dados que não utilizam o modelo relacional de tabelas rígidas.
* Propósito: Projetados para gerenciar grandes volumes de dados não estruturados que o modelo relacional luta para processar.

**O que é NoSQL**
* Definição: Um termo genérico para bancos que não utilizam o modelo relacional rígido.
* Propósito: Projetados para gerenciar grandes volumes de dados com flexibilidade total.

**Entendendo a Escalabilidade e Disponibilidade**
* Escalabilidade: Planejamento para picos súbitos de acesso e decréscimo _sem travar o sistema_. Ou seja diz respeito a quantidade de usuários que acessam o banco de dados.
* Disponibilidade: Informação em tempo real, independente do horário ou localização(crítico para redes sociais e bancos.)

**Os 3 pilares da performance moderna**
1 - Escalabilidde: Capacidade de lidar com o crescimento ou decréscimo massivo de usuários sem travar.
2 - Alta Disponibilidade: Acesso garantido 24/7. O sistema nunca dorme.
3 - Otimização para ambientes onde os dados estão espalhados por múltiplos servidores.

**Gerenciando o caos de tráfego(picos de acesso)**
* Escalabilidade Dinâmica: Reação imediata à rapidez com que o número de usuários sobe ou desce;
* Tempo Real: Informação disponível instantaneamente independente de horário ou local.

**Big Data e NoSQL**
Os bancos de dados NoSQL são projetados para gerenciar grandes volumes de dados e permitir:
* alta escalabilidade;
* disponibilidade;
* Desempenho em ambientes distribuídos(AWS SRV).

O processamento e a modelagem dos dados possuem **3 pilares**:
* Tecnologias de _big data_;
* Ferramentas de analytics(_ETL_);
* Ferramentas de BI(_PowerBI_);

A **Flexibilidade** trata da maneira que os dados são armazenados, a _flexibilidade_ é importante para que os dados possam ser acessados por diversas tecnologias, aplicativos e clientes. Assim conseguindo armazenar _dados estruturados e não estruturados_.

**BD - Dados Estruturados**:
Dados estruturados são aqueles que possuem um _formato definido e organizado_, geralmente armazenados em tabelas com colunas e linhas, como em um banco de dados relacional.
Os campos são claramente definidos e tem um tipo específico de dado como números.

**BD - Dados semi-estruturados**
Dados semi-estruturados são aqueles que possuem uma _estrutura parcialmente definida_, mas ainda são organizados de alguma forma. Como por exemplo XML, JSON ou YAML.
Esse tipo de dado pode conter informações adicionais como **tags e metadados**.

**BD - Dados não estruturados**
Dados não estruturados são aqueles que _**não** possuem uma estrutura claramente definida_ e **não** são organizados em tabelas ou formatos específicos.
Esses dados podem ser de vários tipos, como texto livre, imagens, vídeos, áudio ou mensagens de redes sociais.

![Dados](../Imagens/bigData.png)

**Resumo da Arquitetura de Dados**:
|Relacional(SQL) | Não-Relacional(NoSQL) |
|----------------|-----------------------|
|Estrutura rígida(tabelas) | Flexibilidade(Documentos/Gravos) |
|ACID(Segurança Total) | Escalabilidade e alta disponibilidade |
|Consistência Matemática | Performance em ambientes Distrbuídos |
