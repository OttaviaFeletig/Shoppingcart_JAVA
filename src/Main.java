public class Main {

    public static void main(String[] args){
        Product p1 = new Product("vacuum cleaner", 100,  0);
        Product p2 = new Product("pencil", 3, 0);
        Product p3 = new Product("bike", 300, 0);
        Product p4 = new Product("helmet", 50, 0);
        Product p5 = new Product("locker", 100, 0);
        Product newP5 = new Product("safe-locker", 150, 0);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(p1);
        cart.addProduct(p1);
        cart.addProduct(p1);
        cart.addProduct(p1);
        cart.addProduct(p1);
        cart.addProduct(p1);
        cart.addProduct(p1);
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p2);
        cart.addProduct(p2);
        cart.addProduct(p2);
        cart.addProduct(p2);
        cart.addProduct(p2);
        cart.addProduct(p2);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);
        cart.addProduct(p4);
        cart.addProduct(p4);
        cart.addProduct(p4);
        cart.addProduct(p5);
        cart.addProduct(p5);
        cart.replace(p5, newP5);
        cart.addProduct(newP5);
        cart.addProduct(newP5);
        cart.addProduct(newP5);
        cart.getTotalQuantity();
        cart.getDiscount();
        cart.getTotalPrice();


        cart.print();

    }

}
