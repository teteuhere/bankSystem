import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userinsert = new Scanner(System.in);
        String name;
        name = "Matheus da Silva Cirqueira";
        String account;
        account = "Conta corrente";
        double cash = 2500;
        

        String message = """
                Dados iniciais de cliente:

                    Nome: %s
                    Tipo: %s
                    Saldo inicial: R$ %.2f
                    
                Operações disponiveis:
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Encerrar

                What do you want to do?(%s)
                    
                    """.formatted(name, account, cash, action);
        while(userinsert != 4){
            System.out.println(message);
        }
    }
}
