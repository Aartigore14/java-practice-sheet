package OOP;

interface Vehicle {
    void start();
    void stop();
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stoping");
    }
}
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stoping");
    }

}
public class Main {
    static void main() {
        Car c = new Car();
        Bike b = new Bike();
        c.start();
        c.stop();
        b.start();
        b.stop();
            }
        }