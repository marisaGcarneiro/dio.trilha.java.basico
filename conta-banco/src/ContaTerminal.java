import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         Scanner scan = new Scanner(System.in)

    //TODO:Conhecer e importar a classe Scanner

    //Exibir as mensagens para o nosso usuário

    //Obter pela scanner os valores digitados no terminal

    //Exibir a mensagem conta criada

    int numero;
    String agencia;
    String cliente;
    double saldo;

    System.out.printf("Por favor, digite o número da Agência!:\n ");
    agencia = scan.next();
    
    System.out.printf("\nDigite o número da sua conta: \n ");
    numero = scan.nextInt();
        
    System.out.printf("\nInforme o nome do Cliente:\n ");
    cliente = scan.next();

    System.out.printf("\nDigite o Saldo:\n ");
    saldo = scan.nextDouble();

    System.out.printf("\nResultado:\n ");
    System.out.printf("Ola " + [cliente] ", obridado por criar uma conta \n
    em nosso banco, sua agência é " + [agencia]  ", conta " + [numro] "e seu \n
    saldo " + [saldo] "já está disponivel para saque. " );
            
        
    }
}
