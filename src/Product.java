
public class Product {

    private String name;
    private int price;

    public Product(String productName, int productPrice) {
        this.name = productName;
        this.price = productPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
