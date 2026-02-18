package bettapcq.exu2w3d3.es3;


import org.springframework.stereotype.Component;

@Component
public class Generale extends Ufficiale {

    public Generale() {
        super("Capo brigata", 1, 5000);
    }

    @Override
    public boolean check(int stipendioRichiesto) {
        if (stipendioRichiesto <= stipendio) {
            System.out.println("Almeno il Generale percepisce" + stipendio);
            return true;
        }
        return checkNext(stipendioRichiesto);

    }
}
