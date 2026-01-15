class CuentaBanco(val titular: String, private var saldo: Double = 0.0) {
    fun ingresar(cantidad: Int){
        require(cantidad > 0) {"Cantidad no válida"}
        this.saldo += cantidad
        println("El saldo es $saldo")

    }

    fun retirar(cantidad:Int){
        require(this.saldo > cantidad) {"Saldo insuficiente" }
        this.saldo -= cantidad
        println("El saldo es $saldo")
    }
}

fun main() {
    val cuenta1 = CuentaBanco("josemi")
    try {
        cuenta1.ingresar(100)
        cuenta1.retirar(50)
    } catch (e: IllegalArgumentException) {
        println("${e.message}")
    }
}