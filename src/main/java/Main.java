// project 03 Average Stock Prices
/*
 1. create stock class
 2. record buying and selling of stock
 3. update share capital owned
 4. update average stock price
 */

public class Main {
    public static void main(String[] args) {
        Stock ACME_Novelty = new Stock();
        ACME_Novelty.buy(36.6, 2000);
        Stock BarStool_Depot = new Stock();
        BarStool_Depot.buy(12.87, 1250);

        ACME_Novelty.sell(52.15, 1500);
        BarStool_Depot.sell(1.58, 1250);

        System.out.println(ACME_Novelty.getShares());
        System.out.println(BarStool_Depot.getShares());

        System.out.println(ACME_Novelty.getPrice());
        System.out.println(BarStool_Depot.getPrice());

        System.out.println(ACME_Novelty.getAveragePrice());
        System.out.println(BarStool_Depot.getAveragePrice());
    }
}
