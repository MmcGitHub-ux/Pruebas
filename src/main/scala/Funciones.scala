scala> :paste
// Entering paste mode (ctrl-D to finish)

var pares = 0
var impares = 0
for (numeros <- (1 to 100)){
    if (numeros % 2 == 0) pares+=numeros
    else impares+=numeros
}


// Exiting paste mode, now interpreting.

var pares: Int = 2550
var impares: Int = 2500


def cont_pares(inicial: Int, num_final: Int) = {
    var pares = 0
    var impares = 0
    for (elemeto <- (inicial to num_final)){
        if (elemeto % 2 == 0) pares+=1 else impares+=1
        }
    println("Numeros pares:  "+pares)
    println("Numeros impares:  "+impares)
}


def sum(func: Int => Int, ini: Int, fin:Int) = {
    var cont = 0
    for (elemento <- (ini to fin)) {
        println(func(elemento))
        cont+=func(elemento)
    }
    println("la suma de los resultados es: "+cont)
}

sum(i => i + i, 1, 10)

sum(i => {
    if (i%2 == 0) i*i
    else i*i*i
}, 1, 10)

sum(i => {
    if (i%2 == 0) i*i
    else i*2
}, 1, 10)

def sumaFunc(func: Int => Int, ini: Int, fin:Int) = {
    var cont = 0
    for (elemento <- (ini to fin)) {
        println(func(elemento))
    }
}











