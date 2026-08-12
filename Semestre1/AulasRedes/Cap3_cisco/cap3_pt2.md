# Encapsulamento de Dados

## Segmentando Mensagens

A melhor abordagem para transmissão de dados na rede é dividir os dados em pequenos pedaços que são mais fáceis de gerenciar.

A segmentação é o _processo de **dividir** um fluxo de dados em **unidades menores** para transmissão_.
A segmentação é necessária pois as redes usam os conjuntos TCP/IP que envia dados em pacotes IP individuais.
Mesmo que pacotes tenham o mesmo destino, isso não garante que eles serão enviados pelo mesmo caminho.

E **Multiplexação** é uma forma de enviar múltiplos sinais ou fluxos de informação por um link de comunicação simultaneamente, na forma de um único sinal complexo.
O objetivo é aumentar a eficiência e a velocidade de transmissão do canal, mesmo em longas distâncias.

As duas principais vantagens da Segmentação:

 * **Aumenta a velocidade** - Como um fluxo de dados grande é segmentado em pacotes, grandes quantidades de dados podem ser enviadas pela rede sem amarrar um link de comunicação. Isso permite que muitas conversas diferentes sejam intercaladas na rede chamada multiplexação.
 * **Aumenta a eficiência** - Se um único segmento não conseguir alcançar seu destino devido a uma falha na rede ou no congestionamento da rede, somente esse segmento precisa ser retransmitido em vez de reenviar todo o fluxo de dados

## Sequenciamento

Nas comunicações de rede cada segmento/parte das mensagens tem um "número identificador" que define a ordem que as informações devem ser montadas, para que a mensagem original apareça corretamente.
O protocolo responsável por sequenciar as partes das mensagens é o TCP.

## Unidades de Dados de Protocolo

Conforme os dados da aplicação passam pelos protocolos, várias informações de protocolos são adicionadas a cada nível. Esse é o tal do **Processo de Encapsulamento** 

**OBS: Embora a PDU UDP seja chamada de datagrama, os pacotes IP às vezes também são referidos como datagramas IP**

O formato assumido por uma parte de dados em qualquer camada se chama **Unidade de Dados de Protocolo(UDP/PDU)**. Durante o encapsulamento, cada camada sucessora encapsula o PDU que da camada superior de acordo com o protocolo que está sendo usado. Cada etapa desse processo, as PDU recebem nomes diferentes para refletir suas novas funções. Não há uma nomenclatura universal de PDUs. 

## Exemplo de Encapsulamento 

Quando mensagens estão sendo enviadas em uma rede, o processo de encapsulamento **funciona de cima pra baixo**.
Em cada camada, as informações da _camada superior_ são consideradas **dados encapsulados** no protocolo.

## Exemplo de Desencapsulamento

O desencapsulamento é o **processo usado por um dispositivo receptor para remover um ou mais cabeçalhos de protocolo**. Esse processo ocorre á medida que a mensagem/dados se movem em direção á aplicação final.

# Acesso a Dados

## Endereços 

As camadas de _rede e de enlace de dados_ são responsáveis por **entregar os dados do dispositivo origem para o dispositivo destino**. Cada uma dessas camadas dão finalidades diferentes para os endereços.

 * Endereços de origem e destino da camada de rede - Responsável por entregar o pacote IP da origem original ao destino final, que pode estar na mesma rede ou em uma rede remota.
 * Endereços de origem e destino da camada de enlace de dados - Responsável por fornecer o quadro de enlace de dados de uma placa de interface de rede (NIC) para outra NIC na mesma rede.

[Tabela enderecos](../imagens/tblEnderecos.png)

## Endereço lógico da camada 3

O Ip é o endereço lógico da camada de rede/camada 3. Usado para entregar o pacote Ip da origem ao final. 
Os pacotes IP contém dois endereços:

 * Endereço IP de origem - O endereço IP do dispositivo de envio, que é a fonte original do pacote.
 * Endereço IP de destino - O endereço IP do dispositivo receptor, que é o destino final do pacote.

Um endereço IP tem duas partes:

 * Parte da rede (IPv4) ou Prefixo (IPv6) - A parte mais à esquerda do endereço que indica a rede na qual o endereço IP é um membro. Todos os dispositivos na mesma rede terão a mesma parte da rede no endereço.
 * Parte do host (IPv4) ou ID da interface (IPv6) - A parte restante do endereço que identifica um dispositivo específico na rede. Essa parte é exclusiva para cada dispositivo ou interface na rede.

**OBS: A máscara de sub-rede (IPv4) ou comprimento do prefixo (IPv6) é usada para identificar a parte da rede de um endereço IP da parte do host.**

## Função dos endereços da camada de enlace de dados - Mesma rede IP

Quando remetende e destinatário estiverem na mesma rede, o quadro de enlace será enviado de forma direta para o dispositivo receptor. Na rede ethernet os endereços do link de dados são conhecidos como endereços Ethernet Media Access Control (MAC).
OS endereços MAC são imbutidos fisicamente na NIC Ethernet:

* Endereço MAC de origem - Este é o endereço do link de dados, ou o endereço MAC Ethernet, do dispositivo que envia o quadro de link de dados com o pacote IP encapsulado. O endereço MAC da placa de rede Ethernet do PC1 é AA-AA-AA-AA-AA-AA, escrito em notação hexadecimal.
* Endereço MAC de destino - Quando o dispositivo receptor está na mesma rede do dispositivo remetente, este é o endereço do link de dados do dispositivo receptor. Neste exemplo, o endereço MAC de destino é o endereço MAC do servidor FTP: CC-CC-CC-CC-CC-CC, escrito em notação hexadecimal.

## Função dos Endereços  da camada de Rede

Quando o remetente do pacote estiver em uma rede diferente da do destinatário, os endereços de origem e destino representarão hosts em redes diferentes. Isso é indicado pela porção da rede do endereço IP do host destino. 

## Função dos endereços da camada de enlace de dados - Redes IP diferentes

Quando remetente e destinatário estão em redes diferentes, não será possível enviar o quadro de enlace de dados Ethernet de forma direta, Nesse caso o quadro Ethernet deve ser enviado a outro dispositivo como roteador ou gateway padrão. 
* Endereço MAC de origem - O endereço MAC Ethernet do dispositivo de envio, PC1. O endereço MAC da interface Ethernet do PC1 é AA-AA-AA-AA-AA-AA.
* Endereço MAC de destino - Quando o dispositivo receptor, o endereço IP de destino, está em uma rede diferente do dispositivo remetente, o dispositivo remetente usa o endereço MAC Ethernet do gateway ou roteador padrão. Neste exemplo, o endereço MAC de destino é o endereço MAC da interface Ethernet R1, 11-11-11-11-11-11. Esta é a interface que está conectada à mesma rede que PC1, como mostrado na figura.

É importante que o endereço IP do gateway padrão seja configurado em cada host na rede local. Todos os pacotes para destino nas redes remotas são enviados para o gateway padrão. 

## Endereços de enlace de dados

O endereço físico da camada 2 do link de dados(endereço de enlace) _tem como função_ **fornecer o quadro de enlace de dados de uma interface de rede para outra na mesma rede**.
Antes mesmo do pacote IP ser enviado por qualquer tipo de rede com ou sem fio, ele é **encapsulado em um quadro de enlace de dados**, só assim ele é transmitido pela mídia física.
Conforme o pacote IP viaja pela rede (entre host e host, host e roteador e etc) ele é encapsulado em um novo quadro de enlace de dados, a cada ponto que ele passa (hosts pra roteadores e tal). E cada um desses quadros contém o endereço de enlace de dados de origem da placa NIC que envia o quadro, e o endereço de enlace da placa NIC de destino que recebe o quadro.
Na camada 2, o protocolo de enlace é usado apenas para entregar o pacote NIC para outro NIC da mesma rede. O roteadore remove as informações da camada 2 quando é recebido na NIC e adiciona novas informações de enlace antes de encaminhar a NIC de saída no seu caminho para o destino final.

O pacote IP é encapsulado em um quadro de link de dados que contém as seguintes informações de link de dados:

* Endereço de link de dados de origem - O endereço físico da NIC que está enviando o quadro de link de dados.
* Endereço de link de dados de destino - O endereço físico da NIC que está recebendo o quadro de link de dados. Esse endereço é o roteador do próximo salto ou o endereço do dispositivo de destino final.
