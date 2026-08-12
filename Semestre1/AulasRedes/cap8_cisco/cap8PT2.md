## Como um host roteia

### Decisão de encaminhamento do Host

Um pacote IPv6 pode conter também cabeçalhos de extensão (EH), que fornecem informações de camada de rede. 
Opcionais, os cabeçalhos de extensão ficam posicionados entre o cabeçalho IPv6 e a carga. Eles são usados para 
fragmentação, segurança, suporte à mobilidade e muito mais.

Outra função da camada de rede é direcionar pacotes entre hosts. Um host pode enviar um pacote para o seguinte:

* ***Itself*** - Um host pode fazer ping em si mesmo enviando um pacote para um endereço IPv4 especial de 127.0.0.1 
ou um endereço IPv6 ::1, que é referido como a interface de loopback. O ping na interface de loopback testa a 
pilha de protocolos do TCP/IP no host.

* ***Host local*** - Este é um host de destino que está na mesma rede local que o host de envio. Os hosts de origem 
e destino compartilham o mesmo endereço de rede.

* ***Host remoto*** - Este é um host de destino em uma rede remota. Os hosts de origem e destino não compartilham o mesmo endereço de rede.

Se um pacote é destinado a um host local ou a um host remoto é determinado pelo dispositivo final de origem. O 
dispositivo final de origem determina se o endereço IP de destino está na mesma rede em que o próprio 
dispositivo de origem está. 

**O método de determinação varia de acordo com a versão IP:**

* **Em IPv4** - O dispositivo de origem usa sua própria máscara de sub-rede juntamente com seu próprio 
endereço IPv4 e o endereço IPv4 de destino para fazer essa determinação.

* **Em IPv6** - O roteador local anuncia o endereço de rede local (prefixo) para todos os dispositivos na rede.

O dispositivo intermediário fornece interconexões entre hosts locais na rede local. Os hosts locais podem 
interagir entre si e compartilhar informações sem a necessidade de dispositivos adicionais.
Se um host estiver enviando um pacote para um dispositivo configurado com a mesma rede IP que o dispositivo 
host, o pacote será simplesmente encaminhado para fora da interface do host, através do dispositivo 
intermediário e diretamente ao dispositivo de destino.

Quando um dispositivo de origem envia um pacote a um dispositivo de destino remoto, é necessária a ajuda de 
roteadores e do roteamento.

O roteamento é o processo de identificação do melhor caminho até um destino. O roteador conectado ao segmento 
de rede local é conhecido como gateway padrão (default gateway).

### Gateway Padrão 

O gateway padrão é o dispositivo de rede (ou seja, roteador ou switch da Camada 3) que pode rotear o tráfego para outras redes.

Em uma rede, um gateway padrão geralmente é um roteador com esses recursos:

* Ele possui um endereço IP local no mesmo intervalo de endereços que outros hosts na rede local.
* Ele pode aceitar dados na rede local e encaminhar dados para fora da rede local.
* Ele direciona o tráfego para outras redes.

Um gateway padrão é necessário para enviar tráfego fora da rede local. O tráfego não pode ser encaminhado para 
fora da rede local se não houver gateway padrão, o endereço de gateway padrão não estiver configurado ou o 
gateway padrão estiver inativo.

### Um host direciona para o gateway padrão

Uma tabela de roteamento de host normalmente inclui um gateway padrão. No IPv4, o host recebe o endereço IPv4 
do gateway padrão dinamicamente do DHCP (Dynamic Host Configuration Protocol) ou configurado manualmente. No 
IPv6, o roteador anuncia o endereço de gateway padrão ou o host pode ser configurado manualmente.

A configuração do gateway padrão cria uma rota padrão na tabela de roteamento do computador.
***Uma rota padrão é a rota ou o caminho que o computador usa quando tenta entrar em contato com uma rede remota.***

### Tabelas de Roteamento dos Hosts

Em hosts do Windows, o comando **route print ou netstat -r** pode ser usado para exibir a tabela de roteamento do host.

Esses comandos exibem três seções relacionadas às conexões de rede TCP / IP atuais:

* Lista de interfaces - lista o endereço MAC (Media Access Control) e o número de interface atribuído de todas 
as interfaces com capacidade de rede no host, incluindo adaptadores Ethernet, Wi-Fi e Bluetooth.

* Tabela de rotas IPv4 - lista todas as rotas IPv4 conhecidas, incluindo conexões diretas, rede local e rotas padrão locais.

* Tabela de rotas IPv6 - lista todas as rotas IPv6 conhecidas, incluindo conexões diretas, rede local e rotas padrão locais

##  Introdução ao roteamento

### Decisão de Encaminhamento de Pacotes de roteador

Quando um host envia um pacote para outro host, ele consulta sua tabela de roteamento para determinar para 
onde enviar o pacote. Se o host de destino estiver em uma rede remota, o pacote será encaminhado para o 
gateway padrão, que geralmente é o roteador local.

O que acontece quando um pacote chega na interface do roteador?

O roteador examina o endereço IP de destino do pacote e pesquisa sua tabela de roteamento para determinar para 
onde encaminhar o pacote. A tabela de roteamento contém uma lista de todos os endereços de rede conhecidos 
(prefixos) e para onde encaminhar o pacote. Essas entradas são conhecidas como entradas de rota ou rotas. O 
roteador encaminhará o pacote usando a melhor (mais longa) entrada de rota correspondente.

### Tabela de roteamento do roteador IP

A tabela de roteamento do roteador contém entradas de rota de rede listando todos os possíveis destinos de rede conhecidos.

A tabela de roteamento armazena três tipos de entradas de rota:

* ***Redes conectadas diretamente*** - Essas entradas de rota de rede são interfaces de roteador ativas. Os 
roteadores adicionam uma rota diretamente conectada quando uma interface está configurada com um endereço IP e 
está ativada. Cada interface do roteador está conectada a um segmento de rede diferente. Na figura, as redes 
diretamente conectadas na tabela de roteamento IPv4 R1 seriam 192.168.10.0/24 e 209.165.200.224/30.

* ***Redes remotas*** - Essas entradas de rotas de rede são conectadas a outros roteadores. Os roteadores 
aprendem sobre redes remotas sendo explicitamente configurados por um administrador ou trocando informações de 
rota usando um protocolo de roteamento dinâmico. Na figura, a rede remota na tabela de roteamento IPv4 R1 
seria 10.1.1.0/24.

* ***Rota padrão*** - Como um host, a maioria dos roteadores também inclui uma entrada de rota padrão, um 
gateway de último recurso. A rota padrão é usada quando não há correspondência melhor (mais) na tabela de 
roteamento IP. Na figura, a tabela de roteamento IPv4 R1 provavelmente incluiria uma rota padrão para 
encaminhar todos os pacotes para o roteador R2.

Um roteador pode aprender sobre redes remotas de duas maneiras:

* Manualmente - As redes remotas são inseridas manualmente na tabela de rotas usando rotas estáticas.
* Dinamicamente - As rotas remotas são aprendidas automaticamente usando um protocolo de roteamento dinâmico.

### Roteamento estático

**Rotas estáticas são entradas de rota configuradas manualmente.**
Se houver uma alteração na topologia da rede, a rota estática não será atualizada automaticamente e deverá ser reconfigurada manualmente.

O roteamento estático tem as seguintes características:

* Uma rota estática deve ser configurada manualmente.
* O administrador precisa reconfigurar uma rota estática se houver uma alteração na topologia e a rota estática não for mais viável.
* Uma rota estática é apropriada para uma rede pequena e quando há poucos ou nenhum vínculo redundante.
* Uma rota estática é comumente usada com um protocolo de roteamento dinâmico para configurar uma rota padrão.

### Roteamento Dinâmico

Um protocolo de roteamento dinâmico permite que os roteadores aprendam automaticamente sobre redes remotas, 
incluindo uma rota padrão, de outros roteadores.
Os roteadores que usam protocolos de roteamento dinâmico compartilham automaticamente informações de 
roteamento com outros roteadores e compensam qualquer alteração de topologia sem envolver o administrador da rede.

***Os protocolos de roteamento dinâmico incluem OSPF e Enhanced Interior Gateway Routing Protocol (EIGRP).***

A configuração básica requer apenas que o administrador de rede habilite as redes conectadas diretamente 
dentro do protocolo de roteamento dinâmico. O protocolo de roteamento dinâmico fará automaticamente o seguinte:

* Descobrir redes remotas;
* Manter as informações de roteamento atualizadas;
* Escolha o melhor caminho para as redes de destino;
* Tente encontrar um novo melhor caminho se o caminho atual não estiver mais disponível.

Quando um roteador é configurado manualmente com uma rota estática ou aprende sobre uma rede remota 
dinamicamente usando um protocolo de roteamento dinâmico, o endereço de rede remota e o endereço de próximo 
salto são inseridos na tabela de roteamento IP.

### Introdução a um tabela de roteamento IPv4

O comando de modo EXEC show ip route privilegiado é usado para exibir a tabela de roteamento IPv4 em um roteador Cisco IOS.
No início de cada entrada de tabela de roteamento é um código que é usado para identificar o tipo de rota ou 
como a rota foi aprendida. As fontes comuns de rotas (códigos) incluem:

* L - Endereço IP da interface local diretamente conectado
* C - Rede diretamente conectada
* S - A rota estática foi configurada manualmente por um administrador
* O - OSPF
* D - EIGRP

Uma rota diretamente conectada é criada automaticamente quando uma interface do roteador é configurada com 
informações de endereço IP e é ativada
O roteador adiciona duas entradas de rota com os códigos C (ou seja, a rede conectada) e L (ou seja, o 
endereço IP da interface local da rede conectada). 
As entradas de rota também identificam a interface de saída a ser usada para alcançar a rede. 

