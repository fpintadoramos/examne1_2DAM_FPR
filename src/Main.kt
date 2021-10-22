fun main() {

    try {

        println("Introduce una edad valida (de 6 a 12) y un mes valido(de 1 a 12) con el formato edad, mes")
        var entrada = readLine().toString()

        val partes = entrada.split(",")

        var edad = partes[0].trim().toInt()
        var mes = partes[1].trim().toInt()

        if (edad !in 6..12) {

            println("La entrada:" + entrada + "no es valida")
        } else if (mes !in 1..12) {

            println("La entrada:" + entrada + "no es valida")
        } else {

            println("PROGRAMA DE GENERACIÓN DE TABLAS: FERNANDO")

            if (edad in 6..8) {

                println("La edad es: " + edad + ", esta en el rango[6-8]")
                if (mes % 2 == 0) {

                    println("El mes es: " + mes + " es par: {1,3,5}")
                    tablas(1)
                    tablas(3)
                    tablas(5)
                } else {

                    println("El mes es: " + mes + " es impar: {2,4}")
                    tablas(2)
                    tablas(4)
                }
            }

            if (edad in 9..10) {

                println("La edad es: " + edad + ", esta en el rango[9-10]")
                if (mes % 2 == 0) {

                    println("El mes es: " + mes + " es par: {7,9}")
                    tablas(7)
                    tablas(9)
                } else {

                    println("El mes es: " + mes + " es impar: {6,8,10}")
                    tablas(6)
                    tablas(8)
                    tablas(10)

                }
            }

            if (edad in 11..12) {

                println("La edad es: " + edad + ", esta en el rango[11-12]")
                if (mes % 2 == 0) {

                    println("El mes es: " + mes + " es par: {14,15,16}")
                    tablas(14)
                    tablas(15)
                    tablas(16)
                } else {

                    println("El mes es: " + mes + " es impar: {11,12,13}")
                    tablas(11)
                    tablas(12)
                    tablas(13)
                }
            }
        }
    } catch (e: Exception) {

        println("La entrada no es valida")
    }
}

fun tablas(num: Int) {

    println("********Tabla del " + num + "********")
    for (i in 1..10) {

        println("$num x $i = ${num * i}")
    }
    println("")
    println("")
}