class Pessoas {

    //Criando as variáveis
    var nome: String = ""
    var idade: Int = 0
    var peso: Double = 0.0
    var altura: Double = 0.0
    var imc: Double = 0.0

    //Método para mostrar o nome
    fun mostrarNome(): String {
        return nome
    }

    //Método para mostrar a idade
    fun mostrarIdade(): Int {
        return idade
    }

    //Método para mostrar o peso
    fun mostrarPeso(): Double {
        return peso
    }

    //Método para mostrar a altura
    fun mostrarAltura(): Double {
        return altura
    }

    //Método para gravar o nome
    fun definirNome(n: String) {
        nome = n
    }

    //Método para gravar a idade
    fun definirIdade(i: Int) {
       idade = i
    }

    //Método para gravar o peso
    fun definirPeso(p: Double) {
        peso = p
    }

    //Método para gravar a altura
    fun definirAltura(a: Double) {
        altura = a
    }

    //Método para calcular o IMC
    fun calcularIMC(peso: Double, altura: Double) {
        imc =  (peso / (altura * altura))
    }

    //Método para mostrar o IMC
    fun mostrarIMC(): Double {
        return imc
    }
}