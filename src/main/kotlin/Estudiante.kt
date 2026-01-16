class Estudiante(private val nombre: String) {

    var nota: Double = 0.0
        set(value) {
            require (value >= 0.0 && value <= 10.0) {"Nota inválida"}
            field = value
        }

    override fun toString(): String {
        return "Estudiante: [${nombre}], Nota: [${nota}] "
    }
}

fun main(){
    try {
        val estudiante1 = Estudiante("josemi")
        estudiante1.nota = 7.0
        println(estudiante1)
        val estudiante2 = Estudiante("ignacio")
        estudiante2.nota = 11.0
        println(estudiante2)
        val estudiante3 = Estudiante("juanillo")
        estudiante3.nota = -1.0
        println(estudiante3)
    }catch (e: Exception){
        println(e.message)
    }
}