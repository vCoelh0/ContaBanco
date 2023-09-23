
package contabanco;

import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
        
       int numero;
       String agencia;
       String nomeCliente;
       double saldo;
       
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite seu nome: ");
        nomeCliente = sc.nextLine();
        
        System.out.println("Digite o numero da conta:  ");
        numero = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o numero da agencia:  ");
        agencia = sc.nextLine();
        
        System.out.println("Digite o saldo: ");
        saldo = sc.nextDouble();
     
        
        System.out.println("Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia " + agencia + 
                ", conta " + numero + " e seu saldo " + saldo + " ja está disponivel para saque ");
    }
    
}
