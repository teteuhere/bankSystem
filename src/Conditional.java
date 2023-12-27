public class Conditional {
    public static void main(String[] args) {
        int year = 2022;
        boolean plans = false;
        double review = 8.5;
        String plantype = "pro";
        if(plans == true || plantype.equals("pro"))
        if(year >= 2022){
            System.out.println("Launching which users likes!");
        } else {
            System.out.println("It's worth re-watch.");
        }
    }
}
