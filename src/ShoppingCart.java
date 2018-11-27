import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;
    private int totalPrice;

    public ShoppingCart(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    
    public int getTotalPrice(){
        products.forEach(product -> this.totalPrice += product.getPrice());
        if(products.size() < 5){
            return this.totalPrice;
        } else {
            return this.totalPrice -= (this.totalPrice * 10) / 100;
        }

    }

    public void print(){
        System.out.print("My cart has: ");
        products.forEach(product -> {
            System.out.print(product.getName());
            System.out.print(" for " + product.getPrice() + " euro and ");
        });
        System.out.print("the total price is: " + totalPrice + " euro.");
    }

}

