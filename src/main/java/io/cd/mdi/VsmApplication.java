package io.cd.mdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = { VsmApplication.class, Jsr310JpaConverters.class })

@SpringBootApplication
public class VsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(VsmApplication.class, args);
	}
}
