package br.com.banco.Account

import br.com.banco.Person.Cliente
import java.math.BigDecimal
import java.math.RoundingMode

class ContaPoupanca (
    numeroConta: String,
    titular: Cliente,
    override val tipo: String = "Conta Poupança",
    taxaRendimentoInical: BigDecimal = BigDecimal("0.005")
): Conta(numeroConta,titular) {

    var taxaRendimento: BigDecimal = taxaRendimentoInical
        private set

    init{
        require(taxaRendimento >= BigDecimal.ZERO){
            "A taxa de rendimento não pode ser negativa"
        }
    }

    override val saldoDisponivel: BigDecimal
        get() = saldo

    fun aplicarRndimento(){
        val rendimento = saldo.multiply(taxaRendimento)
        saldo = saldo.add(rendimento).setScale(2, RoundingMode.HALF_UP)
    }

}