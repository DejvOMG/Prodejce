public class Main {

    public static void main(String[] args) {

        Seller seller1 = new Seller("Pavel Novotný", "Porubského 314, Praha", 20, 5, "Praha","8AV 5123", 6.3);
        Seller seller2 = new Seller("Petr Oldbram", "Dvanácterákova 8, Opava", 25, 6, "Opava", "5TP 7893", 7.5 );

        System.out.println("Names of the sellers with address and more information about sales:");
        seller1.printSellerInfo();
        seller2.printSellerInfo();
    }
}
