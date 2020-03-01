fun main(args: Array<String>) {
    println(":: Bienvenido a Recipe Maker ::\n")
    val parrafo = """
        Selecciona la opción deseada
        1.  Hacer una receta
        2.  Ver mis recetas
        3.  Salir
    """.trimIndent()
    println("\n $parrafo")

    println("Coloque la opción deseada:")
    val response: String? = readLine()


        if (response != null) {
            when (response) {
                "1" -> println("Escriba la receta que desea agregar:")
                "2" -> println("Se muestra las recetas guardadas")
                "3" -> println("Muchas gracias por utilizar la app")
                else -> println("Por favor, ingrese una opción valida:")

            }
        }
}
