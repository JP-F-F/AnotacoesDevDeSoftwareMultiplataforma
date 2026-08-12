# **Aqui está revisão dos materias aula 02 até a aula05

# Revisando o arquivo aula_02_TP

POO é um paradigma de programação.
A POO facilita a comunicação entre analista e utilizador, por referenciar/usar objetos da vida real; 
Também é muito útil para _reutilização de código_, pois é possível usar os mesmos objetos em projetos diferentes;

## Programação estruturada VS. POO

|Programação OO | Programação Estruturada |
|---------------|-------------------------|
|Métodos        | Procedimentos e Funções |
|Atributos      | Dados                   |
|Mensagens      | Chamdas                 |
|Classes        | Tipos de Dados          |
|Herança        | Não Existe              |
|Controle do Usuário| linear              |

## Características do JAVA

* **Portabilidade**: seus byte codes(código binário dq aplicação) podem ser executados em várias plataformas sem restrição;
* **Uso Geral**: pode fazer desde smart-cards a mainframes;
* **Linguagem Distríbuida(RMI, EJB)**: possui API's para criar objetos distribuidos onde partes de uma aplicação pode ser executada em diversas máquinas;
* **Segurança(Sandbox)**: Controle de segurança do ambiente de execução das aplicações;
* **Multithreading**: Suporta programação de aplicações multitarefa, compostas por várias threads;
* **Linguagem Dinâmica(JCP)**: O java evolui com constancia pois ele é melhorado pela comunidade constantemente;
* **JAVA e a Internet(Applets, Serviets / JSP)**: Total suporte para criação de aplicações em rede/web.

## Ambiente Java e os Bytecodes

* O _código compilado_ gera um conjunto de instruções chamado **bytecodes**;
* O bytecode é _aplicado na JVM_ que interpreta os comandos para o SO; basicamente o JVM traduz o java para o SO.
* Esse bytecodes podem ser **_interpretados_ por qualquer máquina JAVA**;

## Ambiente java e o garbage collection

* É o responsável por alocar e liberar memória;
* Caso uma variável seja associada a outra região de memória, o JVM colocado o espaço anteriormente alocado em uma pilha de objetos que estão em desuso;
* Caso o computador fique com pouca memória, o JVM remove os objetos da pilha de desuso.
* Assim o programador não precisa se preocupar com a aritmética de ponteiros, pois o java faz isso automáticamente;

# Revisando o arquivo aula_03_TP

No java strings não são um **tipo primitivo** mas sim uma ***C l a s s e***;

Os caracteres scape são indicados pelo simbolo da barra invertida "\".
---------insira aqui a imagem dos carateres scape-----------------

Usamos o _for_ quando sabemos quantas iterações serão necessárias solução do problema;


## Falando de arrays

Declaração de um array multimensional:
```java
int[][] nums = {
    {1,2,3}, 
    {4,5,6}
    };
```
no Java os arrays tem **tamanho fixo**, caso queiramos um array sem tamanho fixo usamos **arrayslist**

usar o **foreach** para percorrer todos os elementos do array é o ideal.

Os arraylist são básicamente arrays com tamanhos dinâmicos, tem seus metodos para adicionar e remover itens e etc.
Metodos arraylist:
```java
array.add(); //adiciona elementos
array.size(); //Vê o tamaho atual do arraylist
```

# Arquivo aula_04_TP

## contexto/historia da POO

lá nos anos 70 surgiu a programação estruturada que foi criada para tentar resolver os problemas da época, está seria o berço da programação orientada a objeto.
Os **principios da programação estruturada**:
* **Abstração** - Para resolver um problema se faz necessário que o analista o analise de forma isolada, ou seja focar detalhadamente nos detalhes desse problema.
* **Formalidade** - O analista deve organizar os componentes para a solução do problema em uma árvore de estrutura hierárquica. Fazendo o sistema ser entendido a nível, a cada novo nível se acrescenta mais detalhes.

Nos anos 60 a linguagem norueguesa ***Simula67*** introduzia conceitos de OO.

Nos anos 70 o Centro de pesquisa da xerox(PARC) desenvolveu a samlltalk, a primeira linguagem 100% OO.

**A POO é um paradigma de programação**. Sendo essa uma evolução do paradigma procedural.

## Fundamentos e visão da POO 

A enciclopedia britânica afirma:
Geralmente se emprega esses três métodos de organização:
* Diferenciação de objetos particulares e seus atributos;
* Distinguir objetos como um todo e entre seus componentes;
* Formação/distinção entre as diferentes classes de objeto;

O foco do programa está nos seus **dados(objetos)**, não nas funções pois as funções _mudam mais que os dados_.
Focando assim em compreender o mundo com objetos, pois a base da estrutura do programa se baseia em representar objetos do mundo real(**Estados + Comportamento**);

## Classes e objetos

Explicação - classes são abstrações de objetos do mundo real, definindo um tipo de objeto, suas ***caracteristicas(atributos)*** e suas ***ações(métodos)***, classes não tem vida, são _conceitos estáticos_ (arquivos .java no disco). **Apenas as intâncias da classe tem vida**.
Definição - São declarações de objetos/Abstrações de objetos;

**Objeto** - São uma instância de uma classe, ou seja ele possui os **comportamentos e características** definidos na classe.

Objetos representam entidades do mundo real, e possuem três características:
* Identidade - Objetos são únicos e distinguiveis;
* Estado - O estado do objeto é determinado pelos dados contidos no objeto;
* Comportamento - O comportamento do objeto é definido pelos seus serviços/operações;

Conjunto de atributos = descrição; Conjunto de métodos = Comportamento;

Objetos gerados de uma classe não são iguais, eles são apenas semelhantes em suas propriedades.
Quando instanciamos um objeto é reservado um espaço na memória para ele e seu construtor é executado, e o objeto estara pronto para ser executado. Quando eliminamos um objeto utilizamos o seu _destrutor_.

**Pacotes** são formas de organizar suas classes e objetos. A _convenção_ é ---> domínio - projeto + pasta
EX: com.fatecDiadema.java.aula_04;

Sempre que declararmos um objeto precisamos **instancia-lo**;
EX: declaração(OBJ obj =) Instanciação(= new OBJ());

Podemos criar **objetos anônimos**, para isso basta apenas não indicar o nome do objeto na instânciação.
Esses objetos são utilizados qaundo a instância da classe é usada apenas uma vez;
EX: new Classe();

Objetos são representados por **um círculo com o seu nome na parte interna**.
Os ***sinônimos*** de objeto seriam - Objeto = Instância = Ocorrência.

Os objetos se comunicam atráves de _mensagens_ , quando se envia uma mensagem é necessário especificar ***Um receptor, uma requisição de serviços, argumentos/parâmetros(opicional)**;
Se o serviço não puder ser atendido o emissor é notificado e o receptor não faz nenhum processamento.
Caso contrário o receptor aceita e responde a mensagem ativando o método correspondente.
Atender uma mensagem envolve esxecutar código(método) sobre algum dado daquela operação(atributo).

### Metodos 

_Metodos_ são operações que realizam ações e podem modificar atributos de objeto que as está executando;
Metodos só podem retornar ***Um valor ou uma coleção***

# Arquivo aula_05_TP

## Encapsulamento e modificadores de acesso

É o mecanismo utilizado para disponibilizar/proteger métodos, evitando o acesso direto e indevido a uma instancia, seus atributos e etc.
Evitando que um objeto interfira sobre os dados de outro objeto de forma indevida.

Devemos aplicar o encapsulamento pensando no código que irá usar esses atributos e etc depois.

Os **modificadores de acesso** estes controlam o acesso aos ***membros de uma classe***.
Membros de uma classe = a própria classe, atributos, metodos, contrutores.
Caso um atributo ou metodo não tenha nenhum modificador de acesso ele é definido como ***Friendly***, ficando somente vísivel para objetos de classes do mesmo pacote.

O modificador ***Abstract*** Classes definidas como abstract não permite criar instâncias da classe, ou seja não é possível fazer objetos dessa classe, geralmente aplicamos esse modificador em classes que não se conhece qual será o comportamento por inteiro.

O modificador ***Native*** define que um método foi escrito em uma linguagem nativa como C ou C++.

O modificador ***Transient*** Este é aplicado apenas a váriaveis, quando declaramos uma váriavel com esse modificador, a váriavel não guarda como parte do estado de persistência do objeto, pois as vezes é necessário escrever dados **fora da JVM**, quando isso acontece nenhum dos mecanismos de segurança da linguagem é válido e se existe informações que não devem ser escritas nas váriaveis que contem esses dados devem ser declarados com transient para que esses não sejam escritos fora da JVM.

O modificador ***Synchronized*** faz com que um método seja acessado por um thread de cada vez.

O modificador ***final*** faz com que os métodos não possam redefinidos e as classes impossiveis de estender(herança).
Atributos ***Final*** também podem ser declarados com ***static***.

Atributos ***Static*** pertencem a classe não ao objeto, mesmo que ajam vários objetos, só existe uma cópia de tal atributo, caso queiramos acessar esse atributo usamos o nome da classe.

Atributos **static** pertencem a classe não ao objeto.

## coesão e acoplamento

Esses dois conceitos fundamentais na POO descrevem a qualidade da estrutura do código/classes;

**Coesão** = medida que os elementos de uma classe estçao relacionados e funcionam juntos para cumprir seus objetivos.
Uma classe coesa é uma classe que, possui uma única responsabilidade e seus métodos e atributos estão relacionados a essa responsabilidade.

**Acoplamento** = medida em que as classes estão interconectadas ou dependentes umas das outras.
Um alto nível de acomplamento indica que as classes estão interconectadas ou dependentes umas das outras, o que pode tornar o código mais difícil de entender e modificar.

Uma boa prática de programação é maximizar a coesão e minizar o acoplamento.

## Regras básicas para implementação de classes simples em java

Todos os campos de uma classe devem ser _private_ para ficarem ocultos a o programador dessa classe. Os métodos acessíveis devem ser declarados como _public_.

Omitir o modificador de acesso do não é muito problemático método será considerado da categoria ***package***, mas caso agrupemos classes desenvolvidas, pode ocorrer problemas de acesso.

## Construtores

Construtores devem ter o mesmo nome da sua classe.
Não precisa declarar tipo, pois estes nem retornam valores.

## Sobrecarga de métodos

Métodos possuem uma coisa chamada ***assinatura**, está é composta pelo seu nome e os tipos de argumentos que ela recebe, independente dos nomes de váriaveis usados na declaração do métodos.

O tipo do retorno **não é** considerado parte da _assinatura_, ou seja não podemos ter um método com o mesmo nome, tipo de argumentos, mas um retorno diferente.

EX:
```java
public pessoa(){} //construtor vazio
public pessoa(String nome, String CPF){
    super();
    CPF = CPF;
    Nome = nome;
}
```

