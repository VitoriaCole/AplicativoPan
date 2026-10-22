package com.example.console

class MinhaClasse {

}

//fun main() {
//    println("⚔️ BEM-VINDO AO REINO DE KOTLINIA ⚔️")
//    println("Escolha a sua classe:")
//    println("1 - Guerreiro")
//    println("2 - Mago")
//    println("3 - Arqueiro")
//    print("Digite o número da sua escolha: ")
//
//    val escolha = readLine()?.toIntOrNull()
//
//    when (escolha) {
//        1 -> {
//            println("\n🛡️ Você escolheu ser um Guerreiro!")
//            println("Arma inicial: Espada Longa e Escudo de Ferro.")
//            println("Missão: Proteger os portões da cidade dos goblins.")
//        }
//        2 -> {
//            println("\nVocê escolheu ser um Mago!")
//            println("Arma inicial: Cajado Místico e Livro de Feitiços.")
//            println("Missão: Investigar a torre abandonada do bruxo sombrio.")
//        }
//        3 -> {
//            println("\nVocê escolheu ser um Arqueiro!")
//            println("Arma inicial: Arco Recurvo e Aljava Infinita.")
//            println("Missão: Rastrear os bandidos na Floresta Sussurrante.")
//        }
//        else -> {
//            println("\nVocê escolheu ser um Aldeão Desavisado!")
//            println("Arma inicial: Uma colher de pau.")
//            println("Missão: Fugir das galinhas bravas da fazenda!")
//        }
//    }
//}

//fun main() {
//
//    val naipes = listOf("Copas", "Ouros", "Espadas", "Paus")
//
//
//    println(naipes[0])
//
//
//    println(naipes.size)
//
//
//    for (item in naipes) {
//        println(item)
//    }
//}

//fun main(){
//    val mao = mutableListOf<String>()
//        mao.add("Ás de ♥")
//        mao.add("Rei de ♣")
//        println(mao)
//        mao.removeAt(0)
//        println(mao.size)
//}

fun main() {
    saudar("Ana")
    val total = somar(10, 7)
    println(total)
}
fun saudar(nome: String) {
    println("Olá, $nome!")
}
fun somar(a: Int, b: Int): Int {
    return a + b
}

fun main (){
print("digite um numero: ")
    val numero = readln()toIntOrNull()
if (numero != null) {
    println("Dobro: {numero * 2} ")
}else {
    println("isso não é um numero.")
}
}
class Carta( val valor: String, val naipe: String){
    fun descrever() {
        println("$valor de $naipe")
    }
}
fun main() {
    val carta = Carta("Ás", "♠")
    println(carta.valor)
    carta.descrever()
}
}