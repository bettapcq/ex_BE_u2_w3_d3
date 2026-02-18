package bettapcq.exu2w3d3.es3;

import org.springframework.stereotype.Component;

@Component
public class Maggiore extends Ufficiale {

    public Maggiore(String funzione, int posizioneGerarchica, int stipendio) {
        super("Capo amministrazione", 3, 3000);
    }

    @Override
    public boolean check(int stipendioRichiesto) {
        if (stipendioRichiesto <= stipendio) {
            System.out.println("Almeno il Maggiore percepisce" + stipendio);
            return true;
        }
        return checkNext(stipendioRichiesto);

    }

}
