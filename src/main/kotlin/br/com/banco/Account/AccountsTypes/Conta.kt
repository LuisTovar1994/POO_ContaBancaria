package br.com.banco.Account.AccountsTypes

import br.com.banco.Account.Exceptions.SaldoInsuficienteException
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
open fun exibirDados() {

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

    // implementações depositar/ sacar

    private fun validarValor(valor: BigDecimal) {
        require(valor > BigDecimal.ZERO) {
            "O valor deve ser maior que zero"
        }
        require(valor.stripTrailingZeros().scale() <= 2) {
            "O valor deve ter no máximo 2 casas decimais"
        }
    }

    fun depositar(valor: BigDecimal) {
        validarValor(valor)
        saldo = saldo.add(valor)
    }

    fun sacar(valor: BigDecimal) {
        validarValor(valor)
        if (valor > saldoDisponivel) {
            throw SaldoInsuficienteException("Saldo indisponivel para o saque")
        }
        saldo = saldo.subtract(valor)
    }


}