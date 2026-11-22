package br.com.banco

import br.com.banco.Account.AccountsTypes.ContaCorrente
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
    //criando segundo cliente
    val segundoCliente = Cliente(
        "Luis",
        "78959401943",
        "64890317283",
        "04/11/1987"
    )
    val cc01_SegundoCliente = ContaCorrente(
        "73819-1",
        segundoCliente,
        "Conta Corrente",
        BigDecimal.ZERO
    )
    // primeiro Cliente
    cc01_PrimeiroCliente.depositar(BigDecimal("100.00"))
    cc01_PrimeiroCliente.sacar(BigDecimal("50.00"))

    cc01_PrimeiroCliente.exibirDados()

    // Segundo Cliente

    cc01_SegundoCliente.exibirDados()

}