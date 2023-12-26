public class App {
    public static void main(String[] args) {
        //Variables
        int year = 2022;
        String movie;
        movie = "John wick 4";
        boolean plans = false;
        double review = 8.5;
        double reviewAll =(9.8 + 7.5 + 8.3)/3;
        double classification = (reviewAll/2);

        //Main quest
        String sinopse = """
                                - Welcome for Screenmatch -

                        Movie: %s
                        Sinopse: John wick is a retired assassin return to kill everyone who killed his dog.
                        Star of the show keanu reeves.
                        Year of release: %s
                        Reviews: %.1f
                        Classification: %.0f """.formatted(movie, year, reviewAll, classification);
        
        System.out.println(sinopse);
    }
}
