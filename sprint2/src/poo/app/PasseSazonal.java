package poo.app;

import java.time.LocalDate;

public abstract class PasseSazonal extends PasseStandard{
    private String chaveValida;

    public PasseSazonal(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email, String chaveValida) {
        super(codigoDoc, tipoDoc, ddn, nome, email);
        this.chaveValida = chaveValida;
    }

    public PasseSazonal(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email) {
        super(codigoDoc, tipoDoc, ddn, nome, email);
    }


    public String getChaveValida() {
        return chaveValida;
    }

    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }

}
