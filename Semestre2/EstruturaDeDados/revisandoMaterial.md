# Revisando o Slide: Introdução a entrada e saída de dados

Importante se atentar que o **forma que os dados entram** influencia como eles são armazenados.

**O tipo de processamento dos dados ajuda a definir qual estrutura funciona melhor.**

### Alguns exemplos de estrutura de dados:
* lista - inserir um novo tem **numa posição específica**;
* Árvore - buscar o **menor valor** de forma rápida;
* Tabela Hash - localizar um registro

### Algumas formas comuns de saída no java

```java
System.out.print("Esse metódo imprime sem quebrar linha");
System.out.println("Esse metódo imprime a quebra de linha");
System.out.printf("Esse metódo imprime formatado(controlando casas decimais, alinhamento e etc)");
```

## Manipulação de indíces

O operador de *módulo(%)* é muito útil para criar lógica de percorrimento circular em arrays/listas/buffers.
EX:
```java
int[] nums = {10, 20, 30, 40, 50};
int i = 0;
i = (i + 1) % numeros.length; //i será (0 + 1 % 5)
System.out.println("Próximo Elemento:" + nums[i]) //saída: 20