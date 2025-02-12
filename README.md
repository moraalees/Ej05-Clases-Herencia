# Ej05-Clases-Herencia

Imagina que estás construyendo un sistema para una biblioteca que gestiona libros y usuarios. Este sistema deberá poder manejar distintos tipos de items en la biblioteca (libros, revistas, DVDs) y distintos tipos de usuarios (estudiante, profesor, visitante).

***Parte 1: Definir data class***

Libro: Título (String), Autor (String) y Año de Publicación (Int)

Revista: Título (String), Issue (Int), Año (Int)

DVD: Título (String), Director (String), Año (Int)

Estas clases almacenarán la información básica de cada ítem en la biblioteca. Usa data class para definir estas clases ya que son perfectas para almacenar datos sin necesidad de lógica adicional.

***Parte 2: Definir sealed class***

Para gestionar los distintos tipos de usuarios, puedes usar una sealed class. Esto te permitirá tener una jerarquía de clases cerrada, lo cual es útil para cuando se conocen todos los posibles subtipos.

Usuario

sealed class Usuario

Clases que heredan de Usuario:

Estudiante(id:String, nombre:String, carrera:String)

Profesor(id:String, nombre:String, departamento:String)

Visitante(id:String, nombre:String)

La sealed class Usuario permitirá manejar operaciones específicas para cada tipo de usuario, como préstamos de libros o acceso a áreas restringidas de la biblioteca.

