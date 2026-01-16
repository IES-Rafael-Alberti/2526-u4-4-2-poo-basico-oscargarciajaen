class Libro(val titulo: String, private val autor: String, private val numPaginas: Int, private val leido: Boolean = false) {

    init {
        require(titulo.isNotEmpty()) { "Titulo no puede estar vacío" }
        require(autor.isNotEmpty()) { "Autor no estar vacío" }
        require(numPaginas in 1..5000) { "Las paginas no pueden ser superiores a 5000 o inferiores a 1"}
    }
    constructor(titulo: String, autor: String,): this(titulo, autor, 100, false)

    override fun toString(): String{
        var haSidoLeido = ""
        if (this.leido){
            haSidoLeido = "Sí"
        } else {
            haSidoLeido = "No"
        }
        return "Libro: [${titulo}] por [${autor}], Páginas: [${numPaginas}], Leído: [${haSidoLeido}]"
    }
}

fun main(){
    try {
        val libroIt = Libro("It", "Stephen King", 1428, false)
        val libroResplandor = Libro("El resplandor", "Stephen King", 600, true)
        val libroDesconocido = Libro("", "Bram Stoker")
        println(libroIt)
        println(libroResplandor)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

}