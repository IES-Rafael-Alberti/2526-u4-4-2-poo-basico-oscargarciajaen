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
        val estudiante2 = Estudiante("ignacio")
        val estudiante3 = Estudiante("juanillo")
        estudiante1.nota = 7.0
        estudiante2.nota = 8.0
        estudiante3.nota = 9.0
        println(estudiante1)
        println(estudiante2)
        println(estudiante3)
    }catch (e: Exception){
        println(e.message)
    }
}