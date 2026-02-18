package bettapcq.exu2w3d3.config;

import bettapcq.exu2w3d3.es1.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class ConfigClass {

    @Bean

    public Info info() {
        return new Info("betta", "pcq", LocalDate.of(1990, 10, 22));
    }


}
