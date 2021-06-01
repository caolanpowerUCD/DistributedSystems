package ie.ucdconnect.distLib.core;

import java.io.Serializable;

public class CreateLoanRequest extends AbstractLoan implements Serializable {

	public CreateLoanRequest(String bookId, String userId){
        this.book = book;
        this.user = user;
    }

    public CreateLoanRequest() {}
}
