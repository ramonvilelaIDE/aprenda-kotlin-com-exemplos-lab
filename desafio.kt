// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome: String) {
    val usuario = nome
	

data class ConteudoEducacional(val nome: String, var duracao: Int = 60, val nivel: Nivel){
    
}

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario ){
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    	
       return println("$usuario $inscritos")
        
    
        
    }
}



fun main() {
    /*TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")*/
    val usuario: Usuario = "Aluno"
    usuario.matricular(usuario)
   
}
