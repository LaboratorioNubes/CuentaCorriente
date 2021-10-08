package isi.dan.laboratorios.danmscuentacorriente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DanMsCuentacorrienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanMsCuentacorrienteApplication.class, args);
	}

}
