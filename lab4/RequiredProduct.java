package lab4_2;

public class RequiredProduct {
    private String name;
    private int count;
    private String supplier;

    public RequiredProduct(String name, int count, String supplier) {
        this.name = name;
        this.count = count;
        this.supplier = supplier;
    }

    public RequiredProduct() {
        this("Металл", 100, "ОАО РосМеталл");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "\tНазвание: " + getName() + "\n"
                + "\tКоличество: " + getCount() + "\n"
                + "\tНаименование поставщика: " + getSupplier();

    }
}
