public class CafeRacerBike extends Bike {
    private String typeOfBike = "CafeRacer bike";
    private double height;
    private double weight;
    private String engine;
    private double price;
    private String version;
    private String seatOption;

    public CafeRacerBike(double Height, double Weight, String Engine, double Price, String Version, String SeatOption) {
        super(Height, Weight, Engine, Price, Version);
        height = Height;
        weight = Weight;
        engine = Engine;
        price = Price;
        version = Version;
        seatOption = SeatOption;
    }

    @Override
    public double FinalPrice() {
        double finalPrice = price;
        if (version.equalsIgnoreCase("Special Edition")) {
            finalPrice = price + 500;
        } else if (version.equalsIgnoreCase("Modern")) {
            finalPrice = price + 300;
        }
        return finalPrice;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Details information of this CafeRacer bike: "
                + "\n Type of bike: " + typeOfBike
                + "\n Height: " + height + "mm"
                + "\n Weight: " + weight+ "kg"
                + "\n Number of Wheel: " + super.NumberOfWheel
                + "\n Engine: " + engine + "cc"
                + "\n Version: " + version
                + "\n Price: " + FinalPrice()
                + "\n Seat option: " + seatOption);
    }
}
