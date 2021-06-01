package ie.ucdconnect.distLib.models;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
import ie.ucdconnect.distLib.models.*;
import org.springframework.data.annotation.Id;

public class Loan {
    @Id
    public int id;
    public User user;
    public Book book;
    public LocalDateTime loanStart;
    public LocalDateTime loanEnd;

    public Loan(User user, Book book){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        
        this.user = user;
        this.book = book;
        this.loanStart = now;
        this.loanEnd = now; //TODO: +2 weeks
    }
}