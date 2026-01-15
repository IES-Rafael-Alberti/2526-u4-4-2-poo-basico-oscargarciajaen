class Vehiculo(private val marca: String, private val modelo: String, private var kilometraje: Double = 0.0) {

    fun registrarViaje(kilometros: Double){
        require(kilometros > 0.0){ "Kilometros invalidos" }
        this.kilometraje += kilometros
    }

    override fun toString(): String = "$marca $modelo | $kilometraje km"
}

fun main(){
    val porshe = Vehiculo("Porsche", "911 Carrera", 0.0)
    try {
        porshe.registrarViaje(100.0)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
    println(porshe)
}