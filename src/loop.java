import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
    Scanner userinsert = new Scanner(System.in);
    double review = 0;
    double media = 0;

    for (int i = 0; i < 3; i++) {
        System.out.println("What do you think about this movie?");
        review = userinsert.nextDouble();
        media = media + review;
    }

    System.out.println("Média de avaliações " + media/3);

    }
}
