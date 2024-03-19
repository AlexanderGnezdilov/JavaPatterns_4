package shop;

public class Shirt extends Goods implements Clothes {
    private final String name = "рубашка";
    private final int price = 5000;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void iron() {
        System.out.println("Рубашка поглажена");
    }

    @Override
    public void tryOn() {
        System.out.println("Можете примерить рубашку");
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
