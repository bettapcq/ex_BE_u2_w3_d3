package bettapcq.exu2w3d3.es3;

import org.springframework.stereotype.Component;


@Component
public class Capitano extends Ufficiale {

    public Capitano() {
        super("Capo unità", 4, 2000);
    }


    @Override
    public boolean check(int stipendioRichiesto) {
        if (stipendioRichiesto <= stipendio) {
            System.out.println("Almeno il Capitano percepisce" + stipendio);
            return true;
        }
        return checkNext(stipendioRichiesto);

    }
}
