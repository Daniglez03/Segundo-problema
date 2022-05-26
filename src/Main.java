public class Main {

    public static void main(String[] args) {
        VeredaGT  Vereda3000_GT = new VeredaGT(60, "GS7593S");

        Vereda3000_GT.move();
        Vereda3000_GT.move();

        Vereda3000_GT.recharge();
        System.out.println(Vereda3000_GT.energyLevel());

        Vereda3000_GT.move();
        Vereda3000_GT.move();
        Vereda3000_GT.move();

        System.out.println(Vereda3000_GT.energyLevel());

        System.out.println(Vereda3000_GT.status());
    }
}
