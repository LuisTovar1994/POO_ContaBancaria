package br.com.banco

class Cliente(
    nome: String,
    cpf: String,
    telefone: String,
    dataNascimento: String,
    val numeroConta: String = ""
) : Pessoa(nome, cpf, telefone, dataNascimento) {

    // quando chamar o println na main, passando o objeto inteiro, utilizando o toString mostra os dados
    override fun toString(): String {
        return "Cliente(nome= $nome,\n" +
                " cpf= $cpf \n" +
                "Telefone= $telefone \n"+
                "dataNascimento= $dataNascimento \n"+
                "numeroConta= $numeroConta )"

    }

}