package poo.app;

import java.time.LocalDate;
import java.util.Date;

public abstract class PasseStandard extends Epass{
    private Titular titular;
    private int pontos;
    private int numeroViagens;
    private String chaveValida;


    public PasseStandard(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn,String nome,String email) {
        super(codigoDoc, tipoDoc, ddn,nome ,email);
    }

    public PasseStandard(DocumentoID docID, LocalDate ddn,String nome,String email) {
        super(ddn,nome ,email);
    }

    public Titular getTitular() {
        return titular;
    }

    public int getPontos() {
        return pontos;
    }

    public String getChaveValida() {
        return chaveValida;
    }

    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }
}
