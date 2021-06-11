package poo.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Epass {
    private long codigo;
    private double saldo;
    private double precoViagem;
    private LocalDateTime emissao;
    private LocalDate dataCarrega;
    private LocalDate dataValida;
    private static long lastcodigo;

   static {
       if (Long.valueOf(lastcodigo) == null){
           lastcodigo=0;
       }
   }


    public Epass(Epass outro){
        this.codigo = lastcodigo +1;
        this.dataCarrega=outro.dataCarrega;
        this.saldo=outro.saldo;
        this.precoViagem=outro.precoViagem;
        this.dataValida=outro.dataValida;
        this.emissao= LocalDateTime.now();
        lastcodigo++;
    }

    public Epass(double saldo, double precoViagem){
        this.codigo = lastcodigo +1;
        this.saldo=saldo;
        this.precoViagem=precoViagem;
        this.emissao= LocalDateTime.now();
        lastcodigo++;
    }
    public Epass(double precoViagem){
        this.codigo = lastcodigo +1;
        this.emissao= LocalDateTime.now();
        lastcodigo++;
        this.precoViagem=precoViagem;
    }

    public Epass(double saldo,double precoViagem,LocalDate dataCarrega, LocalDate dataValida){
        this.codigo = lastcodigo +1;
        this.emissao= LocalDateTime.now();
        this.saldo=saldo;
        this.precoViagem=precoViagem;
        this.dataCarrega=dataCarrega;
        this.dataValida=dataValida;
        lastcodigo++;
    }

    public Epass(double saldo,LocalDate dataCarrega) {
        this.codigo = lastcodigo + 1;
        this.emissao = LocalDateTime.now();
        this.saldo = saldo;
        this.dataCarrega = dataCarrega;
        lastcodigo++;
    }


    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public LocalDate getDataCarrega() {
        return dataCarrega;
    }

    public void setDataCarrega(LocalDate dataCarrega) {
        this.dataCarrega = dataCarrega;
    }

    public LocalDate getDataValida() {
        return dataValida;
    }

    public void setDataValida(LocalDate dataValida) {
        this.dataValida = dataValida;
    }

    @Override
    public String toString() {
        return "Epass{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Epass epass = (Epass) o;
        return codigo == epass.codigo && Double.compare(epass.saldo, saldo) == 0 && Double.compare(epass.precoViagem, precoViagem) == 0 && Objects.equals(dataCarrega, epass.dataCarrega) && Objects.equals(dataValida, epass.dataValida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, saldo, precoViagem, dataCarrega, dataValida);
    }

}
