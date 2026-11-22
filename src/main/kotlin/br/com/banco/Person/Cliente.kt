package br.com.banco.Person

import br.com.banco.Account.Conta

class Cliente(
    nome: String,
    cpf: String,
    telefone: String,
    dataNascimento: String,
) : Pessoa(nome, cpf, telefone, dataNascimento) {

    // quando chamar o println na main, passando o objeto inteiro, utilizando o toString mostra os dados
    override fun toString(): String {

        return "Cliente nome= $nome,\n" +
                " cpf= $cpf \n" +
                "Telefone= $telefone \n"+
                "dataNascimento= $dataNascimento\n "

    }


}