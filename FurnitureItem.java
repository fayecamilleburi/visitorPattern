public class FurnitureItem implements Furniture {
    private String type;
    private double weight;
    private double area;
    private double volume;
    private double distance;

    public FurnitureItem(String type, double weight, double area, double volume, double distance) {
        this.type = type;
        this.weight = weight;
        this.area = area;
        this.volume = volume;
        this.distance = distance;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public double accept(ShippingCost shippingCost) {
        return shippingCost.calculateShippingCost(this);
    }
}