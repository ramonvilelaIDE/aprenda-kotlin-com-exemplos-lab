// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val name: String)


data class ConteudoEducacional(var nome: String, val duracao: Int)


data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()


    fun matricular(vararg usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.addAll(usuario)

    }
}


fun main() {
 
    /*TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    */

    val kotlin = listOf(
        ConteudoEducacional("Conhecendo a linguagem Kotlin", 200),
        ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 240),
        ConteudoEducacional("Exercícios Kotlin", 120)
    )

    val java = listOf(
        ConteudoEducacional("Conhecendo a linguagem Java", 240),
        ConteudoEducacional("Programação Orientada a Objetos em Java", 300 ),
        ConteudoEducacional("Desafios em Java", 180)
    )

    val aluno1 = Usuario("Bárbara Lima")
    val aluno2 = Usuario("Ramon Vilela")
    val aluno3 = Usuario("Joselma Silva")

    val cursoKotlin = Formacao("Curso Linguagem Kotlin", kotlin, Nivel.INTERMEDIARIO)
    val cursoJava = Formacao("Curso Linguagem Java", java, Nivel.BASICO)

    cursoJava.matricular(aluno1, aluno2)
    cursoKotlin.matricular(aluno2, aluno3)

    println("Alunos matriculados no curso Java: ${cursoJava.inscritos.joinToString { it.name }}")
    println("Alunos matriculados no curso Kotlin: ${cursoKotlin.inscritos.joinToString { it.name }}")
    
}