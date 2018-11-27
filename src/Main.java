public class Main {

    public static void main(String[] args){
        Product p1 = new Product("vacuum cleaner", 100);
        Product p2 = new Product("pencil", 3);
        Product p3 = new Product("bike", 300);
        Product p4 = new Product("helmet", 50);
        Product p5 = new Product("locker", 100);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);
        cart.addProduct(p5);
        cart.getTotalPrice();
        cart.print();
    }

}
