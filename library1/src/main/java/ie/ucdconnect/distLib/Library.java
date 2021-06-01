package ie.ucdconnect.distLib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Library {

	public static void main(String[] args) {
		SpringApplication.run(Library.class, args);
	}
}
