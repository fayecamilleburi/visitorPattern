public class ShippingCalculator implements ShippingCost {
    @Override
    public double calculateShippingCost(Furniture item) {
        FurnitureItem furnitureItem = (FurnitureItem) item;
        switch (furnitureItem.getType().toLowerCase()) {
            case "chair":
                return 10.0;
            case "table":
                return (furnitureItem.getArea() * 5);
            case "sofa":
                return (furnitureItem.getVolume() * 2) + (furnitureItem.getDistance() * 0.5);
            default:
                return 20.0;
        }
    }
}