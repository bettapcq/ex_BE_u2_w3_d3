package bettapcq.exu2w3d3.es1;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
public class AdapterClass implements DataSource {
    private Info info;

    public AdapterClass(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Period daNascitaAOggi = Period.between(info.getDataDiNascita(), LocalDate.now());

        return daNascitaAOggi.getYears();
    }
}
