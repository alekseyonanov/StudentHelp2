package lab4_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<RequiredProduct> requiredProducts = new ArrayList<>();
        requiredProducts.add(new RequiredProduct());
        requiredProducts.add(new RequiredProduct("Провод", 1, "ООО Россети"));

        DeviceWithRequiredProducts automobile = new DeviceWithRequiredProducts("Автомобиль", 1000.00, requiredProducts);
        DeviceWithRequiredProducts iron = new DeviceWithRequiredProducts("Утюг");

        DeviceWithTemperature television = new DeviceWithTemperature("Телевизор", 12, new ArrayList<>(), 0, 100);
        DeviceWithTemperature module = new DeviceWithTemperature("Модуль");

        Device device = automobile;
        System.out.println(device.getDeviceInfo());
        System.out.println();

        device = television;
        System.out.println(device.getDeviceInfo());
        System.out.println();

        DeviceWithRequiredProducts temperatureDevice = television;
        System.out.println(temperatureDevice.getDeviceInfo());
        System.out.println();

        DeviceInfo deviceInfo = iron;
        System.out.println(deviceInfo.getDeviceInfo());
        System.out.println();

        module.setInfo("Модуль 11", 36.00);
        System.out.println(module.getDeviceInfo());
    }
}

