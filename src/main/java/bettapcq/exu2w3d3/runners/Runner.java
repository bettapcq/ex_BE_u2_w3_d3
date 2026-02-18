package bettapcq.exu2w3d3.runners;

import bettapcq.exu2w3d3.es1.AdapterClass;
import bettapcq.exu2w3d3.es3.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    //es1:
    private final AdapterClass adapter;
//es3:

    private final Tenente tenente;
    private final Capitano capitano;
    private final Maggiore maggiore;
    private final Colonnello colonnello;
    private final Generale generale;


    public Runner(AdapterClass adapter, Tenente tenente, Capitano capitano, Maggiore maggiore, Colonnello colonnello, Generale generale) {
        //es1:
        this.adapter = adapter;

//es3:
        this.tenente = tenente;
        this.capitano = capitano;
        this.maggiore = maggiore;
        this.colonnello = colonnello;
        this.generale = generale;

    }

    @Override
    public void run(String... args) throws Exception {
//es 1:
        System.out.println("Nome completo: " + adapter.getNomeCompleto());
        System.out.println("Età: " + adapter.getEta());

        //es3:


        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        tenente.check(3500);
    }
}
