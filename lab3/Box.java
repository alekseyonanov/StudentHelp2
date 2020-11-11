public class Box {

    private float height;
    private float width;
    private float length;

    public Box(float height, float width, float length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public float volume(){
        return height * width * length;
    }

    public void printInfo(){
        System.out.println("Высота: " + height);
        System.out.println("Ширина: " + width);
        System.out.println("Длина: " + length);
    }
}
