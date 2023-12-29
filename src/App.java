import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userinsert = new Scanner(System.in);
        String name;
        name = "Matheus da Silva Cirqueira";
        String account;
        account = "Conta corrente";
        double cash = 2500;
        int action = 0;

        String Start = """
            
                Dados iniciais de cliente:

                    Nome: %s
                    Tipo: %s
                    Saldo: R$ %.2f
                    """.formatted(name, account, cash, action);
        
        System.out.println(Start);

        String message = """

                Operações disponiveis:
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Encerrar

                What do you want to do?(%s)
                    """.formatted(name, account, cash, action);
        
        while(true){
            System.out.println(message);
            action = userinsert.nextInt();
            if (action == 4){
                break;
            }
            switch (action){
                case 1:
                    System.out.println("Seu saldo é: " + cash);
                    break;
                case 2:
                    System.out.println("How much you will receive: ");
                    double received = userinsert.nextDouble();
                    cash += received;
                    System.out.println("You received: R$ " + received);
                    message = String.format(message, name, account, cash);
                    break;
                case 3:
                    System.out.println("How much will transfer: ");
                    double transferring = userinsert.nextDouble();
                    if (transferring <= cash){
                        cash -= transferring;
                        System.out.println("Transferred: R$ " + transferring);
                        message = String.format(message, name, account, cash);
                    } else {
                        System.out.println("Insuficient cash.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        userinsert.close();
    }
}
