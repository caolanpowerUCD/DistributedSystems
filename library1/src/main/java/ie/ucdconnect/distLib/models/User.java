package ie.ucdconnect.distLib.models;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    public int id;
    public String userName;

    public User(String userName){
        this.userName = userName;
    }
}