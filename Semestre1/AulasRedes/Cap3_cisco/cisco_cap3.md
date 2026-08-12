# As Regras (?)

## Dispositivos em Uma Bolha

Nós vemos redes atráves dos diagramas de topologia certo? certo. Os dispositivos veem a rede de forma peculiar, pense como se eles estivesssem dentro de bolhas, ou seja ele só sabe as informações sobre si próprio, e pensando nisso são os protocolos que fazem os dispositivos terem mais consciencia da rede, sabendo assim algumas informações sobre ela, como para onde suas mensagens vão e etc.
Os protocolos são as regras que regem como uma rede se comunica. A rede é divida em pedaços, em pacotes para ser mais exato, e é aqui que os protocolos agem, fazendo assim com que os pacotes cheguem em seus destinos.

Os protocolos _"DHCP/ICMPv6"_ forneçem informações sobre os endereçamentos IP, informando ao dispositivo, a qual rede ele pertence, endereço de gateway padrão, endereço do servidor DNS.
O _TCP_ é um protocolo utilizado para garantir a fiabilidade, ou seja ele garante que todas as informações enviadas e recebidas serão enviadas, pois caso algum endereço IP não faça a entrega o TCP reenviara as informações.

## Fundamentos das Comunicações

Os metodos de comunicação tem três elementos comuns
 * Fonte da Mensagem (remetente) - As fontes da mensagem são pessoas ou dispositivos eletrônicos que precisam enviar uma mensagem para outras pessoas ou dispositivos.
 * Destino da mensagem (destinatário) - O destino recebe a mensagem e a interpreta.
 * Canal - Consiste na mídia que fornece o caminho pelo qual a mensagem viaja da origem ao destino.

A comunicação é regida por protocolos, eles são específicos para o metódo de comunicação que está sendo usado.

## Estabelecimento de regras

Os protocolos devem ter em conta os seguintes requisitos para entregar com êxito uma mensagem compreendida pelo receptor:
 * Um emissor e um receptor identificados;
 * Língua e gramática comum;
 * Velocidade e ritmo de transmissão;
 * Requisitos de confirmação ou recepção

## Requisitos de Protocolo de rede

Além de identificar a origem e o destino, os protocolos de computadores e de redes definem os detalhes sobre como uma mensagem é transmitida por uma rede. Protocolos de computador comuns incluem os seguintes requisitos:

 * Codificação de mensagens;
 * Formatação e encapsulamento de mensagens;
 * Tamanho da mensagem;
 * Tempo da mensagem;
 * Opções de envio de mensagem.

## Codificação de Mensagem

Uma das etapas iniciais do envio de uma mensagem é codificá-la. Codificação é o processo de conversão da informação pra uma forma mais aceitável de transmissão. A decodificação é o processo inverso para interpretar a mensagem.
Mensagens na rede são convertidas em bits antes de serem enviadas, Cada bit é codificado em um padrão de tensões em fios de cobre, luz infravermelha em fibras ópticas ou microondas para sistemas sem fio.

## Formatação e encapsulamento de mensagens

Ao enviar uma mensagem, é necessário usar um formato ou uma estrutura específica, que variam dependendo do tipo de mensagem e do canal. Aqui também é identificado o endereço do remetente e do destinatário.

## Tamanho da mensagem 

Na comunicação entre computadores, quando mensagens muito longas são enviadas o host de origem a divide em partes, e envia as partes separadas, cada uma dessas partes/quadros tem suas próprias informações de endereço, o host final vai recontruir essas partes na mensagem original, mensagens muito longas ou muito curtas não são enviadas, existe um tamanho max e min para as mensagens.

## Tempo De Mensagem

O tempo da mensagem é algo muito importante na comunicação, sendo composto pelas seguintes caracteristicas:

 * **Controle de Fluxo**: Processo de gerenciamento da taxa de transmissão, define quanta informação pode ser enviada e a velocidade que pode ser entregue;
 * **Tempo Limite de Resposta**: Os hosts da rede usam protocolos de rede que especificam quanto tempo esperar pelas respostas e que ação executar se ocorrer um tempo limite de resposta.
 * **Método de Acesso**: Determina quando alguém pode enviar uma mensagem,quando um dispositivo deseja transmitir em uma LAN sem fio, é necessário que a placa de interface de rede (NIC) da WLAN determine se a mídia sem fio está disponível.

## Opções de envio de mensagem

Essas opções se referem a para quantas máquinas a máquina:
 * **Unicast** - As informações estão sendo transmitidas para um único dispositivo final.
 * **Multicast** - Informações estão sendo transmitidas para um ou mais dispositivos finais.
 * **Broadcast** - Informações estão sendo transmitidas para todos os dispositivos finais

# Protocolos

## Visão Geral do Protocolo de Rede

Os protocolos de rede definem um formato comum e um conjunto de regras para a troca de mensagens entre dispositivos. Estes são implementados por dispositivos finais e intermediários em software, hardware ou ambos.

[tabela tipos de Protocolos](../imagens/tabela_tiposProtocolos.png)

## Funções de Protocolo de Rede

[Tabela Funções dos Protocolos de Rede](../imagens/tblFuncoesProtocolos.png)

## Interação dos Protocolos

Esse capitulo literalmente não falou nada sobre o assunto do título, de qualquer forma um protocolo realmente precisa o outro pra funcionar.

**Protocolo de transferência de hipertexto (HTTP)** - Este protocolo controla a maneira como um servidor da web e um cliente da web interagem. O HTTP define o conteúdo e formatação das solicitações e respostas trocadas entre o cliente e o servidor. Tanto o software do cliente quanto o do servidor Web implementam HTTP como parte da aplicação. O HTTP conta com outros protocolos para reger o modo como as mensagens são transportadas entre cliente e servidor.
**Transmission Control Protocol (TCP)** - Este protocolo gerencia as conversas individuais. A TCP é responsável por garantir a entrega confiável das informações e gerenciar o controle de fluxo entre os dispositivos finais.
**Protocolo Internet (IP)** - Este protocolo é responsável por entregar mensagens do remetente para o receptor. IP é usado por roteadores para encaminhar como mensagens em várias redes.
**Ethernet** - Este protocolo é responsável pela entrega de mensagens de uma NIC para outra NIC na mesma rede local (LAN) Ethernet.

# Conjuntos de Protocolos

## Conjuntos de Protocolos de Rede

Conjuntos de Protocolo de rede são moldados pra trabalhar juntos sem problemas. Conjuntos de protocolos _são grupos de protocolos inter-relacionados_ que servem para executar uma função de comunicação.
O funcionamento de protocolos em um Suíte(switch?), funciona como uma pilha, esses são _organizados em camadas_, sendo que os protocolos de camadas superiores se focam no conteúdo da mensagem enviada e d_ependem das funcionalidades definadas pelos de nível inferior_, Os protocolos de camadas inferiores se **relacionam com a movimentação de dados pela rede** e _fornecimento de serviços_ as camadas superiores.

**OBS:Suítes de Protocolos são grupos de regras que funcionam em conjunto para ajudar a resolver um problema.**

## Exemplo de Protocolo TCP/IP

Estes protocolos estão disponíveis para as camadas aplicativos, transporte e internet. Esses protocolos não estão na camada de acesso a rede.
Os protocolos LAN da camada de Acesso a rede mais usados são os **Ethernet** e **WLAN(LAN sem fio)**.
Esses protocolos da camada de acesso a rede entregam o pacote IP pela mídia física.

## Suíte de Protocolos TCP/IP

TCP/IP = Conjunto de Protocolos usados pela internet e as redes. Eles tem dois aspectos **IMPORTANTES**:

 * Conjunto de protocolos de padrão aberto - Isso significa que está disponível gratuitamente ao público e     pode ser usado por qualquer fornecedor em seu hardware ou software.
 * Conjunto de protocolos com base em padrões - isso significa que foi endossado pela indústria de rede e aprovado por uma organização de padrões. Isso garante que produtos de diferentes fabricantes possam interoperar com êxito.

### Protocolos da Camada de Aplicação

#### Sistema de nomes

 * DNS - Sistema de nomes de domínio. Converte nomes de domínio, como cisco.com, em endereços IP.

#### Configuração de hosts

 * DHCPv4 - Protocolo de configuração de host dinâmico para IPv4. Um servidor DHCPv4 atribui dinamicamente informações de endereçamento IPv4 aos clientes DHCPv4 na inicialização e permite que os endereços sejam reutilizados quando não forem mais necessários.
 * DHCPv6 - Protocolo de Configuração do Host Dinâmico para IPv6. DHCPv6 é semelhante ao DHCPv4. Um servidor * DHCPv6 atribui dinamicamente informações de endereçamento IPv6 aos clientes DHCPv6 na inicialização.
 * SLAAC - Configuração automática de endereço sem estado. Um método que permite que um dispositivo obtenha suas informações de endereçamento IPv6 sem usar um servidor DHCPv6.

#### E-mail

 * SMTP -Protocolo de transferência de correio simples. Permite que os clientes enviem e-mails para um servidor de e-mail e permite que os servidores enviem e-mails para outros servidores.
 * POP3 - Post Office Protocol versão 3. Permite que os clientes recuperem e-mails de um servidor de e-mail e baixem o e-mail para o aplicativo de e-mail local do cliente.
 * IMAP - Protocolo de Acesso à Mensagem na Internet. Permite que os clientes acessem o e-mail armazenado em um servidor de e-mail e também mantenham o e-mail no servidor.

#### Transferência de arquivos

 * FTP - Protocolo de transferência de arquivos. Define as regras que permitem que um usuário em um host acesse e transfira arquivos para e de outro host em uma rede. O FTP é um protocolo de entrega de arquivos confiável, orientado a conexão e reconhecido.
 * SFTP - Protocolo de transferência de arquivos SSH. Como uma extensão do protocolo Secure Shell (SSH), o * SFTP pode ser usado para estabelecer uma sessão segura de transferência de arquivos na qual a transferência é criptografada. SSH é um método para login remoto seguro que normalmente é usado para acessar a linha de comando de um dispositivo.
 * TFTP - Protocolo de Transferência de Arquivos Trivial. Um protocolo de transferência de arquivos simples e sem conexão com entrega de arquivos não confirmada e de melhor esforço. Ele usa menos sobrecarga que o FTP.

#### Web e serviço Web

 * HTTP - Protocolo de transferência de hipertexto. Um conjunto de regras para a troca de texto, imagens gráficas, som, vídeo e outros arquivos multimídia na World Wide Web.
 * HTTPS - HTTP seguro. Uma forma segura de HTTP que criptografa os dados que são trocados pela World Wide Web.
 * REST - Representational State Transfer. Um serviço Web que utiliza interfaces de programação de aplicações (APIs) e pedidos HTTP para criar aplicações Web

### Protocolos da Camada De Transporte

#### Conexão orientada

 TCP - Protocolo de controle de transmissão. Permite a comunicação confiável entre processos executados em hosts separados e fornece transmissões confiáveis e reconhecidas que confirmam a entrega bem-sucedida.

#### Sem Conexão

 UDP - Protocolo de datagrama do usuário. Permite que um processo em execução em um host envie pacotes para um processo em execução em outro host. No entanto, o UDP não confirma a transmissão bem-sucedida do datagrama.

### Protocolos Da Camada de Internet

#### Protocolo IP (Internet Protocol)

 * IPv4 - Protocolo da Internet versão 4. Recebe segmentos de mensagem da camada de transporte, empacota mensagens em pacotes e endereça pacotes para entrega de ponta a ponta através de uma rede. O IPv4 usa um endereço de 32 bits.
 * IPv6 - IP versão 6. Semelhante ao IPv4, mas usa um endereço de 128 bits.
 * NAT - Tradução de endereços de rede. Converte endereços IPv4 de uma rede privada em endereços IPv4 públicos globalmente exclusivos.

#### Mensagens

 * ICMPv4 - Protocolo de mensagens de controle da Internet para IPv4. Fornece feedback de um host de destino para um host de origem sobre erros na entrega de pacotes.
 * ICMPv6 - ICMP para IPv6. Funcionalidade semelhante ao ICMPv4, mas é usada para pacotes IPv6.
 * ICMPv6 ND - Descoberta de vizinho ICMPv6. Inclui quatro mensagens de protocolo que são usadas para resolução de endereço e detecção de endereço duplicado.

#### Protocolos de roteamento

 * OSPF - Abrir o caminho mais curto primeiro. Protocolo de roteamento de estado de link que usa um experimento hierárquico baseado em áreas. OSPF é um protocolo de roteamento interno padrão aberto.
 * EIGRP - Protocolo de roteamento de gateway interno aprimorado. Um protocolo de roteamento de padrão aberto desenvolvido pela Cisco que usa uma métrica composta com base na largura de banda, atraso, carga e confiabilidade.
 * BGP - Protocolo de gateway de fronteira. Um protocolo de roteamento de gateway externo padrão aberto usado entre os Internet Service Providers (ISPs). O BGP também é comumente usado entre os ISPs e seus grandes clientes particulares para trocar informações de roteamento.

### Protocolos da Camada de Acesso a Rede

#### Resolução de endereços

 ARP - Protocolo de Resolução de Endereço. Fornece mapeamento de endereço dinâmico entre um endereço IPv4 e um endereço de hardware.

 Observação: Você pode ver outro estado de documentação que o ARP opera na Camada da Internet (Camada OSI 3). No entanto, neste curso, afirmamos que o ARP opera na camada de Acesso à Rede (OSI Camada 2) porque seu objetivo principal é descobrir o endereço MAC do destino. Um endereço MAC é um endereço da camada 2.

#### Protocolos de link de dados

 * Ethernet - Define as regras para os padrões de fiação e sinalização da camada de acesso à rede.
 * WLAN - Rede local sem fio. Define as regras para sinalização sem fio nas frequências de rádio de 2,4 GHz e 5 GHz.

# Colocar essas anotações no arquivo **cisco_cap3**

# Modelos De Referência

## Os benefícios de usar um modelo em camadas

Modelos de rede são úteis pois eles permitem que nós tenhamos uma consciência de o que está acontecendo com os pacotes e etc, afinal na vida real não é possível ver pacotes de rede viajando.
Por isso um modelo em camadas é usado para modularizar as operações de uma rede em camadas gerenciáveis.

Benefícios de usar esse tipo de modelo:
 * Auxiliar no projeto de protocolos porque os protocolos que operam em uma camada específica definiram as  informações sobre as quais atuam e uma interface definida para as camadas acima e abaixo.
 * Fomentar a concorrência porque produtos de diferentes fornecedores podem trabalhar juntos.
 * Impedir que alterações de tecnologia ou capacidade em uma camada afetem outras camadas acima e abaixo
 * Fornecer uma linguagem comum para descrever funções e capacidades de rede.

Existem dois modelos em camadas que são usados para isso:

 * Modelo de referência OSI (Open System Interconnection)
 * Modelo de referência TCP / IP

## Modelo de Referência OSI

Esse modelo fornece uma extensa lista de funções e serviços que podem ocorrer em cada camada, tal modelo oferece também consistência em todos os tipos de protocolo e serviços, assim descrevendo o que deve ser feitos em camadas específicas, sem mostrar uma forma obrigatória de como deve ser feito.
Esse modelo também descreve a interação entre as camadas que estão diretamente relacionadas. 

[Tabela Camadas OSI](../imagens/tblCamadasOSI.png)

## Modelo de Protocolo TCP/IP

Esse modelo é usado para comunicação entre redes, este modelo TCP/IP é um modelo de protocolo que descreve as funções que ocorrem em cada camada dos protocolos dentro da suíte TCP/IP.

[Tabela do Modelo de Protocolo TCP/IP](../imagens/tblModelTCPIP.png)

## Comparação entre o Modelo OSI e o Modelo TCP/IP

As principais semelhanças se encontram nas camadas de transporte e rede, e sua principal diferença está em como as camadas de cima e de baixo se relacionam.

 * A Camada OSI 3, a camada de rede, é mapeada diretamente para a camada de Internet TCP / IP. Essa camada é usada para descrever os protocolos que endereçam e encaminham mensagens em uma rede interconectada.
 * A Camada OSI 4, a camada de transporte, mapeia diretamente para a camada de transporte TCP / IP. Essa camada descreve os serviços e as funções gerais que fornecem uma entrega ordenada e confiável de dados entre os hosts origem e destino.
 * A camada de aplicativos TCP / IP inclui vários protocolos que fornecem funcionalidade específica para uma variedade de aplicativos do usuário final. As camadas 5, 6 e 7 do modelo OSI são usadas como referências para desenvolvedores e fornecedores de software de aplicação para produzir aplicaçõesque operam em redes.
 * Ambos os modelos TCP/IP e OSI são usados geralmente para referenciar protocolos em várias camadas. Como o modelo OSI separa a camada de enlace de dados da camada física, geralmente é usado para referenciar as camadas inferiores.

