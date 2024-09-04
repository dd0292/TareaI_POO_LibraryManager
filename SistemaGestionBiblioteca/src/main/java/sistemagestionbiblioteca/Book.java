/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionbiblioteca;

/**
 *
 * @author Brian Ramirez
 * @author David Chavez
 */
public class Book {
    // Atributos: 
    private int code;
    private String titel;
    private String author;
    private boolean available;
    
    //Constructor : 
    public Book(int code, String titel, String author, boolean available) {
        this.code = code;
        this.titel = titel;
        this.author = author;
        this.available = available;
    }

    // Métodos:
    public void  showDetails(){
        System.out.println("Book["+code+"] : '"+titel+"' by "+author+" (AVAILABLE : "+available+") "); 
    }
    
    public void borrow(){
        if (available) {
            System.out.println("[DONE] : Book["+code+"] ha sido prestado");
            available = false;
        } else {
            System.out.println("[ERROR] ERROR : Book["+code+"] NO puede ser prestado");
        }
    }
    
    public void returnBook(){
        if (!available) {
            System.out.println("[DONE] : Book["+code+"] ha sido devuelto");
            available = true;
        } else {
            System.out.println("[ERROR] ERROR : Book["+code+"] NO puede ser devuelto");
        }
    }

    public int getCode(){
        return code;
    }
    
    public boolean getAvailable(){
        return available;
    }
    
    public String getTitel(){
        return titel;
    }
}
