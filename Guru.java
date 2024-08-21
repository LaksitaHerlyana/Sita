//object Class
public class Guru{
    String guru;
    int id;
    String nama;
    String mapel;
    String alamat;

    /*Constructor*/
    public Guru() {
        id = 1;
        nama = "pakDiaur";
        mapel = "pjok";
        alamat = "malang";
        id = 2;
        nama = "buAulia";
        mapel = "produktifRPL";
        alamat = "malang";
        id = 3;
        nama = "buFeni";
        mapel = "matematika";
        alamat = "malang";
        id = 4;
        nama = "buPasha";
        mapel = "produktifRPL";
        alamat = "malang";
        id = 5;
        nama = "pakAndre";
        mapel = "bahasa inggris";
        alamat = "malang";
        id = 6;
        nama = "buChusnu";
        mapel = "IPAS";
        alamat = "malang";
        id = 7;
        nama = "pakEmil";
        mapel = "kesiswaan";
        alamat = "malang";
    }    
    //Constructor Parameter
    public Guru(int id,String nama,String mapel,String alamat) {
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }


    //method
    public void print() {
        System.out.println("id : "+id);
        System.out.println("nama : "+nama);
        System.out.println("mapel : "+mapel);
        System.out.println("alamat : "+alamat);

    }







    

}