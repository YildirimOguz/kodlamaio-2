public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus laptop",5000,10);
        System.out.println(product.getName());


        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
