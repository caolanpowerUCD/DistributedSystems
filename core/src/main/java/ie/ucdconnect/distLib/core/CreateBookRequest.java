package ie.ucdconnect.distLib.core;

import java.io.Serializable;

public class CreateBookRequest extends AbstractBook implements Serializable {

	public CreateBookRequest(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public CreateBookRequest() {
	}
}
