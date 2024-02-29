// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int = 365)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.hashCode()} matriculado na formação $nome")
    }
}
fun main() {
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 90)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 120)
    
    val formacao = Formacao("Desenvolvimento de Software", listOf(conteudo1, conteudo2))
    
    val usuario1 = Usuario()
    val usuario2 = Usuario()
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}

