# Aprendendo a fazer um sistema de login e senha com o bruno

## Dicionário de dados

function **dicionario**(){

    let dados = [
        {id: 1, usuario: "nome", senha:"1"}
        {id: 2, usuario: "nome2", senha:"2"}
        {id: 3, usuario: "nome3", senha:"3"}
        ]

    return dados
}

## Exemplo de Função de Login:

function **logar**(){
    let login = document.querySelector("#CaixaDeLogin").value
    let senha = document.querySelector("#CaixaDaSenha").value

    let dados = dicionario()
    for(let i = 0; i < dados.length; i++){
        if (login == dados[i] && senha == dados[i]){
            console.log('cadastro realizado com sucesso')
        }
    }
    
}