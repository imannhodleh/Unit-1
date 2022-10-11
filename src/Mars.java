public class Mars {

    public static void main(String[] args) {

        String ColonyName = "Jupiter";

        int ShipPopulation = 300;

        double ShipFood = 4000.00;

        boolean Landing = true;

        ShipFood = ShipFood - (ShipPopulation *0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);

        System.out.println(ShipFood);

        ShipFood = ShipFood + (ShipFood * .5);

        ShipPopulation = ShipPopulation + 5;

        String LandingLocation = "The Ocean";

        if (LandingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on the plain");
        } else {
            System.out.println("ERROR!!! FLIGHT PLAN ALREADY SET. LANDING ON THE PLAIN");
        }

        Landing = LandingCheck(100);


    }

    public static boolean LandingCheck(int loops) {

        for (int i = 0; i <= Loops; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("Keep center");
            } else if ((i % 5) == 0){
                System.out.println("Right");
            } else if ((i % 3 ) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");

        return false;
    }



}
