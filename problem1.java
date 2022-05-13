<<<<<<< HEAD
// variables and datatypes - math problem
=======

public class problem1 {
    public static void main(String[] args) {
        double carSpeed = 30.0;
        double camelSpeed = 65.0;
        double scooterSpeed = 20.0;
        double walkingSpeed = 5.0;

        double carTime;
        double camelTime;
        double scooterTime;
        double walkingTime;

        double distance = 8.9 + 13.05; // distance b + e
>>>>>>> 6c3c05d3192627775e2dda800d104c3dd422e1d1

        //distance = speed*time;
        carTime = carSpeed/distance;
        camelTime = camelSpeed/distance;
        scooterTime = scooterSpeed/distance;
        walkingTime = walkingSpeed/distance;

        System.out.printf("Car: %.2f\n", carTime);
        System.out.printf("Camel: %.2f\n", camelTime);
        System.out.printf("Scooter: %.2f\n", scooterTime);
        System.out.printf("Walking: %.2f\n", walkingTime);

    }
}