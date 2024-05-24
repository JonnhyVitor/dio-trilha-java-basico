import java.util.Locale;
import java.util.Scanner;

public class TerminalBanco {

    public static void main(String[] args) throws Exception {
        //dados bancarios
        int numeroDaConta=7070;
        String agencias="666-6";
        String nomedoCliente="joao";
        double saldoBancario=1500;
        //adiconado Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         System.out.println("digite o numero da sua conta");
         int numero =scanner.nextInt();

         System.out.println("digite sua agencia");
         String agencia=scanner.next();

         System.out.println("digite seu nome");
         String nomeCliente=scanner.next();

         //exibindo imformaçoes da conta 

         System.out.println("ola,"+nomeCliente);
         System.out.println("Obrigado por cria sua conta com a gente");
         System.out.println("Aqui esta o numero da sua conta:"+numero);
         System.out.println("sua agencia:" + agencia);
         System.out.println("aqui esta seu saldo disponivel para saque:"+ saldoBancario);
    

    }
}