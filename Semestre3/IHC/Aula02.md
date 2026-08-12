# Aula 02 

## Os Principios de Donald Norman

[LINK DO ARTIGO](https://www.homemmaquina.com.br/principios-de-design-donald-norman/)

### Primeiro Principio: **Visibilidade**

**As pessoas só vão consumir e indicar um produto que elas conheçam e saibam como utilizar da forma mais eficiente possível.**
Um exemplo seria em apps de comida que precisam ter ícones que estão relacionados ao universo culinário.

### Segundo Principio: **Feedback**

**É necessário criar um mecanismo que dê ao consumidor a mensagem que o aplicativo, página ou software está trabalhando para cumprir a função que lhe foi dada.**

Sabe aqueles círculos ou mensagens de _carregando..._, é basicamente isso, precisamos dar ao usuário algum sinal que o sistema está vivo e trabalhando na tarefa que lhe foi dada.

### Terceiro Principio: **Affordance**

**O consumidor precisa olhar para a aparência de um produto e saber como utiliza-lo.**

psicologicamente isso gera um reforço positivo no usuário, este conceito está relacionado à **acessibilidade do design para o cliente**, ele precisa saber usar o site/software de forma _intuitiva_, e conseguir entender facilmente os diferenciais de seu site.

### Quarto Principio: **Mapeamento**

**Mapeamento é a relação entre controle e efeito das ações do usuário.**

Bons designs mostram ao usuário que **suas ações tem efeito**, a barra de rolagem por exemplo, mostra o qunato você já navegou na página.

### Quinto Principio: **Restrições**

**Quando criamos um design precisamos pensar nas restrições que o produto pode ter.**

Pensar em por exemplo tamanho da tela, temos que pensar em nosso design de uma forma que não conflitem com nossas restrições.

### Sexto Principio: **Consistência**

**Atender bem para atender sempre! Um bom design deve fazer com que a mesma ação gere sempre a mesma reação.**

Vamos pensar no botão de desligar, por exemplo, que em todo lugar/máquina ele tem o mesmo layout.
Temos que pensar também na identidade de marca, pois ela trás essa familiaridade e adpatação ao usuário.

## Código da Aula:
```python
import streamlit as st
import time

st.set_page_config(page_title='IHC Brabo', layout='centered')

st.title('IHC - E os princípios de norman')
st.markdows('---')

tab1, tab2 = st.tabs(['Interface do DJABO', 'Interface Massex'])

with tab1:
    st.subheader('"Tente realizar o cadastro"')
    # IHC (mapeamento memes)
    col1, col2 = st.columns(2)

    with col1:
        btn_falso_confirmar = st.button('CONFIRMAR E SALVAR', use_container_width=True)
    
    with col2:
        btn_falso_cancelar = st.button ('CANCELAR', use_container_width=True)
    
    # IHC (affordance pobre)
    entrada_misteriosa = st.text_input ('Digite Alguma Coisa: ')

    if btn_falso_confirmar:
        st.error('ERRO 0x000912: ação de bosta')
    
    # IHC (Feedback atrasado - o sistema ficará "travado")
    if btn_falso_cancelar:
        with st.empty():
            st.write('Processando...')
            time.sleep(3)
            st.warning('Processi Finalizado') # IHC (ambiguidade)

with tab2:
    st.subheader('Interface Intuitiva')

    # IHC (Affordance e Visibilidade)
    nome_usuario = st.text_input('Nome Completo: ' placeholder='EX: guga the best')

    email_usuario = st.text_input('E-mail para contato: ', placeholder='EX: naomecontate@nada.adeus)

    col_a, col_b = st.columns([1,4])

    with col_a:
        # IHC (destaque visual melhorando a consistência da interface)
        if st.button('Salvar Dados', type='primary'):

            # IHC (Validação dos dados antes de continuar)
            if nome_usuario and email_usuario:

                #IHC (feedback imediato)
                with st.spinner('Comunidando-se com o Servidor'):
                    time.sleep(1)

                # Feedback de sucesso: cor verde e mensagem clara.
                st.sucess(f'Parabéns, {nome_usuario}! Seu cadastro foi bem sucedido!')
            else:

                # Feedback de erro: explicitamente o que ele errou!
                st.error('Usuário você esqueceu de preencher o nome ou e-mail!')

                with col_b:
                    st.button('Limpar Campos', type='secondary')
```

