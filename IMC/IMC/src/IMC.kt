fun main() {

    //Criando os objetos pessoas e instanciando
    var pessoa1: Pessoas = Pessoas()
    var pessoa2: Pessoas = Pessoas()



        //Métodos para setar os nomes
        print("\n*******************************\n")
        print("Digite um nome para a pessoa 1: ")
        var entrada: String = readln()
        pessoa1.definirNome(entrada)

        print("Digite um nome para a pessoa 2: ")
        entrada = readln()
        pessoa2.definirNome(entrada)


        // Try - Catch para digitar um número válido para idade
        while (true)
            try {

                //Métodos para setar as idades
                print("\n*********************************")
                print("\nDigite uma idade para a pessoa 1: ")
                entrada = readln()
                pessoa1.definirIdade(entrada.toInt())

                print("Digite uma idade para a pessoa 2: ")
                entrada = readln()
                pessoa2.definirIdade(entrada.toInt())
                break
            } catch (e: NumberFormatException) {
                print("Por favor, digite um número!!!\n")
            }


        // Try - Catch para digitar um número válido para peso
        while (true)
            try {

                //Métodos para setar os pesos
                print("\n*******************************")
                print("\nDigite um peso para a pessoa 1: ")
                entrada = readln()
                pessoa1.definirPeso(entrada.toDouble())

                print("Digite um peso para a pessoa 2: ")
                entrada = readln()
                pessoa2.definirPeso(entrada.toDouble())
                break
            } catch (e: NumberFormatException) {
                print("Por favor, digite um número!!!\n")
            }


        // Try - Catch para digitar um número válido para altura
        while (true)
            try {

                //Métodos para setar as alturas
                print("\n**********************************")
                print("\nDigite uma altura para a pessoa 1: ")
                entrada = readln()
                pessoa1.definirAltura(entrada.toDouble())

                print("Digite uma altura para a pessoa 2: ")
                entrada = readln()
                pessoa2.definirAltura(entrada.toDouble())
                break
            } catch (e: NumberFormatException) {
                print("Por favor, digite um número!!!\n")
            }


        //Calculando o IMC das pessoas
        pessoa1.calcularIMC(pessoa1.peso, pessoa1.altura)
        pessoa2.calcularIMC(pessoa2.peso, pessoa2.altura)


        //Mostrando os dados da pessoa 1
        println("\nO nome da pessoa 1: ${pessoa1.mostrarNome()}")
        println("A idade da pessoa 1: ${pessoa1.mostrarIdade()} anos")
        println("O peso da pessoa 1: ${pessoa1.mostrarPeso()} Kg")
        println("A altura da pessoa 1: ${String.format("%.2f", pessoa1.mostrarAltura())} cm")
        println("O IMC da pessoa 1: ${String.format("%.2f", pessoa1.mostrarIMC())}")

        //Condições do IMC para a pessoa 1
        if (pessoa1.imc < 18.5) {
            print("Abaixo do peso ideal!\n")
        } else if (pessoa1.imc >= 18.5 && pessoa1.imc <= 24.9) {
            print("Peso normal!\n")
        } else if (pessoa1.imc >= 25 && pessoa1.imc <= 29.9) {
            print("Acima do peso!\n")
        } else if (pessoa1.imc >= 30 && pessoa1.imc <= 34.9) {
            print("Obesidade grau 1!\n")
        } else if (pessoa1.imc >= 35 && pessoa1.imc <= 39.9) {
            print("Obesidade grau 2!!\n")
        } else {
            print("Obesidade grau 3!!!\n")
        }


        //Mostrando os dados da pessoa 2
        println("\nO nome da pessoa 2: ${pessoa2.mostrarNome()}")
        println("A idade da pessoa 2: ${pessoa2.mostrarIdade()} anos")
        println("O peso da pessoa 2: ${pessoa2.mostrarPeso()} Kg")
        println("A altura da pessoa 2: ${String.format("%.2f", pessoa2.mostrarAltura())} cm")
        println("O IMC da pessoa 2: ${String.format("%.2f", pessoa2.mostrarIMC())}")

        //Condições do IMC para a pessoa 2
        if (pessoa2.imc < 18.5) {
            print("Abaixo do peso ideal!\n")
        } else if (pessoa2.imc >= 18.5 && pessoa2.imc <= 24.9) {
            print("Peso normal!\n")
        } else if (pessoa2.imc >= 25 && pessoa2.imc <= 29.9) {
            print("Acima do peso!\n")
        } else if (pessoa2.imc >= 30 && pessoa2.imc <= 34.9) {
            print("Obesidade grau 1!\n")
        } else if (pessoa2.imc >= 35 && pessoa2.imc <= 39.9) {
            print("Obesidade grau 2!!\n")
        } else {
            print("Obesidade grau 3!!!\n")
        }
}



