package br.com.banco.Account.AccountsTypes

import br.com.banco.Person.Cliente
import java.math.BigDecimal

class ContaCorrente(
    numeroConta: String,
    titular: Cliente,
    override val tipo: String = "Conta Corrente",
    limiteInicial: BigDecimal = BigDecimal("500.00")
): Conta(numeroConta,titular) {

    // colocando limite de R$ 500,00

    var limite: BigDecimal= limiteInicial
    private set

    // Toda vez que alguém acessar conta.saldoDisponivel, ele calcula na hora

    override val saldoDisponivel: BigDecimal
        get() = saldo.add(limite)


    fun atualizarLimite(novoLimite: BigDecimal){
        require(novoLimite >= BigDecimal.ZERO){"O limite não pode ser negativo."}
        limite = novoLimite
    }



}