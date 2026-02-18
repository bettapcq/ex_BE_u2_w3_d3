package bettapcq.exu2w3d3.runners;

import bettapcq.exu2w3d3.es1.AdapterClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final AdapterClass adapter;

    public Runner(AdapterClass adapter) {
        this.adapter = adapter;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Nome completo: " + adapter.getNomeCompleto());
        System.out.println("Età: " + adapter.getEta());

    }
}
