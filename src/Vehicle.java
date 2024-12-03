abstract class Vehicle implements Serviceable {
    private String modelName;
    private int wheelsCount;

    Vehicle(String modelName, int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName(){
        return modelName;
    }

    public int getWheelsCount(){
        return wheelsCount;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    protected abstract void updateTyre();

}




