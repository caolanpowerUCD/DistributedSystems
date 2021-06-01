package ie.ucdconnect.distLib.core;

import java.io.Serializable;

public class CreateUserRequest extends AbstractUser implements Serializable {

	public CreateUserRequest(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public CreateUserRequest() {}
}
