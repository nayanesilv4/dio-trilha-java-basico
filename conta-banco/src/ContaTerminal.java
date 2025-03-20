import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        //TODO: Conhecer e Importar a Classe Scanner

        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obter pelo Scanner os valores digitados no terminal

        System.out.println("Por favor, digite o número da sua Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();


        //Exibir a mensagem: "Conta Criada" 

        System.out.println("Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
