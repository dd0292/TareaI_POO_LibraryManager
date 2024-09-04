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
public class Loan {
    private User user;
    private Book book;
    private String loanDate;
    private String returnDate;

    public Loan(User user, Book book, String loanDate, String returnDate) {
        this.user = user;
        this.book = book;
        //validamos formato de fecha?
        if(loanDate.length()==10&&returnDate.length()==10){// formato: dd/mm/yyyy null
            this.loanDate = loanDate;
            this.returnDate = returnDate;
        }
    }
    
    void showLoanDetails(){
        System.out.println("Detalles del prestamo: \n| Nombre de usuario: " + user.getName() +" | ID de usuario: "+ user.getId()+ 
                "\n| Titulo del libro: " + book.getTitle()+" | Codigo  del libro: "+ book.getCode()+
                "\n| Fecha del pretamo: " + loanDate + " | Dia de entrega: " + returnDate+"\n");
    }


    
    
}
