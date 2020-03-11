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
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> println("Muchas gracias por utilizar la app")
            else -> println("Por favor, ingrese una opción valida:")

        }
    }
}

fun makeRecipe(){
    println("""
        Hacer receta
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
    """.trimIndent())
    return
}

fun viewRecipe(){
    println("Ver mis recetas")
    return
}

