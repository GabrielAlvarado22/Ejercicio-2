import Serie
import Videojuego

fun main(args: Array<String>) {

    var s = arrayOf<Serie>()
    var v = arrayOf<Videojuego>()
    var cantS: Int= 0
    var cantJ: Int= 0

    val s1 = Serie("Titans",3,"Ciencia Ficcion","Akiva Goldsman")
    val s2= Serie("Juego del calamar",1,"Misterio","Hwang Dong-Hyuk")
    val s3 = Serie("Teen Wolf",5,"Sobrenatural","Jeff Davis")
    val s4 = Serie("Buffy la cazavampiros",8,"Sobrenatural","Joss Whedon")
    val s5 = Serie("Friends",15,"Comedia","David Crane")

    val v1 = Videojuego("Pokemon White",50,"RPG","Nintendo")
    val v2 = Videojuego("Kirby",35,"Plataforma","Nintendo")
    val v3 = Videojuego("Assassins Creed",40,"Activision","")
    val v4 = Videojuego("Leyend of Zelda",60,"RPG","Nintendo")
    val v5 = Videojuego("God Of War",30,"Accion","EpicGames")

    s = s.plus(s1)
    s = s.plus(s2)
    s = s.plus(s3)
    s = s.plus(s4)
    s = s.plus(s5)

    v = v.plus(v1)
    v = v.plus(v2)
    v = v.plus(v3)
    v = v.plus(v4)
    v = v.plus(v5)

    s[0].entregar()
    s[2].entregar()
    s[4].entregar()

    v[0].entregar()
    v[2].entregar()
    v[4].entregar()


    for (i in s.indices){
        if(s[i].entregado==true){
            cantS++
        }
    }

    for (i in v.indices){
        if(v[i].entregado==true){
            cantJ++
        }
    }

    println("Cantidad de series que se han entregado:" + cantS)
    println("Cantidad de videojuegos que se han entregado:" + cantJ)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}