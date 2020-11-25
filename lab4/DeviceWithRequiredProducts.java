import java.util.ArrayList;
import java.util.List;

public class DeviceWithRequiredProducts extends Device {

    private List<RequiredProduct> requiredProductList;

    public DeviceWithRequiredProducts(String name) {
        this(name, 100.00);
    }

    public DeviceWithRequiredProducts(String name, double cost) {
        this(name, cost, new ArrayList<RequiredProduct>());
    }

    public DeviceWithRequiredProducts(String name, double cost, List<RequiredProduct> requiredProductList) {
        super(name, cost);
        this.requiredProductList = requiredProductList;
    }

    public List<RequiredProduct> getRequiredProductList() {
        return requiredProductList;
    }

    public void setRequiredProductList(List<RequiredProduct> requiredProductList) {
        this.requiredProductList = requiredProductList;
    }

    @Override
    public String getDeviceInfo() {
        String deviceInfo = super.getDeviceInfo() + "\n"
                + "Количество товаров: " + requiredProductList.size();

        for (int i = 0; i < requiredProductList.size(); i++) {
            deviceInfo += "\n" + "Товар №" + (i + 1) + ":\n" + getRequiredProductList().get(i).toString();
        }

        return deviceInfo;
    }

}
