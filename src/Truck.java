public class Truck extends Vehicle{

    Truck(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    @Override
    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
        checkTrailer();
    }
}