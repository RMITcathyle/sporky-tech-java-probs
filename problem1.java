
// second option
public class problem1 {
    public static void main(String[] args) {
        int carSpeed = 30;
        int camelSpeed = 60;
        int scooterSpeed = 20;
        int walkingSpeed = 5;

        int carTime;   
        int camelTime;
        int scooterTime;
        int walkingTime;

        int distance = 60;

        // TIME = DISTANCE/SPEED;
        carTime = distance/carSpeed;
        camelTime = distance/camelSpeed;
        scooterTime = distance/scooterSpeed;
        walkingTime = distance/walkingSpeed;


        System.out.println("Sporky travelled for: " + distance + "km");
        
        System.out.print("Car: " + carTime );
        System.out.println(" hours");

        System.out.print("Camel: " + camelTime);
        System.out.println(" hours");

        System.out.print("Scooter: " + scooterTime);
        System.out.println(" hours");

        System.out.print("Walking: " + walkingTime);
        System.out.println(" hours");

    }
}