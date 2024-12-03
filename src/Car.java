public class Car extends Vehicle{


    Car(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    @Override
    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}