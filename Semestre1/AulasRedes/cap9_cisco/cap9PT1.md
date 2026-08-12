# Resolução de endereços

## MAC e IP

### Destino na mesma rede

Os endereços físicos da camada 2 (ou seja, endereços Ethernet Ethernet) são usados para entregar o quadro de 
enlace de dados com o pacote IP encapsulado de uma NIC para outra NIC que está na mesma rede. Se o endereço IP 
de destino estiver na mesma rede, o endereço MAC de destino será o do dispositivo de destino.

### Destino na rede Remota

Quando o endereço IP de destino (IPv4 ou IPv6) estiver em uma rede remota, o endereço MAC de destino será o 
endereço do gateway padrão do host (ou seja, a interface do roteador).
Os roteadores examinam o endereço IPv4 destino para determinar o melhor caminho para encaminhar o pacote IPv4. 
Quando o roteador recebe o quadro Ethernet, ele desencapsula as informações da Camada 2. 
Usando o endereço IPv4 de destino, ele determina o dispositivo do próximo salto e, em seguida, encapsula o 
pacote IPv4 em um novo quadro de link de dados para a interface de saída.

## ARP

### Visão Geral do ARP

Se sua rede estiver usando o protocolo de comunicações IPv4, o Protocolo de Resolução de Endereços ou ARP é o 
que você precisa para mapear endereços IPv4 para endereços MAC.

Para enviar um pacote para outro host na mesma rede IPv4 local, um host deve saber o endereço IPv4 e o 
endereço MAC do dispositivo de destino. 
Os endereços IPv4 de destino do dispositivo são conhecidos ou resolvidos pelo nome do dispositivo. 
***No entanto, os endereços MAC devem ser descobertos.***

O protocolo ARP serve basicamente para determinar o endereço MAC de destino quando se conhece apenas o endereço IPV4 de um dispositivo local.

O ARP fornece duas funções básicas:
* Resolução de endereços IPv4 em endereços MAC
* Mantendo uma tabela de mapeamentos de endereços IPv4 para MAC

### Funções do ARP

Quando um pacote é enviado à camada de enlace de dados para ser encapsulado em um quadro Ethernet, o 
dispositivo consulta uma tabela em sua memória para encontrar o endereço MAC que é mapeado para o endereço IPv4. 
Esta tabela é armazenada temporariamente na memória RAM e denominada **tabela ARP ou cache ARP.**
O dispositivo emissor pesquisará em sua tabela ARP um endereço IPv4 destino correspondente a um endereço MAC.

* Se o endereço IPv4 destino do pacote estiver na mesma rede que o endereço IPv4 origem, o dispositivo 
pesquisará o endereço IPv4 destino na tabela ARP.
* Se o endereço IPv4 destino do pacote estiver em uma rede diferente do endereço IPv4 origem, o dispositivo 
pesquisará o endereço IPv4 do gateway padrão na tabela ARP.

***Cada entrada (linha) da tabela ARP vincula um endereço IPv4 a um endereço MAC.***
A tabela ARP salva (armazena em cache) temporariamente o mapeamento(relação IPv4 e MAC) dos dispositivos da LAN.
Se o dispositivo localizar o endereço IPv4, seu endereço MAC correspondente será usado como endereço MAC de destino no quadro. 
**Se nenhuma entrada for encontrada, o dispositivo enviará uma requisição ARP.**

### Solicitação ARP

As mensagens do ARP são encapsuladas diretamente em um quadro Ethernet. **Não há cabeçalho IPv4.** 
A requisição ARP é encapsulada em um quadro Ethernet usando as seguintes informações de cabeçalho:

* Endereço MAC de destino - Este é um endereço de broadcast FF-FF-FF-FF-FF-FF, exigindo que todas as NICs  
Ethernet na LAN aceitem e processem a solicitação ARP.
* Endereço MAC de origem - Este é o endereço MAC do remetente da solicitação ARP.
* Tipo - As mensagens ARP têm um campo de tipo 0x806. Ele informa à NIC de recebimento que a parte de dados do 
quadro precisa ser transferida para o processo ARP.

Todas as NICs Ethernet no processo de LAN transmite e devem entregar a solicitação ARP ao seu sistema 
operacional para processamento. 
Cada dispositivo deve processar a requisição ARP para ver se o endereço IPv4 destino corresponde ao seu. 
Um roteador não encaminhará broadcasts pelas outras interfaces.

### Reposta do ARP

***Somente o dispositivo com o endereço IPv4 de destino associado à solicitação ARP responderá com uma resposta ARP.***

A resposta ARP é encapsulada em um quadro Ethernet usando as seguintes informações de cabeçalho:

* Endereço MAC de destino - Este é o endereço MAC do remetente da solicitação ARP.
* Endereço MAC de origem - Este é o endereço MAC do remetente da resposta ARP.
* Tipo - As mensagens ARP têm um campo de tipo 0x806. Ele informa à NIC de recebimento que a parte de dados do 
quadro precisa ser transferida para o processo ARP.

**Se nenhum dispositivo responder à requisição ARP, o pacote será descartado porque não será possível criar um quadro.**

As entradas na tabela ARP têm carimbo de data/hora (timestamp). 
Se um dispositivo não receber um quadro de um dispositivo específico antes que o carimbo de data / hora 
expire, a entrada desse dispositivo será removida da tabela ARP.

Além disso, entradas de mapa estáticas podem ser inseridas em uma tabela ARP, _mas isso é raro_.
As entradas estáticas na tabela ARP **não expiram com o tempo** e devem ser **removidas manualmente.**

### Função ARP nas comunicações Remotas

Sempre que um dispositivo de origem tiver um pacote com um endereço IPv4 em outra rede, ele encapsulará esse 
pacote em um quadro usando o endereço MAC de destino do roteador.
O endereço IPv4 do gateway padrão é armazenado na configuração IPv4 dos hosts.
Quando um host cria um pacote para um destino, ele compara o endereço IPv4 destino e seu próprio endereço IPv4 
para determinar se os dois endereços IPv4 estão localizados na mesma rede de Camada 3.

### Remoção de Entradas da tabela ARP

Em cada dispositivo, um temporizador da cache ARP remove entradas ARP que não tenham sido usadas durante um determinado período.
Os horários diferem dependendo do sistema operacional do dispositivo. 
Por exemplo, os sistemas Windows mais recentes armazenam entradas da tabela ARP entre 15 - 45 segundos.
Os comandos também podem ser usados para remover manualmente algumas ou todas as entradas na tabela ARP. 

### Tabelas ARP

Em um roteador Cisco, **show ip arp** comando é usado para exibir a tabela ARP.

EXEMPLO:
```` 
R1# show ip arp
Protocol  Address          Age (min)  Hardware Addr   Type   Interface
Internet  192.168.10.1            -   a0e0.af0d.e140  ARPA   GigabitEthernet0/0/0
Internet  209.165.200.225         -   a0e0.af0d.e141  ARPA   GigabitEthernet0/0/1
Internet  209.165.200.226         1   a03d.6fe1.9d91  ARPA   GigabitEthernet0/0/1
R1#
````
Em um PC com Windows 10, o **arp -a** comando é usado para exibir a tabela ARP.

### Problemas de ARP - Transmissões de ARP e falsificação de ARP

Em uma rede corporativa típica, esses broadcasts provavelmente teriam impacto mínimo no desempenho da rede.
No entanto, se um grande número de dispositivos precisasse ser ligado e todos começassem a acessar serviços de 
rede ao mesmo tempo, poderia haver alguma redução no desempenho por um curto período.

Um ator de ameaça pode usar **falsificação ARP para realizar um ataque de envenenamento por ARP.**
Esta é uma técnica usada por um ator de ameaça para responder a uma solicitação ARP de um endereço IPv4 que 
pertence a outro dispositivo, como o gateway padrão.
O agente da ameaça envia uma resposta ARP com seu próprio endereço MAC. O destinatário da resposta ARP 
adicionará o endereço MAC errado à sua tabela ARP e enviará esses pacotes ao agente de ameaça.

## Descoberta de Vizinhos de IPv6

### Mensagens de descoberta de vizinhos IPv6

O protocolo IPv6 Descoberta de vizinhos é às vezes referido como ND ou NDP. 
O ND fornece serviços de resolução de endereço, descoberta de roteador e redirecionamento para IPv6 usando 
ICMPv6. O ICMPv6 ND usa cinco mensagens ICMPv6 para executar estes serviços:

* Mensagens de solicitação de vizinho
* Mensagens de anúncio vizinho
* Mensagens de solicitação de roteador
* Mensagens de anúncio do roteador
* Redirecionar mensagem

As mensagens de solicitação de vizinho e anúncio de vizinho são usadas para mensagens de dispositivo a 
dispositivo, como resolução de endereço (semelhante ao ARP para IPv4). 
Os dispositivos incluem computadores host e roteadores.

As mensagens de solicitação de roteador e anúncio de roteador são para mensagens entre dispositivos e roteadores. 
Normalmente, a descoberta de roteador é usada para alocação de endereços dinâmicos e autoconfiguração de endereço sem estado (SLAAC).

### Resolução de endereços

As mensagens Solicitação de vizinho ICMPv6 e Anúncio de vizinho são usadas para a resolução de endereço MAC. 
Isso é semelhante às Solicitações ARP e Respostas ARP usadas pelo ARP para IPv4.
As mensagens de solicitação de vizinhos ICMPv6 são enviadas usando endereços de multicast Ethernet e IPv6 especiais. 
Isso permite que a NIC Ethernet do dispositivo receptor determine se a mensagem de solicitação de vizinho é 
para si mesmo sem ter que enviá-la para o sistema operacional para processamento.
