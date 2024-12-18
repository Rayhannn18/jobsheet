public class ContohVariabel14 {

    public static void main(String[] args) {

        String myCitacita = "Menjadi Mahasiswa pandai";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 18;
        double $ipk = 4.0, tinggi = 169;
        System.out.println("Cita - cita saya adalah     :" + myCitacita);
        System.out.println("Apakah saya beneran pandai? :" + isPandai);
        System.out.println("Jenis Kelamin saya          :" + jenisKelamin);
        System.out.println("Umurku saat ini             :" + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}