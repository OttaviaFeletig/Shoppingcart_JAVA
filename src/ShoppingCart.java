import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;
    private Integer totalQuantity;
    private Float totalPrice;
    private Double priceWithDiscount;
    private Double freeItem;

    public ShoppingCart(){
        products = new ArrayList<>();
        totalQuantity = 0;
        freeItem = 0D;
        totalPrice = 0F;
//        priceWithDiscount = 0D;
    }

    public void addProduct(Product product) {

        if(products.contains(product)){
            product.setQuantity(product.getQuantity() + 1);
        } else {
            products.add(product);
            product.setQuantity(1);
        }
    }

    public void getTotalQuantity(){
        products
            .forEach(product -> this.totalQuantity += product.getQuantity());
    }

    public void getDiscount(){
        products
            .forEach(product -> {
                if(product.getQuantity() >= 4){
                    this.freeItem += Math.floor(product.getQuantity() / 4) * product.getPrice();
                } else {
                    this.freeItem += 0;
                }
            });
    }

    public Double getTotalPrice(){
        products.forEach(product -> {
            this.totalPrice += product.getPrice()*product.getQuantity();
            this.priceWithDiscount = this.totalPrice - this.freeItem;
        });
        if(this.totalQuantity < 5){
            return this.priceWithDiscount;
        } else {
            return this.priceWithDiscount -= (this.priceWithDiscount * 10) / 100;
        }
    }

    public List<Product> replace(Product productToReplace, Product replaceProduct){
//        products.set(products.indexOf(productToReplace), replaceProduct);
//        if(products.contains(replaceProduct)){
//            replaceProduct.setQuantity(replaceProduct.getQuantity() + 1);
//        } else {
//            products.add(replaceProduct);
//            replaceProduct.setQuantity(1);
//        }
//        products.forEach(product -> {
//            System.out.print(" " + product.getQuantity() + " " + product.getName() + " " + product.getPrice());
//        });

        this.products
                .forEach(product -> {
                    if(productToReplace.getName().equals(product.getName())){
                        product = replaceProduct;
                    }

                });
        return products;

    }

    public void print(){
        System.out.print("My cart has: ");
        products.forEach(product -> {
            System.out.print(product.getQuantity() + " " + product.getName());
            System.out.print(" for " + product.getPrice() + " euro and ");
        });
        System.out.println("the total price is: " + priceWithDiscount + " euro.");
        System.out.println("The discount for free items is: " + freeItem);
        System.out.println("The total quantity is: " + totalQuantity);
    }
}

