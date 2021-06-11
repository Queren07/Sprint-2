package poo.app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EpassTerIdade extends PasseStandard{
    private LocalDateTime horarIni;

    public EpassTerIdade(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email, LocalDateTime horarIni) {
        super(codigoDoc, tipoDoc, ddn, nome, email);
        this.horarIni = horarIni;
    }

    public LocalDateTime getHorarIni() {
        return horarIni;
    }

    public void setHorarIni(LocalDateTime horarIni) {
        this.horarIni = horarIni;
    }
}
