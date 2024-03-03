fun main() {

    //Inicializando a variável de escolhas do usuário
    var escolha: Int = 0

    //Inicializando o Loop, até o usuário digitar 5
    while (escolha != 5) {

        //Começo do Programa
        println("\n--------------- Guru ---------------")
        println("Seja Bem-Vindo a Calculadora do Guru")

        print("\nDigite um número: ")
        val num1 = readLine()?.toDoubleOrNull()

        print("\nDigite mais um número: ")
        val num2 = readLine()?.toDoubleOrNull()

        //Verifica se os números digitados são null
        if (num1 == null || num2 == null) {
            println("\nPor favor, insira números válidos!")
            return
        }

        //Criando o menu de opções do usuário
        println("\nSelecione uma opção\n")
        println("[1] Adição")
        println("[2] Subtração")
        println("[3] Multiplicação")
        println("[4] Divisão")
        println("[5] Sair")
        print("\nDigite a opção selecionada: ")
        escolha = readLine()?.toIntOrNull()!!


        //Definindo o que será feito com cada entrada do usuário
        when (escolha) {
            1 -> {
                val soma = num1 + num2
                println("\nO resultado da adição de $num1 + $num2 é: $soma")
            }

            2 -> {
                val sub = num1 - num2
                println("\nO resultado da subtração de $num1 - $num2 é: $sub")
            }

            3 -> {
                val mult = num1 * num2
                println("\nO resultado da multiplicação de $num2 * $num2 é: $mult")
            }

            4 -> {
                val div = num1 / num2
                println("\nO resultado da divisão de $num1 / $num2 é: $div")
            }

            5 -> {
                println("\nObrigado por usar a Calculadora do Guru! <3")
                break;
            }

            else -> {
                println("\nPor favor, insira uma opção correta!")
            }
        }
    }
}

