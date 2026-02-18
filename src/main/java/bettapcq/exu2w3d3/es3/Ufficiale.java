package bettapcq.exu2w3d3.es3;

import lombok.Setter;

public abstract class Ufficiale {
    protected int stipendio;
    @Setter
    private Ufficiale superiore;
    private String funzione;
    private int posizioneGerarchica;

    public Ufficiale(String funzione, int posizioneGerarchica, int stipendio) {
        this.superiore = superiore;
        this.funzione = funzione;
        this.posizioneGerarchica = posizioneGerarchica;
        this.stipendio = stipendio;
    }

    public static Ufficiale link(Ufficiale primo, Ufficiale... chain) {
        Ufficiale head = primo;
        for (Ufficiale prossimoNellaCatena : chain) {
            head.superiore = prossimoNellaCatena;
            head = prossimoNellaCatena;
        }
        return primo;
    }

    ;

    public abstract boolean check(int stipendioRichiesto);

    protected boolean checkNext(int stipendioRichiesto) {
        if (superiore == null) {
            return true;
        }
        return superiore.check(stipendioRichiesto);
    }


}
