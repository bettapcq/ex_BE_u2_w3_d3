package bettapcq.exu2w3d3.es3;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Tenente extends Ufficiale {


    public Tenente(String funzione, int posizioneGerarchica, int stipendio) {
        super("Capo plotone", 5, 1000);
    }

    @Override
    public boolean check(int stipendioRichiesto) {
        if (stipendioRichiesto <= stipendio) {
            System.out.println("Almeno il Tenente percepisce" + stipendio);
            return true;
        }
        return checkNext(stipendioRichiesto);

    }


}
