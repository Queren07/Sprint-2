package poo.app;

import java.time.LocalDate;

public class EpassStudent extends PasseStandard{
    private int ano;
    private String escola;
    private Zona[] zona;

    public EpassStudent(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email, int ano, String escola) {
        super(codigoDoc, tipoDoc, ddn, nome, email);
        this.ano = ano;
        this.escola = escola;
    }

    public EpassStudent(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email,EpassStudent outro) {
        super(codigoDoc, tipoDoc, ddn, nome, email);
            this.ano=outro.ano;
            this.escola=outro.escola;

        }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getAno() {
        return ano;
    }

    public String getEscola() {
        return escola;
    }

    public Zona[] getZona() {
        return zona;
    }

    public String addZona(String nome){
        return nome;
    }

    public Zona addZona(Zona zonaViagem){
        return zonaViagem;
    }

}
