function dados(){
    const ds = [
        {id: 1, nome: "ringo", login: "baterista", senha: "64", email: "ringo@beatles",},
        {id: 2, nome: "John", login: "vocalista", senha: "9", email: "john@beatles",},
        {id: 3, nome: "Paul", login: "baixista", senha: "vivo", email: "paul@beatles",},
        {id: 4, nome: "George", login: "Guitarista", senha: "revolution", email: "jorge@beatles",},

    ]
    let json = JSON.stringify(ds) // pasando pro formato JSON (java script object notation)
    localStorage.setItem("banco", json) // gravando dados na Base local de dados do navegador
}


function cadastrar(){

    const banco = JSON.parse(localStorage.getItem("banco"))

    let n = document.querySelector("#nmInput").value
    let l = document.querySelector("#loginInput").value
    let sn = document.querySelector("#senhaInput").value
    let e = document.querySelector("#emailInput").value

    let usuario = {id: Date.now(), nome: n, login: l, senha: sn, email: e,}

    banco.push(usuario)

    let json = JSON.stringify(banco)
    localStorage.setItem("banco", json)

    // const vetor = [usuario]

    // console.log(vetor)

}