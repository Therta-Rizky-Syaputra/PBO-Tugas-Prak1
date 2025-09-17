package matematika;

public class MatematikaInheritance {
    Matematika2 mtk2 = new Matematika2();
    public void OperasiAritmatika (int a, int b) {
       System.out.println("Pertambahan " + a + " + " + b + " : " + mtk2.pertambahan(a, b));
       System.out.println("Pengurangan " + a + " - " + b + " : " + mtk2.pengurangan(a, b));
       System.out.println("Perkalian " + a + " x " + b + " : " + mtk2.perkalian(a, b));
       System.out.println("Pembagian " + a + " / " + b + " : " + mtk2.pembagian(a, b));
       System.out.println("Modulus " + a + " % " + b + " : " + mtk2.modulus(a, b));
   }
   
   public static void main(String[] args) {
       MatematikaInheritance mtkInherit = new MatematikaInheritance ();
       mtkInherit.OperasiAritmatika(25, 5);
   }
} 