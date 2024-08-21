import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    // Meminta input jumlah jam kerja
    System.out.println("MAsukkan jumlah jam kerja: ");
    int jamKerja = scanner.nextInt();

    // Meminta input tarif per jam
    System.out.println("Masukkan tarif perjam: ");
    int tarifPerjam = scanner.nextInt();

    // Menghitung gaji bruto
    int gajiBruto = jamKerja * tarifPerjam;

    // Menghintung potongan pajak
    double potonganPajak = gajiBruto * 0.10;

    // Menghitung gaji bersih
    double gajiBersih = gajiBruto - potonganPajak;

    // Menampilkan hasil 
    System.out.println("Gaji Bruto: " + gajiBruto);
    System.out.println("Potongan pajak: " + potonganPajak);
    System.out.println("Gaji Bersih: " + gajiBersih);
        
    }
    
}
