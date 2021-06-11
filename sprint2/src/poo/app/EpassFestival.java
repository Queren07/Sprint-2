package poo.app;

public class EpassFestival {
    private double saldoCartaoPgmt;
    private String nomeEvento;

    public EpassFestival(double saldo, String evento){ }

    public EpassFestival(String evento){}
    public EpassFestival(EpassFestival outro){}

    public double getSaldoCartaoPgmt() {
        return saldoCartaoPgmt;
    }

    public void setSaldoCartaoPgmt(double saldoCartaoPgmt) {
        this.saldoCartaoPgmt = saldoCartaoPgmt;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
}
