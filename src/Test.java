public class Test {
    public static void main(String[] args) {
        Bike bike1 = new CafeRacerBike(650, 120, "250cc", 3000, "Standard", "One seat");
        Bike bike2 = new CafeRacerBike(550, 100, "150cc", 2500, "Special edition", "Two seat");
        Bike bike3 = new ClassicBike(750, 150, "500cc", 5000, "Special edition", true);
        Bike bike4 = new ClassicBike(700, 140, "400cc", 4000, "Retro", false);

        bike1.KindOfVersion();
        bike1.PrintInfo();
        System.out.println("----------------------------");
        bike2.KindOfVersion();
        bike2.PrintInfo();
        System.out.println("----------------------------");
        bike3.KindOfVersion();
        bike3.PrintInfo();
        System.out.println("----------------------------");
        bike4.KindOfVersion();
        bike4.PrintInfo();


    }

}
