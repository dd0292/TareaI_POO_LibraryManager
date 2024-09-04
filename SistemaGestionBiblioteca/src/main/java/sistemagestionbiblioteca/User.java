/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionbiblioteca;
import java.util.ArrayList;
/**
 *
 * @author Brian Ramirez
 * @author David Chavez
 */
public class User {
    private int id;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public User(int id, String name) {
        this.id = id;//El id se pide en el constructor?
        this.name = name;
        borrowedBooks=new ArrayList<Book>();
    }
    
    void addBorrowedBook(Book book){
         borrowedBooks.add(book);
    }
    
    void returnBorrowedBook(Book book){
         for (int i = 0; i < borrowedBooks.size(); i++) {
            if (book.getCode()==borrowedBooks.get(i).getCode()){//book.equals(borrowedBooks.get(i));
                borrowedBooks.remove(i);
            }
        }
        //falta marcar el libro como disponible usando los metodos de la clase book
    }
    
    void showBorrowedBooks(){
        //Solo muestra los que estan actualmente en la lista?
        if(!borrowedBooks.isEmpty()){
            System.out.println("\nSe listaran los libros prestados:");
            int cont=1;
            for (Book borrowedBook : borrowedBooks) {
                System.out.println(cont+"-"+" titulo: "+borrowedBook.getTitle()+" codigo: "+borrowedBook.getCode());
                cont++;
            }
            System.out.println("");
        }else
            System.out.println("Actualmente no tiene libros prestados.");
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
    
    
}
