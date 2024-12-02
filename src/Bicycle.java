public class Bicycle extends Vehicle{

    public Bicycle(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    @Override
    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}