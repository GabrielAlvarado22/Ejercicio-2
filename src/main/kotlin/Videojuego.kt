class Videojuego: Entregable {
    var titulo: String
    var horasEstimadas: Int
    var entregado: Boolean
    var genero: String
    var creador: String

    init{
        titulo= ""
        horasEstimadas= 10
        entregado= false
        genero= ""
        creador= ""
    }

    constructor()

    constructor(titulo_v: String, horasEstimadas_v: Int){
        this.titulo= titulo_v
        this.horasEstimadas= horasEstimadas_v
    }

    constructor(titulo_v: String, horasEstimadas_v:Int, genero_v:String,  creador_v: String){
        this.titulo= titulo_v
        this.horasEstimadas= horasEstimadas_v
        this.genero= genero_v
        this.creador= creador_v
    }

    override fun entregar() {
        this.entregado=true
    }

    override fun devolver() {
        this.entregado=false
    }

    override fun isEntregado():Boolean{
        return this.entregado
    }
}