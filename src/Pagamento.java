public class Pagamento {
    private TipoPagamento tipoPagamento;
   

    
    public TipoPagamento getTipoPagamento() {
        return this.tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    public void imprimirInformacoes(){
        System.out.println(this.tipoPagamento.toString());
    }




  
    
}
