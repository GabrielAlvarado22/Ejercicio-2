class Serie: Entregable {
    var titulo: String
    var numTemporadas: Int
    var entregado: Boolean
    var genero: String
    var creador: String

    init{
        titulo= ""
        numTemporadas= 3
        entregado= false
        genero= ""
        creador= ""
    }

    constructor()

    constructor(titulo_s: String, creador_s: String){
        this.titulo= titulo_s
        this.creador= creador_s
    }

    constructor(titulo_s: String, numTemporadas_s:Int, genero_s:String,  creador_s: String)/*: this(titulo_s, numTemporadas_s, false, genero_s, creador_s)*/{
        this.titulo= titulo_s
        this.numTemporadas= numTemporadas_s
        this.genero= genero_s
        this.creador= creador_s
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