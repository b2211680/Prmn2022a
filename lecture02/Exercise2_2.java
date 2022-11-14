package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Car a = new Car();
        GasStation b = new GasStation();

        a.run();
        b.refuel(a);
        a.run();
    }
}
