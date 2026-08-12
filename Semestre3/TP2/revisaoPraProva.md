**Aviso, a base dessa revisão foi feita na base do _G E M I N I_**.

# 1. Introdução a Padrões de Projeto

## QUESTÃO-1.1: O que é um padrão de projeto?

É uma solução **geral e reutilizável** para _problemas comuns_ que ocorrem no design de software orientado a objetos.  
* **Conceito:** São "plantas" que podem ser adaptadas para resolver um problema de design específico em seu código.  
* **Objetivos**: Padronizar o código, facilitar a comunicação entre desenvolvedores e evitar a "reinvenção da roda".  
* **Benefícios**: Melhora a legibilidade, facilita a manutenção e torna o sistema mais flexível a mudanças.

## QUESTÃO-1.2: Explique as quatro partes fundamentais que compõem um padrão de projeto.

Segundo o Catálogo GoF, um padrão é composto por:

* Nome: Um identificador que descreve o problema e a solução.  
* Problema: Descreve quando aplicar o padrão e o contexto.  
* Solução: Os elementos que compõem o design (classes, objetos), seus relacionamentos e responsabilidades.  
* Consequências: Os resultados e compromissos (prós e contras) de se aplicar o padrão.

## QUESTÃO-1.3: Por que padrões de projeto podem melhorar a manutenção e documentação?

Eles fornecem uma terminologia comum. Dizer que um sistema usa "Abstract Factory" comunica instantaneamente a arquitetura para outro desenvolvedor sem precisar explicar cada classe. Além disso, como promovem o baixo acoplamento, alterar uma parte do sistema raramente quebra outras. 

## QUESTÃO-1.4: Quais são os principais riscos ou críticas?

O uso indiscriminado pode levar à superengenharia (complexidade desnecessária para problemas simples). Críticos também apontam que alguns padrões apenas suprem deficiências de certas linguagens de programação.  

# 2. Factory Method (Método de Fábrica)

## QUESTÃO-2.1: Definição e Objetivo.

Define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar. É indicado quando uma classe não pode antecipar a classe de objetos que precisa criar.  

## QUESTÃO-2.2: Diferença entre new e Factory Method.

O uso do new acopla o código a uma implementação específica (classe concreta). O Factory Method promove o desacoplamento, pois o código cliente interage apenas com a interface ou classe abstrata.  

## QUESTÃO-2.3 a 2.6: Soluções Práticas (Logística, Provas, UI, Agendamento).

O Factory Method segue esta estrutura básica em JavaScript:

````javascript

// Exemplo Logística (Q 2.3)

// "Interface"
class Transporte { 
    entregar() {} 
    } 

class Caminhao extends Transporte { 
    entregar() { 
        return "Entrega por terra"; 
    } 
}

class Navio extends Transporte {
    entregar() {
        return "Entrega por mar"; 
    } 
}

// Criador
class Logistica { 
    criarTransporte() { 
        throw new Error("Método deve ser implementado"); 
    }

    planejarEntrega() {
        const t = this.criarTransporte();
        return t.entregar();
    }
}

class LogisticaMaritima extends Logistica {
    criarTransporte() { 
        return new Navio(); 
    }
}

````

# 3. Abstract Factory (Fábrica Abstrata)

## QUESTÃO-3.1 a 3.3: Conceitos.

Diferente do Factory Method (que cria um produto), a Abstract Factory cria famílias de produtos relacionados sem especificar suas classes concretas. É indicada quando o sistema deve ser independente de como seus produtos são criados e quando há famílias de objetos que devem ser usados juntos.  

## QUESTÃO-3.4 a 3.8: Soluções Práticas (Jogos, E-commerce, Bancário, Veículos).

O objetivo aqui é garantir a coerência (ex: botões de Windows com janelas de Windows).

````javascript

// Exemplo Simulador de Veículos (Q 3.8)
class FabricaVeiculo {
    criarMotor() {}
    criarRoda() {}
}

class FabricaEsportivo extends FabricaVeiculo {
    criarMotor() { return "Motor V8"; }
    criarRoda() { return "Roda de Liga Leve"; }
}

class FabricaPopular extends FabricaVeiculo {
    criarMotor() { return "Motor 1.0"; }
    criarRoda() { return "Roda de Aço"; }
}
````

# 4. Builder (Construtor)

## QUESTÃO-4.1 a 4.4: Conceitos.

O Builder separa a construção de um objeto complexo da sua representação, permitindo que o mesmo processo de construção crie diferentes representações. É ideal para objetos com muitos parâmetros opcionais. Diferente de um construtor comum, o Builder permite criar o objeto passo a passo.  

## QUESTÃO-4.6 a 4.10: Soluções Práticas (Pizzaria, Relatórios, Cadastro).

````javascript

// Exemplo Cadastro Estudante (Q 4.9)
class EstudanteBuilder {
    constructor(nome) { this.nome = nome; } // Obrigatório
    setEndereco(end) { this.endereco = end; return this; }
    setEmail(email) { this.email = email; return this; }
    build() { return new Estudante(this); }
}

const aluno = new EstudanteBuilder("João").setEmail("joao@email.com").build();

````

# 5. Prototype (Protótipo)

## QUESTÃO-5.1 a 5.4: Conceitos.

Permite copiar objetos existentes sem tornar seu código dependente de suas classes. É usado quando o custo de criar um objeto novo "do zero" é maior do que clonar um existente (ex: busca em banco de dados complexa).

## QUESTÃO-5.5 a 5.9: Soluções Práticas (Editora, RH, Aulas).

````javascript

// Exemplo Documento (Q 5.5)
class Documento {
    constructor(titulo, conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }
    clone() {
        return new Documento(this.titulo, this.conteudo);
    }
}
````

# 6. Singleton

## QUESTÃO-6.1 a 6.3: Conceitos.

Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela. É útil para gerenciar recursos compartilhados como logs, conexão com banco ou configurações. Em sistemas grandes, pode dificultar testes unitários devido ao estado global.

## QUESTÃO-6.4 a 6.8: Soluções Práticas (Configurações, Log, Carrinho).

````javascript

// Exemplo Gerenciador de Configurações (Q 6.4)
class ConfigManager {
    constructor() {
        if (ConfigManager.instance) return ConfigManager.instance;
        this.settings = {};
        ConfigManager.instance = this;
    }
    static getInstance() {
        return new ConfigManager();
    }
}

````