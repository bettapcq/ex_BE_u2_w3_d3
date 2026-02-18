package bettapcq.exu2w3d3.config;

import bettapcq.exu2w3d3.es1.Info;
import bettapcq.exu2w3d3.es3.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class ConfigClass {

    @Bean

    public Info info() {
        return new Info("betta", "pcq", LocalDate.of(1990, 10, 22));
    }

    @Bean
    public Capitano capitano() {
        return new Capitano();
    }

    @Bean
    public Colonnello colonnello() {
        return new Colonnello();
    }

    @Bean
    public Generale generale() {
        return new Generale();
    }

    @Bean
    public Maggiore maggiore() {
        return new Maggiore();
    }

    @Bean
    public Tenente tenente() {
        return new Tenente();
    }

}
