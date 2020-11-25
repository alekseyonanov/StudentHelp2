abstract class Device implements DeviceInfo, UpdateBasicDeviceInfo {
    private String name;
    private double cost;

    public Device(String name) {
        this(name, 100.00);
    }

    public Device(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public void setInfo(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    @Override
    public String getDeviceInfo() {
        return "Название: " + getName() + "\n"
                + "Стоимость: " + getCost() + " руб.";
    }
}
