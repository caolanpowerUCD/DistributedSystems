import ie.ucdconnect.distLib.core.CreateBookRequest;
import ie.ucdconnect.distLib.core.UpdateBookRequest;
import ie.ucdconnect.distLib.core.UserRequest;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

	private static final byte[] copyArray = new byte[1024 * 8];
	private static final HttpClient httpClient = HttpClient.newHttpClient();

	public static void main(String[] args) throws Exception {
		String host = "http://localhost:8080";
		get(host, "/books");
		get(host, "/books?searchTerm=Author%202");
		String createdBookId = post(host, "/books", new CreateBookRequest("New Book 1", "Alex Ng"));
		get(host, "/books");
		get(host, "/books?searchTerm=new");
		delete(host, "/books?id=" + createdBookId);
		get(host, "/books?searchTerm=new");
		//put(host, "/books", new UpdateBookRequest(1, "Hello world!", null));
		get(host, "/books");

		// Testing registry /user methods
		host = "http://localhost:8082";
		get(host, "/users/1");
		post(host, "/users", new UserRequest(0, "John", "Smith", "js@gmail.com"));
	}

	public static void get(String host, String path) throws Exception {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(host + path))
				.GET()
				.build();
		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.print("GET " + path + " [" + HttpStatus.valueOf(response.statusCode()) + "]: ");
		System.out.println(response.body());
	}

	private static void put(String host, String path, Object param) throws Exception {
		String jsonData = objectToJson(param);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(host + path))
				.PUT(createBodyPublisher(jsonData))
				.header("Content-Type", "application/json")
				.build();
		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.print("PUT " + path + " " + jsonData + " [" + HttpStatus.valueOf(response.statusCode()) + "]: ");
		System.out.println(response.body());
	}

	private static String post(String host, String path, Object param) throws Exception {
		String jsonData = objectToJson(param);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(host + path))
				.POST(createBodyPublisher(jsonData))
				.header("Content-Type", "application/json")
				.build();
		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.print("POST " + path + " " + jsonData + " [" + HttpStatus.valueOf(response.statusCode()) + "]: ");
		System.out.println(response.body());
		return response.body();
	}

	private static void delete(String host, String path) throws Exception {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(host + path))
				.DELETE()
				.build();
		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.print("DELETE " + path + " [" + HttpStatus.valueOf(response.statusCode()) + "]: ");
		System.out.println(response.body());
	}

	private static String objectToJson(Object param) {
		return new JSONObject(param).toString();
	}

	private static HttpRequest.BodyPublisher createBodyPublisher(String json) {
		return HttpRequest.BodyPublishers.ofString(json);
	}
}
