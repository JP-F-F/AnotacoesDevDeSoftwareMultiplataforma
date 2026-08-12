# Camada de Rede

## Características da camada de rede

### A camada de rede

A camada de rede, ou Camada OSI 3, fornece serviços para permitir que dispositivos finais troquem dados entre redes.
***Os IPv4 e IPv6 são os principais protocolos de comunicação dessa camada.***
Outros protocolos de camada de rede incluem protocolos de roteamento, como OSPF (Open Shortest Path First) e 
protocolos de mensagens, como ICMP (Internet Control Message Protocol).

Operações básicas da camada de rede:

* **Endereçamento de dispositivos finais** - Os dispositivos finais devem ser configurados com um endereço IP 
exclusivo para identificação na rede.

* **Encapsulamento** - A camada de rede encapsula a unidade de dados de protocolo (PDU) da camada de transporte em 
um pacote. O processo de encapsulamento adiciona informações de cabeçalho IP, como os endereços IP dos hosts 
origem (emissor) e destino (receptor). O processo de encapsulamento é executado pela origem do pacote IP.

* **Roteamento** - A camada de rede fornece serviços para direcionar os pacotes para um host de destino em outra 
rede. Para trafegar para outras redes, o pacote deve ser processado por um roteador. A função do roteador é 
escolher o melhor caminho e direcionar os pacotes para o host de destino em um processo conhecido como 
roteamento. Um pacote pode atravessar muitos roteadores antes de chegar ao host de destino. Cada roteador que 
um pacote atravessa para chegar ao host de destino é chamado de salto.

* **Desencapsulamento** - Quando o pacote chega na camada de rede do host de destino, o host verifica o cabeçalho 
IP do pacote. Se o endereço IP de destino no cabeçalho corresponder ao seu próprio endereço IP, o cabeçalho IP 
será removido do pacote. Depois que o pacote é desencapsulado pela camada de rede, a PDU resultante da Camada 
4 é transferida para o serviço apropriado na camada de transporte. O processo de desencapsulamento é executado 
pelo host de destino do pacote IP.

Os protocolos de comunicação da camada de rede (ou seja, IPv4 e IPv6) especificam a estrutura de pacotes e o 
processamento usado para transportar os dados de um host para outro hospedeiro. 

### Encapsulamento IP

O IP encapsula o segmento da camada de transporte (a camada logo acima da camada de rede) ou outros dados 
adicionando um cabeçalho IP. O cabeçalho IP é usado para entregar o pacote ao host de destino.

os segmentos da camada de transporte podem ser imediatamente empacotados por IPv4 , IPv6 ou qualquer protocolo 
que venha a ser desenvolvido no futuro.

O cabeçalho IP é examinado por dispositivos de Camada 3 (ou seja, roteadores e switches de Camada 3) à medida 
que viaja através de uma rede até seu destino. É importante notar que as informações de endereçamento IP 
permanecem as mesmas desde o momento em que o pacote sai do host de origem até chegar ao host de destino, 
exceto quando traduzidas pelo dispositivo que executa a Tradução de Endereços de Rede (NAT) para IPv4.

### Características do IP 

O IP foi desenvolvido como um protocolo com baixa sobrecarga. Ele fornece apenas as funções necessárias para 
enviar um pacote de uma origem a um destino por um sistema interconectado de redes.
O protocolo não foi projetado para rastrear e gerenciar o fluxo de pacotes

Estas são as características básicas da IP:

* **Sem conexão** - Não há conexão com o destino estabelecido antes do envio de pacotes de dados.
* **Melhor esforço** - o IP é inerentemente não confiável, porque a entrega de pacotes não é garantida.
* **Independente da mídia** - A operação é independente do meio (ou seja, cobre, fibra ótica ou sem fio) que carrega os dados.

### Sem Conexão

O IP não tem conexão, o que significa que n**enhuma conexão ponta a ponta dedicada é criada pelo IP** antes que os dados sejam enviados.
A comunicação sem conexão é conceitualmente semelhante a enviar uma carta a alguém sem notificar o destinatário com antecedência.
o IP não requer troca inicial de informações de controle para estabelecer uma conexão ponto a ponto antes do encaminhamento dos pacotes.

### Melhor Esforço

O IP também não requer campos adicionais no cabeçalho para manter uma conexão estabelecida(reduzindo assim a 
sobrecarga do IP).
Sem conexão de ponta a ponta pré-estabelecida, os remetentes não sabem se os dispositivos de destino estão 
presentes e funcionais ao enviar pacotes, nem sabem se o destino recebe o pacote ou se o dispositivo de 
destino pode acessar e ler o pacote.

***O IP não garante que o pacote será recebido.***

### Independente de mídia

Não confiável significa que o IP não tem a capacidade de gerenciar e recuperar pacotes não entregues ou corrompidos.
Isso ocorre porque eles não contêm informações que podem ser processadas para informar ao remetente se a entrega foi bem-sucedida.
**O IP não tem capacidade de retransmitir os pacotes em caso de erros.**

Se os pacotes forem entregues fora de ordem ou estiver faltando algum pacote, as aplicações que usam os dados, 
ou serviços de camada superior, deverão resolver esses problemas.
***No conjunto de protocolos TCP / IP, a confiabilidade é o papel do protocolo TCP na camada de transporte***.

O IP opera independentemente da mídia que transporta os dados nas camadas inferiores da pilha de protocolos.
A camada de enlace de dados OSI é responsável por pegar um pacote IP e prepará-lo para transmissão pelo meio de comunicação.

Há, no entanto, uma característica muito importante dos meios físicos que a camada de rede considera: o 
**tamanho máximo da PDU que cada meio consegue transportar**. **Essa característica é chamada de unidade máxima de** 
**transmissão (maximum transmission unit - MTU).** Parte das comunicações de controle entre a camada de enlace de 
dados e a camada de rede é a definição de um tamanho máximo para o pacote. A camada de enlace de dados passa o 
valor da MTU para a camada de rede. A camada de rede então determina o tamanho que os pacotes podem ter.

Em alguns casos, um dispositivo intermediário, geralmente um roteador, **deve dividir** um pacote IPv4 ao 
encaminhá-lo de um meio para outro com uma MTU menor. Esse processo é chamado **fragmentação do pacote** ou 
fragmentação. ***A fragmentação causa latência.*** Os pacotes IPv6 **não podem** ser fragmentados pelo roteador.

## O Pacote IPv4

### Cabeçalho do IPv4

O cabeçalho do pacote IPv4 é usado para garantir que esse pacote seja entregue para sua próxima parada no 
caminho para seu dispositivo final de destino.
O cabeçalho de um pacote IPv4 consiste em campos com informações importantes sobre o pacote. Esses campos 
contêm números binários que são examinados pelo processo da Camada 3.

### Campos do cabeçalho IPv4

Campos significativos no cabeçalho IPv4 incluem o seguinte:

* **Versão** - Contém um valor binário de 4 bits definido como 0100 que identifica isso como um pacote IPv4.

* **Serviços diferenciados ou DiffServ (DS)** - Anteriormente chamado de campo tipo de serviço (ToS), o campo 
DS é um campo de 8 bits usado para determinar a prioridade de cada pacote. Os seis bits mais significativos do 
campo DiffServ são os bits do ponto de código de serviços diferenciados (DSCP) e os dois últimos são os bits 
de notificação de congestionamento explícita (ECN).

* **Tempo de vida (TTL)** - TTL contém um valor binário de 8 bits usado para limitar a vida útil de um pacote. 
O dispositivo de origem do pacote IPv4 define o valor TTL inicial. É diminuído em um cada vez que o pacote é 
processado por um roteador. Se o campo TTL for decrementado até zero, o roteador descartará o pacote e enviará 
uma mensagem ICMP de tempo excedido para o endereço IP de origem. Como o roteador decrementa o TTL de cada 
pacote, o roteador também deve recalcular a soma de verificação do cabeçalho.

* **Protocolo** - Este campo é usado para identificar o próximo nível de protocolo. O valor binário de 8 bits 
indica o tipo de carga de dados que o pacote está carregando, o que permite que a camada de rede transfira os 
dados para o protocolo apropriado das camadas superiores. Valores comuns incluem ICMP (1), TCP (6) e UDP (17). 
Checksum de * cabeçalho - Isso é usado para detectar corrupção no cabeçalho IPv4.

* **Endereço IPv4 de origem** - Contém um valor binário de 32 bits que representa o endereço IPv4 de origem do 
pacote. O endereço de origem IPv 4 é sempre um endereço unicast.

* **Endereço IPv4 de destino** - Contém um valor binário de 32 bits que representa o endereço IPv4 de destino do pacote. O endereço IPv4 destino é um endereço unicast, multicast, ou broadcast.

Os campos Tamanho do Cabeçalho de Internet (IHL), Tamanho Total e Soma de Verificação do Cabeçalho servem para identificar e validar o pacote.

## Pacote IPv6

### Limitações do IPv4

O IPv4 enfrenta 3 grandes problemas

* **Esgotamento do endereço IPv4** - O IPv4 tem um número limitado de endereços públicos exclusivos 
disponíveis. Embora haja aproximadamente 4 bilhões de endereços IPv4, o número crescente de novos dispositivos 
habilitados para IP, conexões sempre ativas e o potencial de crescimento de regiões menos desenvolvidas têm 
aumentado a necessidade de mais endereços.

* **Falta de conectividade ponto a ponto** - Network Address Translation (NAT) é uma tecnologia comumente 
implementada em redes IPv4. A NAT é uma forma de vários dispositivos compartilharem um único endereço IPv4 
público. No entanto, como o endereço IPv4 público é compartilhado, o endereço IPv4 de um host de rede interna 
fica oculto. Isso pode ser problemático para tecnologias que exigem conectividade de ponta a ponta.

* **Maior complexidade da rede** _ Embora o NAT tenha ampliado a vida útil do IPv4, ele só se destinava a ser 
um mecanismo de transição para o IPv6. O NAT em suas várias implementações cria complexidade adicional na 
rede, criando latência e dificultando a solução de problemas.

### Visão geral do IPv6

As melhorias que o IPv6 fornece incluem o seguinte:

* **Espaço de endereço aumentado** - os endereços IPv6 são baseados no endereçamento hierárquico de 128 bits, em 
oposição ao IPv4 com 32 bits.

* **Manipulação aprimorada de pacotes** - O cabeçalho IPv6 foi simplificado com menos campos.

* **Elimina a necessidade de NAT** - com um número tão grande de endereços IPv6 públicos, o NAT entre um endereço 
IPv4 privado e um IPv4 público não é necessário. Isso evita alguns dos problemas induzidos por NAT enfrentados 
por aplicativos que exigem conectividade de ponta a ponta.

### Cabeçalho do IPv6

Os campos no cabeçalho do pacote IPv6 incluem o seguinte:

* ***Versão*** - Este campo contém um valor binário de 4 bits definido como 0110 que identifica isso como um pacote IP versão 6.

* ***Classe de tráfego*** - Este campo de 8 bits é equivalente ao campo DSv (Serviços diferenciados de IPv4).

* ***Etiqueta de fluxo*** - Este campo de 20 bits sugere que todos os pacotes com a mesma etiqueta de fluxo 
recebam o mesmo tipo de manipulação pelos roteadores.

* ***Comprimento da carga útil*** - Este campo de 16 bits indica o comprimento da parte dos dados ou da carga 
útil do pacote IPv6. Isso não inclui o comprimento do cabeçalho IPv6, que é um cabeçalho fixo de 40 bytes.

* ***Próximo cabeçalho*** - Este campo de 8 bits é equivalente ao campo Protocolo IPv4. Ele exibe o tipo de 
carga de dados que o pacote está carregando, permitindo que a camada de rede transfira os dados para o 
protocolo apropriado das camadas superiores.

* ***Limite de salto*** - Este campo de 8 bits substitui o campo TTL IPv4. Esse valor é subtraído de um por 
cada roteador que encaminha o pacote. Quando o contador atinge 0, o pacote é descartado e uma mensagem de 
ICMPv6 com tempo excedido é encaminhada para o host de envio. Isso indica que o pacote não atingiu seu destino 
porque o limite de salto foi excedido. Ao contrário do IPv4, o IPv6 não inclui uma soma de verificação do 
cabeçalho IPv6, porque esta função é executada nas camadas inferior e superior. Isso significa que a soma de 
verificação não precisa ser recalculada por cada roteador quando diminui o campo Limite de Saltos, o que 
também melhora o desempenho da rede.

* ***Endereço IPv6 de origem*** - Este campo de 128 bits identifica o endereço IPv6 do host de envio.

* ***Endereço IPv6 de destino*** - Este campo de 128 bits identifica o endereço IPv6 do host de recebimento.

Um pacote IPv6 pode conter também cabeçalhos de extensão (EH), que fornecem informações de camada de rede. 
Opcionais, os cabeçalhos de extensão ficam posicionados entre o cabeçalho IPv6 e a carga. Eles são usados para 
fragmentação, segurança, suporte à mobilidade e muito mais.

