import java.util.ArrayList;
import java.util.List;

public class DeviceWithTemperature extends DeviceWithRequiredProducts {
    private int tMin;
    private int tMax;

    public DeviceWithTemperature(String name, double cost, List<RequiredProduct> list, int tMin, int tMax) {
        super(name, cost, list);
        this.tMax = tMax;
        this.tMin = tMin;
    }

    public DeviceWithTemperature(String name) {
        this(name, 100.00, new ArrayList<>(), 0, 100);
    }

    public int gettMin() {
        return tMin;
    }

    public void settMin(int tMin) {
        this.tMin = tMin;
    }

    public int gettMax() {
        return tMax;
    }

    public void settMax(int tMax) {
        this.tMax = tMax;
    }

    @Override
    public String getDeviceInfo() {
        return "Название: " + getName() + "\n"
                + "Минимальная температура: " + gettMin() + " град." + "\n"
                + "Максимальная температура: " + gettMax() + " град.";
    }
}
