package volumedanluas;

public class Main {
    public static void main(String[] args) {
        BangunRuang balok = new Balok(4, 3, 2);
        BangunRuang kubus = new Kubus(5);

        System.out.println("=== Balok ===");
        System.out.println("Volume Balok: " + balok.volume());
        System.out.println("Luas Permukaan Balok: " + balok.luasPermukaan());

        System.out.println("\n=== Kubus ===");
        System.out.println("Volume Kubus: " + kubus.volume());
        System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaan());
    }
}
