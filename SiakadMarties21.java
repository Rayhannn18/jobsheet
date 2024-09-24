import java.util.Scanner;

public class SiakadMarties21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, nim;
        char classes;
        byte absentNumber;
        double QuizGrade, TaskGrade, ExampGrade, LastGrade;

        System.out.println("========== INPUT BIODATA MAHASISWA SIB-1E ========== \n");
        System.out.print("Masukkan Nama anda \t\t: ");
        name = input.nextLine();
        System.out.print("Masukkan NIM anda \t\t: ");
        nim = input.nextLine();
        System.out.print("Masukkan Kelas anda \t\t: ");
        classes = input.nextLine().charAt(0);
        System.out.print("Masukkan Nomor Absen anda \t: ");
        absentNumber = input.nextByte();

        System.out.println("========== INPUT NILAI MAHASISWA SIB-1E ========== \n");
        System.out.print("Masukkan Nilai Kuis \t: ");
        QuizGrade = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas \t: ");
        TaskGrade = input.nextDouble();
        System.out.print("Masukkan Nilai Ujian \t: ");
        ExampGrade = input.nextDouble();
        input.close();

        System.out.println("========== HASIL ========== \n");

        LastGrade = (QuizGrade + TaskGrade + ExampGrade) / 3;
        char Grade;
        String Kualification;

        if (LastGrade > 80 && LastGrade <= 100) {
            Grade = 'A';
            Kualification = "Sangat Baik";
        } else if (LastGrade > 73 && LastGrade <= 80) {
            Grade = 'B';
            Kualification = "Lebih Dari Baik";
        } else if (LastGrade > 65 && LastGrade <= 73) {
            Grade = 'B';
            Kualification = "Baik";
        } else if (LastGrade > 60 && LastGrade <= 65) {
            Grade = 'C';
            Kualification = "Lebih Dari Cukup";
        } else if (LastGrade > 50 && LastGrade <= 60) {
            Grade = 'C';
            Kualification = "Cukup";
        } else if (LastGrade > 39 && LastGrade <= 50) {
            Grade = 'D';
            Kualification = "Kurang";
        } else {
            Grade = 'E';
            Kualification = "Gagal";
        }

        System.out.print("Mahasiswa dengan nama \t : " + name + " NIM : " + nim);
        System.out.println(" Kelas : " + "1" + classes + " Absen : " + absentNumber);
        System.out.println("Nilai Akhir \t\t : " + LastGrade);
        System.out.println("Nilai Akhir Huruf \t : " + Grade);
        System.out.println("Kualifikasi Akhir \t : " + Kualification);

    }
}
