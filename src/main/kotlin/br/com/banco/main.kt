package br.com.banco

import br.com.banco.Account.ContaCorrente
import br.com.banco.Person.Cliente
import java.math.BigDecimal

fun main (){
    val primeiroCliente = Cliente(
        "Ana",
        "00325385049",
        "82147630258",
        "11/05/1994",
    )
        // criacao da conta,vinculando o cliente
    // cc > conta corrente
    // cp > conta poupança

    val cc01_PrimeiroCliente = ContaCorrente(
        "37381-1",
        primeiroCliente,
        "Conta Corrente",
        BigDecimal.ZERO
    )
    cc01_PrimeiroCliente.exibirDados()

}