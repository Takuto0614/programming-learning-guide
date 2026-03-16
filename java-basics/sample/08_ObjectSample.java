class Car {
    String color;

    void run() {
        System.out.println(color + "の車が走ります");
    }
}

public class ObjectSample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "赤";

        Car car2 = new Car();
        car2.color = "青";

        car1.run();
        car2.run();
    }
}