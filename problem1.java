
// variables and datatypes - math problem

public class problem1 {
    public static void main(String[] args) {
        int carSpeed = 60;
        int camelSpeed = 80;
        int scooterSpeed = 40;
        int walkingSpeed = 20;

        int carTime;
        int camelTime;
        int scooterTime;
        int walkingTime;

        int distance = 20;

        // TIME = SPEED/DISTANCE;
        carTime = carSpeed/distance;
        camelTime = camelSpeed/distance;
        scooterTime = scooterSpeed/distance;
        walkingTime = walkingSpeed/distance;


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