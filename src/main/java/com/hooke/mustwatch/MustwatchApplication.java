package com.hooke.mustwatch;

import com.hooke.mustwatch.model.Show;
import com.hooke.mustwatch.repository.ShowRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MustwatchApplication {

	private static final Logger log = LoggerFactory.getLogger(MustwatchApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MustwatchApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ShowRepository repository) {
		return (args) -> {
			log.info("Attempting to Create entries.");
			log.info("-----------------------------");
			log.info((repository.save(new Show("BSG", "SciFi"))).toString());
			log.info((repository.save(new Show("Bojack Horseman", "Comedy"))).toString());
			log.info((repository.save(new Show("Twin Peaks", "Weird"))).toString());
			log.info("-----------------------------");
			log.info("Successfully Created entries.");
			log.info("");
		};
	}

}
