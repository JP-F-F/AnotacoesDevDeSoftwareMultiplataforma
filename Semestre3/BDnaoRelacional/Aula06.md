# BD Não Relacional - Aula 06 - Trabalhando com JSON no MySQL

````MySQL
# Exemplo de um tabela com JSON

CREATE TABLE TABELA(
    id INT AUTO_INCREMENT NOT NULL,
    informacoes JSON
)
````

Desde a versão 5.7, o MySQL trata JSON como um tipo de dado nativo. Assim permitindo a manipulação de dados semi-estruturados eficientemente, dentro de um Banco de dados relacional.

**REGRAS DE OURO**:
* Use `JSON_VALID` para verificar a integridade da string antes de amazená-la no banco.
* Considere o impacto de performance ao varrer grandes volumes de dados JSON sem indexação.
* Não substitua o modelo relacional, se uma coluna tradicional gerencia o dado de forma eficiente use-a!.

Validando e inserindo dados JSON:

````MySQL
# Retorna 1 ou 0:

SELECT json_valid('{"nome": "Vandebas"}'); 

# Inserindo

INSERT INTO Usuario(dados) VALUES ('{"nome": "Crazy Forg", "idade": 99999, "email": "tutanturautan@bimbim.crazyfrog"}');

````

Inspecionando a estrutura e extraindo valores:

````MySQL

# Transforma a string linear em um documento identado e  legível 

SELECT JSON_PRETTY(pessoa) FROM Pessoas;

# Mostra o tipo de dados JSON da coluna

SELECT JSON_TYPE(pessoa) FROM pessoas;

# Extraindo Valores, O "$" representa a raiz do documento JSON, e o que vem após o "." é o path até a chave que queremos acessar, quase como seguir o caminho até um diretório/página web

SELECT JSON_EXTRACT(dados, '$.nome') AS nome FROM Usuarios;

````
**Dica pro**: O mysql possui um atalho, você pode substituir a função pela setina: `dados->'$.nome'`

Para fazer buscar em arrays dentro de JSONs é só fazer o que já fazemos normalmente, ou seja indicar a chave do item que queremos ver `SELECT JSON_EXTRACT(dados '$.habilidades[1]')`

Usamos a função de extração diretamente nas condições para fazermos a filtragem `SELECT * FROM Usuarios WHERE JSON_EXTRACT(dados, '$.idade') > 25;`.

Podemos usar o `ORDER BY` para classificar os valores do JSON `SELECT * FROM Usuarios ORDER BY JSON_EXTRACT(dados, '$.idade') ASC;`

Para buscarmos dados com alta precisão usamos `JSON_SEARCH` essa função retorna o path onde um valor se encontra, caso não ache retorna `NULL`:
`JSON_SEARCH(pessoa, 'one', 'Curitiba', NULL, '$.localizacao.cidade')`

* "One": retorna a primeira chave encontrada(use "all" para todas);
* "Curitiba": O valor buscado (Fique ligado aqui é **CASE SENSITIVE**);
* NULL: caractere de escape (opcional);
* '$.localizacao.cidade': path específico de busca(opcional);

Atualizando documentos JSON:

````MySQL

# Modificando um JSON existente

UPDATE Usuarios SET dados = JSON_SET(dados, '$.idade', 31) WHERE id = 1;

# Adicionando uma nova chave

UPDATE Usuarios SET dados = JSON_SET(dados '$.cidade', 'São Paulo') WHERE id = 1;

````

**O `JSON_SET` atualiza o valor se a chave existir e insere uma nova se não existir.**

Limpando e Formatando:

````MYSQL
# Remoção

UPDATE Usuarios SET dados = JSON_REMOVE(dados, '$.email') WHERE id = 1;
````

A extração nativa frequentemente retorna dados envolvidos em aspas duplas, mas se usarmos o `JSON_UNQUOTE(...)` obtemos uma string limpa.

Consultas varrendo campos JSON inteiros(_Full Table Scan_) são lentas. Para solucionar isso criamos índices em colunas virtuais geradas:
````MYSQL
ALTER TABLE usuarios ADD INDEX idx_idadechro((JSON_EXTRACT(dados, '$.idade')));
````

Retorna a quantidade de chaves que existem no documento, ou a partir de uma profundidade específica:
````MYSQL
SELECT JSON_KEYS(pessoa) FROM pessoas;
SELECT JSON_KEYS(pessoa, '$.localizacao')
FROM pessoas;
````