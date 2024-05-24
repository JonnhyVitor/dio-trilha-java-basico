import java.util.Locale;
import java.util.Scanner;

public class TerminalBanco {

    public static void main(String[] args) throws Exception {
        //dados bancarios
        int numeroDaConta=7070;
        String agenciaCliente="666-6";
        String nomedoCliente="joao";
        double saldoBancario=1500;
        //adiconado Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         System.out.println("Por Favor,digite o numero da sua conta");
         int numero =scanner.nextInt();

         System.out.println("Por Favor,digite o numero da sua agencia");
         String agencia=scanner.next();

         System.out.println("Por Favor,digite seu nome");
         String nomeCliente=scanner.next();

         //exibindo imformaçoes da conta 

         System.out.println("Olá,"+nomeCliente);
         System.out.println("Obrigado por cria sua conta em nosso banco");
         System.out.println("Conta:"+numero);
         System.out.println("Sua agencia é:" + agencia);
         System.out.println("Aqui está seu saldo já disponivel para saque:"+ saldoBancario);
    

    }
}