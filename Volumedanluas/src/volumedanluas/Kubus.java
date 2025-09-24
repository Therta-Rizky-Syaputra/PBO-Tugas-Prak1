package volumedanluas;

public class Kubus extends BangunRuang {
 private double sisi;

 public Kubus(double s) {
     this.sisi = s;
 }

 public double volume() {
     return sisi * sisi * sisi;
 }

 public double luasPermukaan() {
     return 6 * sisi * sisi;
 }
}
