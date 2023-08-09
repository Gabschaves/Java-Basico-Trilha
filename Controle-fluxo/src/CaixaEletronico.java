import java.util.Scanner;
import java.util.Locale;


public class CaixaEletronico {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in).useLocale(Locale.US)){
        double saldo = 250.0 ;

    System.out.println("Bem vindo, insira o valor de saque:");
        double valorSolitado = scanner.nextDouble();
        

    if(valorSolitado<saldo){
        saldo= saldo-valorSolitado;
        System.out.println("Saque efetuado, Valor de saldo atualizado: "+saldo);

    }else 
        System.out.println("Transação inválida,saldo insuficiente. "+ "Valor de saldo disponivel: "+ (saldo));
        
        }
    }
}