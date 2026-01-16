class Producto(private val nombre: String, private val precio: Double, private var stock: Int) {

    init {
        require(precio > 0.0) { "El precio debe ser positivo" }
        require(stock > 0) { "El stock debe ser positivo" }
    }

    override fun toString(): String {
        return "Producto: [${nombre}], Precio: [${precio}]€, Stock: [${stock}]"
    }

    fun vender(cantidad: Int){
        require(cantidad <= this.stock) {"Cantidad inválida"}
        this.stock -= cantidad
    }

    fun reabastecer(cantidad: Int){
        require(cantidad > 0) {"Cantidad inválida"}
        this.stock += cantidad
    }
}

fun main(){
    try {
        val producto1 = Producto("sofá", 149.95, 7)
        val producto2 = Producto("Porsche", 250000.0, 200)
        val producto3 = Producto("Silla", 22.0, 500)

        try{
            producto2.vender(10)
            println(producto2)
            producto3.reabastecer(10)
            println(producto3)
        } catch (e: Exception) {
            println(e.message)
        }

    } catch (e: Exception) {
        println(e.message)
    }

}