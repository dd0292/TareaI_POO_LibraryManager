# Administrador de Biblioteca en Java

Bienvenido al proyecto **Administrador de Biblioteca en Java**. Este sistema está diseñado para gestionar de manera eficiente las operaciones y el mantenimiento de una biblioteca utilizando los principios de la Programación Orientada a Objetos (POO).


## Herramientas

- JDK 11 o superior
- Herramientas de construcción como Maven 
- Un editor o IDE compatible con Java como NetBeans

# Sistema de Gestión de Biblioteca en Java

Este proyecto es un **Sistema de Gestión de Biblioteca** implementado en Java utilizando Programación Orientada a Objetos (POO). El sistema permite gestionar libros, usuarios y préstamos en una biblioteca, con funcionalidades para agregar, eliminar y prestar libros, así como para registrar y gestionar usuarios.

## Descripción del Problema

El objetivo es desarrollar un sistema que permita manejar tanto los libros disponibles como los usuarios registrados en una biblioteca. El sistema debe utilizar arreglos estáticos para los libros y `ArrayList` para gestionar usuarios y préstamos. Además, el sistema debe contar con un menú en consola para interactuar con el usuario.

## Requerimientos

### 1. Clase `Book`

- **Atributos:**
  - `code` (int)
  - `title` (String)
  - `author` (String)
  - `available` (boolean)
- **Métodos:**
  - `showDetails()`: Muestra en consola los detalles del libro.
  - `borrow()`: Marca el libro como no disponible.
  - `returnBook()`: Marca el libro como disponible.

### 2. Clase `User`

- **Atributos:**
  - `id` (int)
  - `name` (String)
  - `borrowedBooks` (ArrayList<Book>)
- **Métodos:**
  - `addBorrowedBook(Book book)`: Añade un libro a la lista de libros prestados por el usuario.
  - `returnBorrowedBook(Book book)`: Elimina un libro de la lista de libros prestados y lo marca como disponible en la biblioteca.
  - `showBorrowedBooks()`: Muestra en consola los libros que el usuario ha prestado.

### 3. Clase `Loan`

- **Atributos:**
  - `user` (User)
  - `book` (Book)
  - `loanDate` (String)
  - `returnDate` (String)
- **Métodos:**
  - `showLoanDetails()`: Muestra en consola los detalles del préstamo.

### 4. Clase `Library`

- **Atributos:**
  - `books` (arreglo estático de `Book`, tamaño 200)
  - `users` (ArrayList<User>)
  - `loans` (ArrayList<Loan>)
  - `bookCount` (int, para llevar la cuenta de cuántos libros hay en la biblioteca)
- **Métodos:**
  - `addBook(Book book)`: Añade un libro al inventario de la biblioteca.
  - `removeBook(int code)`: Elimina un libro del inventario por su código.
  - `findBookByCode(int code)`: Devuelve el libro con el código especificado.
  - `registerUser(User user)`: Registra un nuevo usuario en la biblioteca.
  - `showAvailableBooks()`: Muestra todos los libros disponibles en la biblioteca.
  - `showUsers()`: Muestra todos los usuarios registrados en la biblioteca.
  - `createLoan(User user, Book book, String loanDate)`: Crea un nuevo préstamo de un libro a un usuario, añade el préstamo al `ArrayList` de préstamos y marca el libro como no disponible.
  - `returnLoan(Loan loan)`: Procesa la devolución de un préstamo, actualiza la disponibilidad del libro y elimina el préstamo del `ArrayList`.
  - `showLoans()`: Muestra todos los préstamos actuales.

### 5. Clase `Menu`

- **Métodos:**
  - `showMenu()`: Muestra un menú en consola con opciones para:
    - Registrar un nuevo libro.
    - Eliminar un libro.
    - Registrar un nuevo usuario.
    - Prestar un libro a un usuario.
    - Devolver un libro.
    - Mostrar todos los libros disponibles.
    - Mostrar todos los usuarios.
    - Mostrar todos los préstamos.
    - Salir del sistema.

### 6. Clase `Main`

- **Métodos:**
  - `main(String[] args)`: Crea una instancia de la clase `Library` y utiliza la clase `Menu` para permitir al usuario interactuar con el sistema.




