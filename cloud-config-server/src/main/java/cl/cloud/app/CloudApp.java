package cl.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudApp {

	public static void main(String[] args) {
		SpringApplication.run(CloudApp.class, args);
	}

}
