public class problem3 {
    public static void main(String[]args) {
        
        boolean hot;
        boolean cold;
        int temperature = 25;

        hot = temperature > 25;
        cold = temperature < 20;

        System.out.print("Sporky needs ");

        if (hot) {
            System.out.print("a fan.");
        }
        else if (cold) {
            System.out.print("a scarf.");
        }
        else {
            System.out.print("nothing.");
        }

}
}
