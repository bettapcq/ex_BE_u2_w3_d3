package bettapcq.exu2w3d3.es1;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public UserData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
