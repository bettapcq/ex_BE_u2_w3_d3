package bettapcq.exu2w3d3.es1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;


    public Info(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
