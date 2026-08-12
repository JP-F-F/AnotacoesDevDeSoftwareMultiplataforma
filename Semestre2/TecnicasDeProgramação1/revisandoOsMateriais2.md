# Aqui está a revisão do material 07 á 11

## Aula 09

### Sobrecarga de métodos e construtores

Em java o overload(sobrecarga) é um conceito que permite que tenhamos métodos com o mesmo nome em uma classe, contanto que tenham parâmetros. Essa diferença na quantidade e tipos de parâmetros é o que permite que o java faça a distinção dos métodos.

EX:
```java
public class Matematica{
    public int soma(int n1, int n2){
        return n1 + n2;
    }
    public int soma(int n1, int n2, int n3){
        return n1 + n2 + n3
    }
}
```

***Caracteristicas Principais***:
* Possuem o mesmo nome mas, as assinaturas são diferentes;
* Permite uma interface mais intuitiva para os devs;
* A sobrecarga é determinada pelo número e tipos de parâmetros;
* Os métodos sobrecarregados devem ter uma lista de parâmetros diferentes do original;
* A sobrecarga é resolvida em tempo de compilação, com base nos argumentos dos métodos;

### Métodos Estáticos

Métodos estáticos são aqueles que pertencem à classe não as instâncias. Ou seja podemos chamar um método estático diretamente na classe, sem precisar de uma instância.
acessando um método estático: `minhaClasse.MeuMetodo(String MeusParametros);`.

Métodos estáticos não podem acessar membros não estáticos da classe diretamente, ou seja eles támbem não tem acesso ao `this.` pois não estão vinculados a uma instância, basicamente eles só pode acessar ***membros estáticos** diretamente.
Métodos estáticos por não estarem associados a uma instância são **incapazes de alterar objetos de uma classe**.
Métodos estáticos **não são herdados**, eles estão apenas associados a classe que os definiu.

Métodis estáticos também são chamados de **classe utilitária**. No geral métodos estáticos são úteis para funcionalidades globais e independentes de estados de objeto.

## aula 10 Herança 

### Relacionamento entre classes

* **Associação**: Ocorre quando uma classe possuí um atributo de outra classe.
* **Cardinalidade/Multiplicidade**: São os valores utilizados para definir a multiplicidade de um dos lados do relacionamento. Estes seriam:
    * 1: obrigatoriamente um;
    * 0...1: zero ou um;
    * 1...*: um ou mais;
    * 0...* ou *: zero ou mais;

Quando a relação é de muitos o atributo que seria o que tem muitos é um array.

### Herança

**classe base/superclasse** é como se chama a classe herdada, a classe que herda é chamada de **derivada/subclasse**;

As subclasses recebem 

