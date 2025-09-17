package konversisuhu;

public class DemoKonversiSuhu {
 public static void main(String[] args) {
     KonversiSuhu suhu1 = new KonversiSuhu();
     KonversiSuhu2 suhu2 = new KonversiSuhu2();

     double c = 100;
     double f = 212;

     System.out.println("=== Dari class KonversiSuhu ===");
     System.out.println(c + "°C ke Fahrenheit = " + suhu1.celciusToFahrenheit(c) + "°F");
     System.out.println(c + "°C ke Reamur = " + suhu1.celciusToReamur(c) + "°R");

     System.out.println("\n=== Dari class KonversiSuhu2 (inheritance) ===");
     System.out.println(f + "°F ke Reamur = " + suhu2.fahrenheitToReamur(f) + "°R");
 }
}
