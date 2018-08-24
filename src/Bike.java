import static java.lang.String.format;

public abstract class Bike {
    double Height;
    double Weight;
    int NumberOfWheel;
    String Engine;
    double Price;
    String Version;

    public Bike(double Height, double Weight, String Engine, double Price, String Version){
        this.Height = Height;
        this.Weight = Weight;
        this.Engine = Engine;
        this.Price = Price;
        this.Version = Version;
        this.NumberOfWheel = 2;
    }

    public abstract double FinalPrice();

    public abstract void PrintInfo();

    public void KindOfVersion(){
        System.out.println(format("This bike is a %s version", this.Version));
    }

}
