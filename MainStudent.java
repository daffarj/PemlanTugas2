import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        // menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui
        // constructor
        System.out.println("===================");
        // anna = new Student("anna", "Batu", 18); perbaikan untuk kode (no.1)
        // tidak bisa menggunakan new karena akan membuat objek baru dengan alokasi memory heap yang berbeda dengan instansiasi sebelumnya
        anna.setAddress("Batu");
        anna.setName("anna");
        anna.setAge(18);
        anna.displayMessage();

        // siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        // membuat objek baru dengan menambahkan nilai melalui konstruktor berparameter nilai
        // contoh objek dengan konstruktor ber-parameter nilai-nilai setiap mata pelajaran (no.2)
        System.out.println("===================");
        Student diana = new Student(80, 70, 90);
        diana.setName("diana");
        diana.setAge(19);
        diana.setAddress("Blitar");

        // membuat objek atau dengan jumlah yang dibutuhkan user (no.4)
        // menggunakan array untuk memasukan data-data masing-masing siswa
        System.out.println("===================");
        System.out.println("Berapa banyak siswa : ");
        int banyakSiswa = input.nextInt();
        Student[] siswa = new Student[banyakSiswa];

        // looping for untuk menginputkan data siswa ke array
        for(int i = 0; i < banyakSiswa; i++) {
            System.out.println("Masukkan data-data berikut : ");
            System.out.println("Siswa ke - " + (i + 1));
            System.out.println("Nama : ");
            String nama = input.next();
            input.nextLine(); // untuk mengkosongkan buffer input
            System.out.println("Alamat : ");
            String alamat = input.nextLine();
            System.out.println("Umur : ");
            int umur = input.nextInt();
            System.out.println("Nilai Matematika : ");
            double nilaiMatematika = input.nextDouble();
            System.out.println("Nilai Bahasa Inggris : ");
            double nilaiBahasaInggris = input.nextDouble();
            System.out.println("Nilai Sains : ");
            double nilaiSains = input.nextDouble();

            siswa[i] = new Student(nama, alamat, umur);
            siswa[i].setMath(nilaiMatematika); 
            siswa[i].setEnglish(nilaiBahasaInggris);
            siswa[i].setScience(nilaiSains);
            

        }

        System.out.println("Data-data Siswa");
        System.out.println("===================");
        for(int i = 0; i < banyakSiswa; i++) {
            System.out.println("Siswa ke - " + (i + 1));
            siswa[i].displayMessage();
            siswa[i].jumlahObjek();
        }
        input.close();
        
    }
}
