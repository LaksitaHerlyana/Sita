//Driver class
public class TesGuru{
    public static void main(String[] args) {
        //membuat obyek
        Guru aulia = new Guru();
        Guru diaur = new Guru();
        Guru pasha = new Guru();
        Guru andre = new Guru();
        Guru feni = new Guru();
        aulia.id = 1;
        aulia.nama = "aulia";
        aulia.mapel = "Produktif RPL";
        aulia.alamat = "Malang";
        diaur.id = 2;
        diaur.nama = "diaur";
        diaur.mapel = "Ipas";
        diaur.alamat = "Malang";
        pasha.id = 3;
        pasha.nama = "pasha";
        pasha.mapel = "Produktif RPL";
        pasha.alamat = "Malang";
        andre.id = 4;
        andre.nama = "andre";
        andre.mapel = "Bahasa Inggris";
        andre.alamat = "Malang";
        feni.id = 5;
        feni.nama = "feni";
        feni.mapel= "Matematika";
        feni.alamat = "Malang";
        System.out.println("Ini Data Aulia");
        System.out.println(aulia.id);
        System.out.println(aulia.nama);
        System.out.println(aulia.mapel);
        System.err.println(aulia.alamat);
        System.out.println("Ini Data Diaur");
        System.out.println(diaur.id);
        System.out.println(diaur.nama);
        System.out.println(diaur.mapel);
        System.out.println(diaur.alamat);
        System.out.println("Ini Data Pasha");
        System.out.println(pasha.id);
        System.out.println(pasha.nama);
        System.out.println(pasha.mapel);
        System.out.println(pasha.alamat);
        System.out.println("Ini Data Andre");
        System.out.println(andre.id);
        System.out.println(andre.nama);
        System.out.println(andre.mapel);
        System.out.println(andre.alamat);
        System.out.println("Ini Data Feni");
        System.out.println(feni.id);
        System.out.println(feni.nama);
        System.out.println(feni.mapel);
        System.out.println(feni.alamat);
    }
    
}
