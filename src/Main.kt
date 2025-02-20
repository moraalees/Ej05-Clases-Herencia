package src

fun tomarPrestado(usuario: Usuario, libro: Libro){
    when (usuario) {
        is Usuario.Visitante -> println("Los visitantes no pueden tomar prestados libros.")
        is Usuario.Estudiante -> println("${usuario.nombre} (Estudiante) puede tomar prestado '${libro.titulo}' por 14 días.")
        is Usuario.Profesor -> println("${usuario.nombre} (Profesor) puede tomar prestado '${libro.titulo}' por 30 días.")
    }
}

fun main(){
    val libro = Libro("Las 1000 leyendas", "JK Rowling", 1996)

    val visitante = Usuario.Visitante("77325", "Alfredo")
    val estudiante = Usuario.Estudiante("63920", "Juan", "Dermatología")
    val profesor = Usuario.Profesor("11902", "Luis", "Ciencia Atómica")

    tomarPrestado(visitante, libro)
    tomarPrestado(estudiante, libro)
    tomarPrestado(profesor, libro)
}