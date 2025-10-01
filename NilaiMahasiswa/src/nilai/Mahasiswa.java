package nilai;

public class Mahasiswa {
	
    String npm;
    String nama;
    double hadir, tugas, uts, uas;

    public Mahasiswa(String npm, String nama, double hadir, double tugas, double uts, double uas) {
        this.npm = npm;
        this.nama = nama;
        this.hadir = hadir;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (0.10 * hadir) + (0.20 * tugas) + (0.30 * uts) + (0.40 * uas);
    }
    
    public char tentukanGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            return 'A';
        } else if (nilaiAkhir >= 66) {
            return 'B';
        } else if (nilaiAkhir >= 56) {
            return 'C';
        } else if (nilaiAkhir >= 46) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public String tentukanKeterangan() {
        char grade = tentukanGrade();
        if (grade == 'A') return "ISTIMEWA";
        else if (grade == 'B') return "BAIK";
        else if (grade == 'C') return "CUKUP";
        else if (grade == 'D') return "KURANG";
        else return "KURANG SEKALI";
    }
}
