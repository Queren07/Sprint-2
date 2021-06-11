package poo.app;

public interface TituloTransporte {
    public void carregar (double a);
    public void pagarViagem(double b);
    public boolean checkValidade();
    public boolean passarSaldo (PasseStandard c,double d);
}
