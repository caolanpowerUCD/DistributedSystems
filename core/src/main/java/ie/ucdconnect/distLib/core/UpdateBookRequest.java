package ie.ucdconnect.distLib.core;

import java.io.Serializable;

public class UpdateBookRequest extends AbstractBook implements Serializable {

	private String id;

	public UpdateBookRequest(String id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public UpdateBookRequest() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
