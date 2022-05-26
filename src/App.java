public class App {
    public static void main(String[] args) throws Exception {
        TipoPagamento tp = new TipoPagamento();
        Pagamento pg = new Pagamento();
         tp.setValor( 178);
         System.out.println(tp.credito());

    }
}
