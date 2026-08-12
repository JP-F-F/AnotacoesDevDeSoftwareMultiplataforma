# Ultima seção (Seção 4)

## Funções 

Na chamada de funções nós podemos especificar quais parametros da função receberão
quais valores.
***EX: function(valor1 = 20, valor2 = 30)***

Caso nós desejemos deixar um valor padrão para um parametro da função, para caso ele
seja omitido na chamada, podemos apenas dar a ele um valor como se estivessemos atribuindo
valor a uma váriavel.
***EX: def function(valor1, valor2 = 2):***

### Funções e escopos a palavra chave global

podemos usar a declaração **Global** para que as váriaveis das funções tenham um escopo
para todo programa, ou seja as funções e etc, poderam modificar os valores das váriaveis
e etc.
```
EX:
def func(): 
    global var
    var = 2
```

## Tuplas e Dicionários

### Tipos de Sequência e Mutabilidade

Um tipo de sequência é um tipo de dados em Python que é capaz de armazenar mais de um 
valor (ou menos de um, pois uma sequência pode estar vazia), e esses valores podem ser 
sequencialmente (por isso o nome) navegados, elemento a elemento.

uma sequência são dados que podem ser verificados pelo _loop FOR_

mutabilidade - é uma propriedade de qualquer dado Python que descreva sua disponibilidade 
para ser livremente alterado durante a execução do programa. 
Existem dois tipos de dados Python: mutáveis e imutáveis.

### Tuplas 

Para declarar uma tupla usamos os parenteses da atribuição da váriavel
````
tupla = (1,2,2,2)

# podemos támbem usar apenas vírgulas para declarar uma tupla

tupla2 = 1., .3, 8

````

Se quisermos ver posições de uma tupla e etc, usamos as mesmas convenções usadas nas listas
Mas não vamos nos enganar elementos de uma tupla **Não podem ser alterados** da mesma
forma que alteramos listas.

O que mais as tuplas podem fazer por você?

* a função len() aceita tuplas e retorna o número de elementos contidos nela;
* o operador + pode unir as tuplas (já mostramos isso)
* o operador * pode multiplicar tuplas, assim como listas;
* os operadores in e not in funcionam da mesma forma que nas listas.

### Dicionários

O dicionário é outra estrutura de dados Python. Não é um tipo de sequência (mas pode ser 
facilmente adaptado ao processamento de sequência) e é mutável.

Para explicar o que é o dicionário, é importante entender que **ele é literalmente um dicionário.**

Exemplo de criação de dicionários:

````
dictionary = {"gato": "chat", "cachorro": "chien", "cavalo": "cheval"}
phone_numbers = {'chefe': 5551234567, 'Suzy': 22657854310}
empty_dictionary = {}
 
print(dictionary)
print(phone_numbers)
print(empty_dictionary)
````

Básicamente nos dicionários nós damos os nomes para as nossas chaves.

No mundo do Python, a palavra que você procura é chamada de **key**. 
A palavra que você recebe do dicionário é chamada de **value**

Isso significa que um dicionário é um conjunto de pares de key-value. Nota:

* cada chave deve ser única - não é possível ter mais de uma chave com o mesmo valor;

* uma chave pode ser qualquer tipo imutável de objeto: pode ser um número (inteiro ou 
flutuante), ou até mesmo uma string, mas não uma lista;

* um dicionário não é uma lista - uma lista contém um conjunto de valores numerados, 
enquanto um dicionário contém pares de valores;

* a função len() também funciona para dicionários - ela retorna o número de elementos de 
valor-chave no dicionário;

* um dicionário é uma ferramenta de mão única. Se você tiver um dicionário 
inglês-francês, poderá procurar equivalentes em francês dos termos em inglês, mas não 
vice-versa.

No uso de dicionários também podemos usar a maioria das convenções usadas em listas,
como por exemplo o uso dos colchetes para chamar uma chave.
Ou seja obter o valor de um dicionário se assemelha à indexação, especialmente graças aos 
colchetes em torno do valor da chave.

**Nota:**

* se a chave for uma string, você precisará especificá-la como uma string;
* chaves fazem distinção entre maiúsculas e minúsculas: "Suzy" é algo diferente de "suzy".

### Métodos e Funções em dicionários

#### O método Keys

Os dicionários podem ser navegados usando o loop for, como listas ou tuplas? Não e sim.

Não, porque um dicionário não é um tipo de sequência - o loop for é inútil com ele.
**Isso se você estiver usando alguma versão do python abaixo da 3.6**

O método chamado de **keys()**, possuído por cada dicionário. 
O método retorna um objeto iterável que consiste em todas as chaves reunidas no dicionário. 
Ter um grupo de chaves permite acessar todo o dicionário de forma fácil e prática.

**EXEMPLO:**
````
dictionary = {"gato": "chat", "cachorro": "chien", "cavalo": "cheval"}
 
for key in dictionary.keys():
    print(key, "->", dictionary[key])
````

Temos também o método de dicionário chamado **items()**. 
O método retorna tuplas (este é o primeiro exemplo em que as tuplas são algo mais do que 
apenas um exemplo delas) em que cada tupla é um par de valores-chave.

**EXEMPLO:**

````
dictionary = {"gato": "chat", "cachorro": "chien", "cavalo": "cheval"}
 
for english, french in dictionary.items():
    print(english, "->", french)`

# Nesse caso as chaves do dicionário estão sendo armazenadas na váriavel english
# E os valores da tradução em francês na váriavel french
````

#### Modificação e adição de valores 

Atribuir um novo valor a uma chave atual é simples - como os dicionários são totalmente mutáveis, não há 
obstáculos para modificá-los.
Nesse exemplo estamos trocando a palavra **chat** por **minou**.
Como podemos ver, a adição e modificação de valores em dicionários também funciona de forma semelhante aos
meios usados em listas

````
dictionary = {"gato": "chat", "cachorro": "chien", "cavalo": "cheval"}
 
dictionary['gato'] = 'minou'
print(dictionary)
````

#### Adição de uma nova chave

Adicionar um novo par de valores-chave a um dicionário é tão simples quanto alterar um valor - você só precisa 
atribuir um valor a uma nova chave anteriormente inexistente.
No exemplo a seguir estamos adicionando a chave **swan** e o valor **cygne**
**EXEMPLO**:

````
 dictionary = {"gato": "chat", "cachorro": "chien", "cavalo": "cheval"}
 
dictionary['swan'] = 'cygne'
print(dictionary) 
````

É possível adicionar um valor ao dicionário usando o método update()
Nesse exemplo estamos adicionando a chave **pato** e o valor **canard**
**EXEMPLO**:

````
 dictionary = {"gato": "chat", "cachorro": "chien", "cavalo": "cheval"}
 
dictionary.update({"pato": "canard"})
print(dictionary) 
````

#### Removendo uma chave

Primeiro um aviso, sempre que removemos uma chave, **seu valor é removido junto(obviamente)**
Para removermos uma chave usamos a instrução **del**
**EXEMPLO**:

````
dictionary = {"gato": "chat", "cachorro": "chien", "cavalo": "cheval"}
 
del dictionary['cachorro']
print(dictionary)
````

Caso queiramos remover específicamente a última chave de um dicionário podemos usar o método **popitem()**
***AVISO: nas versões do python que são anteriores a versão 3.6.7, esse método remove um item aleatório do dicionário.

## Exceções

### O ramo da tentativa exceto

No python o equivalente do **try...catch..** é o **try...except...**;
Ao lado do **except** nós colocamos o tipo de errado que essa exceção deve pegar.
E assim podemos ir adicionando exceções para erros diferentes.
Lembre-se, não tente tratar a mesma exceção mais de uma vez.

**EXEMPLO:**
````
try:
 value = int(input('Digite um número natural: '))
 print('O recíproco de', value, 'é', 1/value) 
except ValueError:
 print('Eu não sei o que fazer.') 
except ZeroDivisionError:
 print('A divisão por zero não é permitida em nosso Universo.') 
````

Caso queiramos adicionar uma resposta padrão para erros, no caso, uma exceção que lide com erros que não
foram específicados em outros **excepts**, basta apenas que escravamos **except** sem especificar o erro.
***LEMBRE-SE O EXCEPT PADRÃO DEVE SEMPRE SER O ÚLTIMO A SER DECLARADO***
Podemos fazer uma **except** lidar com vários erros de uma vez, separando cada erro com virgula:
**except SyntaxError, ValueError**

**EXEMPLO:**
````
try:
: value = int (input('Insira um número natural:')) 
print('O recíproco de', value, 'é', 1 / value) 

# Exceção para erros de valores
except ValueError:
 print('Não sei o que fazer.' ) 

# Exceção para erros de divisão por zero
except ZeroDivisionError:
 print('Divisão por zero não é permitida em nosso universo.') 

# Exceção para erros gerais
except: 
print('algo de estranho aconteceu aqui ... Desculpe! ')
````

## Algumas Exceções úteis

* ZeroDivisionError
* ValueError
* TypeError
* AttributeError
* SyntaxError
