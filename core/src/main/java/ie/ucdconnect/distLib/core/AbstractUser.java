package ie.ucdconnect.distLib.core;

public class AbstractUser {    
	protected String firstName;
    protected String lastName;
    protected String email;

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getEmail(){
        return this.email;
    }

    public void getEmail(String email){
        this.email = email;
    }
    

}