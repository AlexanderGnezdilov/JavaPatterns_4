package shop;

public class Coat extends Goods implements Clothes, Outerwear {
    private final String name = "плащ";
    private final int price = 6000;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void tryOn() {
        System.out.println("Примерка элемента одежды с наименованием" + name);
    }

    @Override
    public void makeWarm() {
        System.out.println(name + " согревает");
    }

    @Override
    public String toString() {
        return "Coat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}