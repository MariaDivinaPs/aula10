public class TipoPagamento{
    private double valor;



    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double debito(){
      return valor;
    
    }
    public double credito(){
        return valor*1.05;

    }

    @Override
    public String toString() {
        return "{" +
            " valor='" + getValor() + "'" +
            "}";
    }

}
