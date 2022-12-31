// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var nome: String, var nivelDeConhecimento: Nivel)

data class ConteudoEducacional(var nome: String = "kotlin para android" , var duracao: Int?)

class Formacao(val nome: String, var conteudos: List<ConteudoEducacional> ) {
 	
    var inscritos = mutableListOf<Usuario>()
  
    fun matricular(vararg usuario: Usuario) {
        for(user in usuario){
            
            inscritos.add(user)
                
           	when(user.nivelDeConhecimento){
                Nivel.AVANCADO -> conteudos.map{ it.duracao = 20}
                Nivel.INTERMEDIARIO -> conteudos.map{ it.duracao = 40}
                Nivel.BASICO -> conteudos.map{ it.duracao = 60}
                else -> conteudos.map{ it.duracao = 60}
            }   
            
            println("Novo Usuario: $user Cadastrado!")
        }
    }
}

fun main() {
    
    val kotlinExp = Formacao("kotlin", listOf() )
    val user = Usuario("Eduardo", Nivel.BASICO)
    val user2 = Usuario("Maria", Nivel.BASICO)
  	
	kotlinExp.matricular(user, user2)
}