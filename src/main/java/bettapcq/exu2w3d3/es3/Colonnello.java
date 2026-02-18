package bettapcq.exu2w3d3.es3;

import org.springframework.stereotype.Component;

@Component
public class Colonnello extends Ufficiale {
    public Colonnello() {
        super("Capo reggimento", 2, 4000);
    }

    @Override
    public boolean check(int stipendioRichiesto) {
        if (stipendioRichiesto <= stipendio) {
            System.out.println("Almeno il Colonnello percepisce" + stipendio);
            return true;
        }
        return checkNext(stipendioRichiesto);

    }
}
