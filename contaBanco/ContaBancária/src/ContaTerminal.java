
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        double saldo= 237.48;

        System.out.println("Digite o seu nome");

            String nomeCliente = scanner.next();

        System.out.println("Digite o número da conta");

            int numeroConta =scanner.nextInt();

        System.out.println("Digite o número da agência");

            String numeroAgencia= scanner.next();
   
        System.out.printf(" Olá " + (nomeCliente) + " ,obrigado por criar uma conta em nosso banco, sua agência é " + (numeroAgencia) + ", conta " + (numeroConta) + " e seu saldo "+(saldo)+" já está disponível para saque " );
    }
  }
}
