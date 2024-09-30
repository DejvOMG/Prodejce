public class Seller {
    String name;
    String adrress;
    int numberOfContracts;
    double saleOfCarrots;
    String city;
    String spz;
    double fuelConsumption;

    public Seller(String name, String adrress,int numberOfContracts, double saleOfCarrots, String city, String spz, double fuelConsumption) {
        this.name = name;
        this.adrress = adrress;
        this.numberOfContracts = numberOfContracts;
        this.saleOfCarrots = saleOfCarrots;
        this.city = city;
        this.spz = spz;
        this.fuelConsumption = 6.3;
        
    }

    public void printSellerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Adrress: " + adrress);
        System.out.println("Number of Contracts: " + numberOfContracts);
        System.out.println("Sale of Carrots: " + saleOfCarrots);
        System.out.println("City: " + city);
        System.out.println("SPZ: " + spz);
        System.out.println("Fuel Consumption: " + fuelConsumption + " on 100 km/l");
    }

}


