package volumedanluas;

public class Balok extends BangunRuang {
 private double panjang, lebar, tinggi;

 public Balok(double p, double l, double t) {
     this.panjang = p;
     this.lebar = l;
     this.tinggi = t;
 }

 @Override
 public double volume() {
     return panjang * lebar * tinggi;
 }

 @Override
 public double luasPermukaan() {
     return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
 }
}
