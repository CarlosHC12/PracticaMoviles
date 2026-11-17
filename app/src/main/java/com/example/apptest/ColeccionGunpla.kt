package com.example.apptest

object ColeccionGunpla {
    val gunplas = mutableListOf(
        Gunpla(1, "Cien años de soledad", 1.144f, "Novela", "Papel"),
        Gunpla(2, "Sapiens", 1.100f, "Ensayo", "Electrónico"),
        Gunpla(3, "Veinte poemas de amor y una canción desesperada", 1.144f, "Poesía", "Papel")
    )
    private var ultimoId = gunplas.size
// ...: las funciones, en la diapositiva siguiente

    object Biblioteca {
        // ...: `libros` y `ultimoId`, en la diapositiva anterior
        fun anadir(modelo: String, escala: Float, grado: String, serie: String) {
            ultimoId++
            gunplas.add(Gunpla(ultimoId, modelo, escala, grado, serie))
        }
        fun buscar(id: Int): Gunpla? = gunplas.find { it.id == id }
        fun borrar(id: Int) {
            gunplas.removeAll { it.id == id }
        }
        fun borrarTodos() {
            gunplas.clear()
        }
    }
}

