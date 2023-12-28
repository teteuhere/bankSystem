import java.util.Scanner;

public class anotherLoop {
    public static void main(String[] args) {
    Scanner userinsert = new Scanner(System.in);
    double review = 0;
    double media = 0;
    int allReview = 0;

    while (review != -1 ) {
        System.out.println("What do you think about this movie? You can exit from system with -1.");
        review = userinsert.nextDouble();

        if (review != -1){
        media = media + review;
        allReview++;
        }
    }

    System.out.println("Média de avaliações " + media/allReview);

    }
    
}
