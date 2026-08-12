# Revisando o powerPoint Aula02_Geral

## Coisas sobre o SQL

O **SQL** Tem alguns subconjuntos, sendo eles:
* DML - Linguagem de manipulação de dados(Select, Insert, Update, Delete)
* DDL - Linguagem de definição de dados(Create, Drop, Alter)
* DCL - Linguagem de controle de dados(Grant, Revoke)
* DTL - Linguagem de transações de dados(Begin Transaction, Commit Transaction, Rollback Transaction)

_SQL é uma linguagem não procedural_

Nós podemos usar a função isNull para tratar valores nulos no banco de dados.
A sintaxae funciona mais ou menos assim: isNull(Expressão, **expressão alternativa**).
A função ira verificar se a expressão é nula, se for ela irá **substituir pelo valor da expressão alternativa**

Caso queiramos eliminar registros duplicados que retornam no select, usamos a cláusa **DISTINCT**.

Aparentemente para visualizarmos a estrutura de uma tabela usamos **sp_help NomeDaTabela**

O operador é usado para chegar se os valores de uma tabela estão em valores específicos, ao invés de usarmos por exemplo: cidade = diadema or cidade = SBC, podemos usar o _IN_, por exemplo: where nomeCidade IN (diadema, SBC).

Para ordernarmos uma coluna, usamos o **ORDER BY**, usamos **ASC** para organizar em ordem ascendente e **DESC** para descendente, também podemos usar um número positivo que representa a posição da coluna na seleção.

Caso queiramos agrupar colunas numa query, usamos o **GROUP BY**, aí caso queiramos selecionar grupos específicos dessa query usamos o **HAVING**.

# Revisando aula 2.1 CriandoBD

O que é uma **Chave Candidata/Alternativa** é uma coluna ou combinação de colunas que pode ser uma chave primária.

## Falando de restrições de Integridade

Os SGBD devem garantir a integridade dos dados através dos mecanismos de restrição de integridade

* Integridade declarativa: Devem ser garantidas automaticamente por um SGBD a partir da sua delcaração na definição das tabelas(PKs e etc).

* Integridade de domínio: Define que os valores devem obedecer a definição de valores da coluna, essas definições podem ser os domínios(int, char e etc), definir uma possibilidade de valores (masculino ou feminino), ou até fórmulas(> 0)
* Domínio: Conjunto de valores que o campo de uma tabela pode assumir.

* Valores vazios - NULL: devemos especificar se uma coluna pode ter NULL, **somente colunas opcionais podem ter valores NULL**

Caso queiramos alterar uma tabela ou coluna usamos o **ALTER TABLE ou ALTER COLUMN**

Caso queiramos colocar uma validação em uma coluna, podemos usar o **CHECK**, EX: sexo char(1)... **CHECK(sexo in('F','M'))**;

# Revisando aula 2.2 comandos DML

Usamos o comando ***INSERT*** para adicionar linhas em uma tabela.
```sql
INSERT INTO nomeTabela VALUES
```
podemos após o "into" especificar que colunas preencher e após o "values" uma lista de expressões e valores fixos, em ambos os casos colocamos entre parênteses as colunas ou expressões e etc.

O comando ***UPDATE*** serve para alterar os dados das tabelas.
```sql
UPDATE <tabela> | <view> SET coluna [coluna] = {expressão} [WHERE <condicao>]
``` 

# Revisando aula 05 Transformação entre modelos

## Composição de um banco de dados relacional

Um banco de dados relacional é composto de **tabelas** e **relações**.
**Tabelas** são um conjunto não ordenado de linhas(**tuplas**).
As **linhas** são compostas por uma série de campos(valor de **atributo**).
Cada **Campo** é identificadp por um nome de campo(**Nome de atributo**).
O conjunto de campos homônimos de todas as linhas de uma tabela forma uma **coluna**.

Observações sobre tabelas:

* As linhas de uma tabela **Não têm ordenação** - a ordem de recuperação é arbitrária, a menos que uma ordenação seja especificada na instrução da consulta.
* Não existem linhas duplicadas.
* Não é possível referenciar linhas de uma tabela por posição.
* Os valores de um campo de uma tabela são atômicos(indivísivel) e monovalorados(apenas um valor por campo).

## Mapeamento do conceitual pro relacional

Um modelo construído usando o Modelo entidade-relacionamento pode seer mapeado para um modelo lógico relacional, a equivalência seria algo como:
|Modelo Conceitual | Modelo Relacional |
|------------------|-------------------|
|Entidade | tabela |
|Atributo | Coluna |
|Ocorrência| Linha|

## Mapeando Entidades

* Para cada entidade se cria uma relação-tabela;
* Para cada atributo simples se inclui uma coluna na tabela;
* Caso o atributo seja composto incluir só os atributos simples que o compõe(Endereço por exemplo);

## Mapeando atributos multivalorados

* Para cada atributo desses, deve ser criada uma tabela formada pela chave primária da Tabela/Entidade e pelo atributo;
* A chave primária da nova tabela será o par de atributos;

# Aula 06 views

## Processamento do select

A ordem de processamento de uma consulta seria:
|Ordem Visual | Ordem De Processamento |
|:-------------|------------------------:|
|Select | From |
|From  | Where |
|Where | Group By|
|Group By | Having|
|Having | Select |
| Order by | Order By |

## VIEW

Views em sql são tabelas virtuais baseadas no **resultado de um SELECT**. O comando select que compõe a view pode usar _joins_ para relacionar várias tabelas.

Algumas utilidades das VIEWS seriam:
* Simplificar e personalizar a visualização dos usuários sobre o banco;
* Mecanismo de segurança, pois permite que os usuários acessem os dados atráves da view, sem conceder permissão direta á tabela;
* Pode oferecer também uma interface compatível com versões anteriores para emular uma tabela que foi alterada.

É possível usar operações de **insert, Update e Delete**, desde que não envolva mais de uma tabela base na operação.

```sql
-- Criando uma VIEW
CREATE VIEW v_empregados AS
SELECT NomeEmpr, DtNascimento, CodDepto, NomeDepto FROM Empregado
INNER JOIN Departamento Departamento ON (Departamento.CodDepto = Empregado.CodDepto);

-- Alterando a VIEW
ALTER VIEW v_empregados AS 
SELECT e.salario, e.comissao FROM Empregado e INNER JOIN Departamento d ON (d.idDpeto = e.idDepto);

-- Deletando a VIEW
DROP VIEW v_empregados;
```
