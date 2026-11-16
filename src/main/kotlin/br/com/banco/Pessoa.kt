package br.com.banco

abstract class Pessoa(
    val nome: String,
    cpf: String,
    val telefone: String,
    val dataNascimento: String

) {
    // informa o cpf já sem espacos, tratando para que não passe de 11 digitos
    val cpf = cpf.filter { it.isDigit() }

    init {
        require(this.cpf.length == 11 && this.cpf.all { it.isDigit() }) {
            "CPF inválido: '${this.cpf}'. O CPF deve conter exatamente 11 dígitos numéricos."
        }
    }
}
