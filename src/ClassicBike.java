public class ClassicBike extends Bike {
    private String typeOfBike = "Classic bike";
    private double height;
    private double weight;
    private String engine;
    private double price;
    private String version;
    private boolean isHandClutch;

    public ClassicBike(double Height, double Weight, String Engine, double Price, String Version, boolean IsHandClutch) {
        super(Height, Weight, Engine, Price, Version);
        height = Height;
        weight = Weight;
        engine = Engine;
        price = Price;
        version = Version;
        isHandClutch = IsHandClutch;
    }

    @Override
    public double FinalPrice() {
        double finalPrice = price;
        if (version.equalsIgnoreCase("Special Edition")) {
            finalPrice = price + 400;
        } else if (version.equalsIgnoreCase("Retro")) {
            finalPrice = price + 200;
        }
        return finalPrice;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Details information of this classic bike: "
                + "\n Type of bike: " + typeOfBike
                + "\n Height: " + height + "mm"
                + "\n Weight: " + weight + "kg"
                + "\n Number of Wheel: " + super.NumberOfWheel
                + "\n Engine: " + engine + "cc"
                + "\n Version: " + version
                + "\n Price: " + FinalPrice()
                + "\n Is hand clutch: " + isHandClutch);
    }
}
