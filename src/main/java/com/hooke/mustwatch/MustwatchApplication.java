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
			repository.save(new Show("BSG", "SciFi"));
			repository.save(new Show("Bojack Horseman", "Comedy"));
			repository.save(new Show("Twin Peaks", "Weird"));
			log.info("Successfully Created entries.");
			log.info("");

			log.info("Attempting to Read entries.");
			log.info("---------------------------");
			for (Show s : repository.findAll()) {
				log.info(s.toString());
			}
			log.info("");
			log.info("---------------------------");
			log.info("Successfully Read entries.");
			log.info("");

			log.info("Attempting to Update entries.");
			log.info("-----------------------------");
			for (Show s : repository.findAll()) {
				s.setGenre("Drama");
				log.info(s.toString());
			}
			log.info("");
			log.info("-----------------------------");
			log.info("Successfully Updated entries.");
			log.info("");

			log.info("Attempting to Delete Entries.");
			log.info("-----------------------------");
			for (Show s : repository.findAll()) {
				repository.delete(s);
			}
			log.info(Long.toString(repository.count()));
			log.info("");
			log.info("-----------------------------");
			log.info("Successfully Deleted entries.");
			log.info("");

			log.info("----------------------------------------");
			log.info("Successfully completed all CRUD actions.");
			log.info("----------------------------------------");
		};
	}

}
