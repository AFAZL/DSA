import java.util.*;

class Vehicle {
    int speed;
    int no_of_seat;
    String model;
}

class Bike extends Vehicle {
    int price;

    Bike(int speed, int no_of_seat, String model, int price) {
        this.speed = speed;
        this.model = model;
        this.no_of_seat = no_of_seat;
        this.price = price;
    }

}

public class inheritance {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Hello!!!");
        Bike obj = new Bike(200, 5, "BMW", 1000000);

        System.out.print("Speed--> " + obj.speed);

    }

}
