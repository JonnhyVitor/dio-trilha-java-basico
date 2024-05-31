public class CaixaEletronico {
    
    public static void main(String[] args) {
       double saldo=25.0;

        double saldoSolicitado=10.0;

        if (saldoSolicitado< saldo){ 
            saldo= saldo- saldoSolicitado;
            System.out.println("NovoSaldo: " +saldo);}

          

            else 
            System.out.println("saldo Insuficiente");
        
        

    }
}
