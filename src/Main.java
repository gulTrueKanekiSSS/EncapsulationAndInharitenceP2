public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();

        Vehicle car = new Car("Car1", 4);
        Vehicle truck = new Truck("Truck1", 6);
        Vehicle bicycle = new Bicycle("Bicycle1", 2);

        station.check(car);
        station.check(truck);
        station.check(bicycle);
    }
}
