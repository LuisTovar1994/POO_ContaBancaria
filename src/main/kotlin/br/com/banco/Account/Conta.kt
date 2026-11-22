package br.com.banco.Account

import br.com.banco.Person.Cliente
import java.math.BigDecimal
// construtor primario ()
// valores quando o objeto é criado
abstract class Conta(
    val numeroConta: String,
    val titular: Cliente,

    )
// tudo que fica {} é o corpo da classe, ficam os métodos
{

    abstract val tipo: String
    abstract val saldoDisponivel: BigDecimal

   var saldo: BigDecimal = BigDecimal.ZERO
    protected set

    init {
        require(numeroConta.isNotBlank()) {
            "O número da conta não pode estar vazio ou em branco"
        }
    }
// metodo para quando for chamado na main, informar os dados do cliente
fun exibirDados() {

    println(
        "--- Dados do Titular ---\n" +
                "Nome: ${titular.nome}\n" +
                "CPF: ${titular.cpf}\n" +
                "Telefone: ${titular.telefone}\n" +
                "Data Nascimento:${titular.dataNascimento}"
    )

    println(
        "--- Dados da Conta ---\n " +
                "Número da Conta: $numeroConta\n" +
                "Tipo: $tipo\n" +
                "Saldo: R$ $saldoDisponivel\n"
    )




    }
}