public class products {
    public static void main(String[] args) {
        maqazin product1 = new maqazin();
        product1.id = 1;
        product1.name = "Phone";
        product1.color = "Black";
        product1.model = "Samsung S25 Ultra";
        product1.price = 499.99;
        product1.product_info();


        maqazin product2 = new maqazin();
        product2.id = 2;
        product2.name = "Headset";
        product2.color = "Blue";
        product2.model = "UBL";
        product2.price = 59.99;
        product2.product_info();

        maqazin product3 = new maqazin();
        product3.id = 3;
        product3.name = "Mouse";
        product3.color = "White";
        product3.model = "Logitech";
        product3.price = 29.99;
        product3.product_info();
    }
}
