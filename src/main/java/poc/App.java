package poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

	/**
	 * Spring Boot App entry point
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		SpringApplication app = new SpringApplication(App.class);
		ConfigurableApplicationContext context = app.run(args);
	}

}
