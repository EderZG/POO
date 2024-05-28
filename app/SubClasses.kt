class SubClasses {
    private var name = "Padre"
    fun presentar(): String {return name}

    class Anidada {
        private val nameAnidada = "Anidada"
        fun presentar(): String {return nameAnidada}
    }
}