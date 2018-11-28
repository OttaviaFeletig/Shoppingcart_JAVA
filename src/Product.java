
public class Product {

    private String name;
    private Integer price;
    private Integer quantity;

    public Product(String productName, Integer productPrice, Integer productQuantity) {
        this.name = productName;
        this.price = productPrice;
        this.quantity = productQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
