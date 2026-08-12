# BD não relacional - Aula 10 - Prática! Trabalhando com JSON no MySQL

**A evolução da tabela: O modelo híbrido**

Ao invés de criarmos dezenas de colunas que podem ficar vazias(**NULL**), encapsulamos dados variáveis e uma única coluna flexível, mantendo chaves primárias e índices rígidos intactos.

A Fundação rígida seriam as colunas comuns, que são boas para metadados essenciais e de busca rápida.
Já o container dinâmico que seria o JSON, serve pra armazenar qualquer estrutura de documento NoSQL.

**JSON PATH**

Para manipularmos dados internos, o MySQL utiliza o padrão ***JSON Path.*** O cifrão($) representa o objeto inteiro, e usamos pontos('.') para descer pelos galhos da estrutura.

**Extraindo dados com precisão**

`SELECT nome, info->>'$.telefone' AS telefone FROM Pessoas;`

_"info"_ é a nossa coluna contêiner. _"->>"_ é o operador **unquoting** que extrai os dados como texto limpo sem as aspas. _".telefone"_ é o nosso caminho/JSON Path.

**JSON_SET**

Usamos o **json_set** para atualizar ou adicionar um nó no json.
EX: `UPDATE Pessoas SET info = JSON_SET(info, '$.telefone', '22222-2222') WHERE nome = 'joão';`

**JSON_REMOVE**

Usamos o **json_remove** para removermos um dado do documento, sem necessariamente apagar a linha ou a coluna.
EX: `UPDATE Pessoas SET info = JSON_REMOVE(info, '$.telefone') WHERE nome = 'joão';`

**O toolkit JSON no MySQL**

|Operação | Operador/Função | Comportamento |
|---------|-----------------|---------------|
|Leitura(read)| ->> | Extrai o valor como texto puro|
|Escrita(upset)| JSON_SET() | Atualiza o valor se a chave existir, cria a chave se não existir|
|Exclusão(Delete)|JSON_REMOVE()| Exclui permanentemente a chave e seu valor do documento|

**Select no JSON**

Usamos o operado **->>** para fazermos selects em colunas de JSON.
EX: `SELECT nome, info->>'$.telefone' as telefone FROM pessoas WHERE idade > 30;`