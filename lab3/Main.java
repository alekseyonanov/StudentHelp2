public class Main {
    public static void main(String[] args) {
        int size = 3;

        Box[] boxes = new Box[size];

        Box box1 = new Box(2f, 3f, 5f);
        Box box2 = new Box(6f, 7f, 2f);
        Box box3 = new Box(3f, 5f, 4f);

        boxes[0] = box1;
        boxes[1] = box2;
        boxes[2] = box3;

        float totalVolume = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Коробка №" + (i + 1) + ":");
            boxes[i].printInfo();
            System.out.println();
            totalVolume += boxes[i].volume();
        }

        System.out.println("Суммарный объем: " + totalVolume);
    }
}
