enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, var duracao: Int)

data class Formacao(var nome: String, var Nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} está matriculado na formacao ${nome}")
    }
}

fun main() {
    
    val usuario1 = Usuario("Hiago")
    val usuario2 = Usuario("Felipe")
    val usuario3 = Usuario("Mariana")
    val usuario4 = Usuario("Luiz")
    val usuario5 = Usuario("Marcos")

    val conteudo1 = ConteudoEducacional("Formação Java", 60)
    val conteudo2 = ConteudoEducacional("Formação Kotlin", 160)
    val conteudo3 = ConteudoEducacional("Formação JavaScript", 70)
    val conteudo4 = ConteudoEducacional("Formação Angular", 20)
    val conteudo5 = ConteudoEducacional("Formação Pyton", 110)

    val formacao = Formacao("Desenvolvedor Full-stack", Nivel.AVANCADO, listOf(conteudo1, conteudo3, conteudo4, conteudo2, conteudo5 ))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)
    formacao.matricular(usuario4)
    formacao.matricular(usuario5)
    
}
    