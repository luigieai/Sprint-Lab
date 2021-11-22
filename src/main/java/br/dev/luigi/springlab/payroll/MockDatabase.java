package br.dev.luigi.springlab.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockDatabase {
    private static final Logger log = LoggerFactory.getLogger(MockDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){
        return args -> {
            log.info("Preloading" + repository.save(new Employee("Luigi", "Vagabundo")));
            log.info("Preloading" + repository.save(new Employee("Pit", "Gostoso")));
            log.info("Preloading" + repository.save(new Employee("Vini", "Viado")));
        };
    }
}
