# Endereçamento IPv6

## Endereçamento dinâmico para GUAs IPv6

### Mensagens RS e RA

Para o GUA, um dispositivo obtém o endereço dinamicamente através de mensagens ICMPv6 (Internet Control 
Message Protocol versão 6). 
Os roteadores IPv6 enviam mensagens ICMPv6 de RA a cada 200 segundos para todos os dispositivos habilitados 
para IPv6 na rede. 
Uma mensagem de RA também é enviada em resposta a um host que envie uma mensagem ICMPv6 de RS (Solicitação de Roteador).
As mensagens RS são enviadas a todos os roteadores IPv6 por hosts solicitando informações de endereçamento.
Mensagens RA são enviadas para todos os nós IPv6. 
Se o Método 1 (somente SLAAC) for usado, o RA incluirá informações de prefixo de rede, prefixo e gateway padrão.
As mensagens de RA estão em interfaces Ethernet de roteador IPv6. 
O roteador deve estar habilitado para roteamento IPv6, que não está habilitado por padrão.
Para ativar um roteador como roteador IPv6, deve ser usado o comando de **ipv6 unicast-routing** configuração 
global ipv6 unicast-routing.
A mensagem ICMPv6 de RA é uma sugestão para um dispositivo sobre como obter um endereço IPv6 unicast global. 
A decisão final é do sistema operacional do dispositivo. A mensagem ICMPv6 de RA inclui:

* **Prefixo de rede e comprimento do prefixo** - Informa ao dispositivo a que rede ele pertence.
* **Endereço do gateway padrão** - É um endereço LLA IPv6, o endereço IPv6 origem da mensagem de RA.
* **Endereços DNS e nome de domínio** - Endereços de servidores DNS e um nome de domínio.

Existem três métodos para mensagens RA:

**Method 1: SLAAC** - “Eu tenho tudo o que você precisa, incluindo o prefixo, comprimento do prefixo e 
endereço de gateway padrão.”

**Method 2: SLAAC com um servidor DHCPv6 sem estado** - "Aqui estão as minhas informações, mas você precisa 
obter outras informações, como endereços DNS, de um servidor DHCPv6 sem estado".

**Method 3: DHCPv6 com estado (sem SLAAC)** - “Posso dar-te o seu endereço de gateway padrão. 
Você precisa pedir a um servidor DHCPv6 com estado para todas as suas outras informações.”

### Método 1 - SLAAC

SLAAC é um método que permite que um dispositivo crie seu próprio GUA sem os serviços do DHCPv6.
