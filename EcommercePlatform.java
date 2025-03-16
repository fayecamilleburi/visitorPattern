public class EcommercePlatform {
    public static void main(String[] args) {
        Furniture chair = new FurnitureItem("chair", 5, 0, 0, 0);
        Furniture table = new FurnitureItem("table", 0, 10, 0, 0);
        Furniture sofa = new FurnitureItem("sofa", 0, 0, 15, 100);
        Furniture cabinet = new FurnitureItem("cabinet", 50, 6, 2.5, 200);

        ShippingCost sfCalculator = new ShippingCalculator();

        System.out.println("Chair Shipping Cost: $" + chair.accept(sfCalculator));
        System.out.println("Table Shipping Cost: $" + table.accept(sfCalculator));
        System.out.println("Sofa Shipping Cost: $" + sofa.accept(sfCalculator));
        System.out.println("Cabinet Shipping Cost: $" + cabinet.accept(sfCalculator));
    }
}