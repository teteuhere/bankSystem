public class App {
    public static void main(String[] args) {
        int year = 2022;

        String sinopse;
        sinopse = """
                    Movie which John wick, a retired assassin return to kill everyone who killed his dog.
                    Star of the show keanu reeves.
                    Year of release: """ + year;
        
        boolean plans = false;
        
        double review = 8.5;
        double reviewAll =(9.8 + 7.5 + 8.3)/3;
        
        System.out.println("Welcome for Screenmatch");
        System.out.println("Movie: John Wick 4");
        System.out.println(sinopse);
        System.out.println(String.format("%.1f",reviewAll));
    }
}
