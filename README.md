# PemlanTugas2

**code**
1. [Student.java](Student.java)
2. [MainStudent.java](MainStudent.java)

### 1. Memperbaiki Kode
dalam class `MainStudent.java` ketika merubah objek anna tidak bisa langsung menggunakan konstruktor `anna = new Student` namun harus me- `set` satu-persatu nilainya
```java
 // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui
        // constructor
        System.out.println("===================");
        // anna = new Student("anna", "Batu", 18); perbaikan untuk kode (no.1)
        // tidak bisa menggunakan new karena akan membuat objek baru dengan alokasi memory heap yang berbeda dengan instansiasi sebelumnya
        anna.setAddress("Batu");
        anna.setName("anna");
        anna.setAge(18);
        anna.displayMessage();
```
apabila ingin ingin tetap menggunakan konstruktor harus me- `set` masing-masing nilai mata pelajaran agar tidak bernilai 0
### 2. Tambahkan constructor pada class Student dengan parameter yang mempunyai parameter masing masing nilai dari mata pelajaran kemudian contoh objek di main Class
```java
//konstruktor baru dengan parameter masing-masing nilai dari mata pelajaran (no.2)
    public Student (double math, double english, double science){
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        count++;
    }
```
kemudian contoh objek di main Class
```java
// membuat objek baru dengan menambahkan nilai melalui konstruktor berparameter nilai
        // contoh objek dengan konstruktor ber-parameter nilai-nilai setiap mata pelajaran (no.2)
        System.out.println("===================");
        Student diana = new Student(80, 70, 90);
        diana.setName("diana");
        diana.setAge(19);
        diana.setAddress("Blitar");
```
### 3.Tambahkan method dengan nilai balikan berupa boolean pada class student bernama statusAkhir untuk menentukan apakah siswa tersebut remidi atau tidak
```java
// Method boolean untuk menentukan apakah siswa tsb. remidi apabila nilai rata-ratanya kurang dari atau sama dengan 60
    // (no. 03)
    private boolean statusAkhir(){
        if (getAverage() >=61 ) {
            return true;
        } else{
            return false;
        }
    }
```
kemudian menampilkan hasilnya di method `displayMassage`
```java
  // display status siswa apakah remidi atau tidak (no.3)
        System.out.println("Status Peserta didik: ");
        if (statusAkhir()==true) {
            System.out.println("Lulus");
        } else{
            System.out.println("Tidak Lulus");
        }
    }
```
### 4. Memasukkan jumlah siswa sesuai dengan keinginan user
Menggunakan array setelah di instansisasi class `Student` lalu men- `set` masing-masing data per siswa
```java
 // membuat objek atau dengan jumlah yang dibutuhkan user (no.4)
        // menggunakan array untuk memasukan data-data masing-masing siswa
        System.out.println("===================");
        System.out.println("Berapa banyak siswa : ");
        int banyakSiswa = input.nextInt();
        Student[] siswa = new Student[banyakSiswa];
```
lalu menginputkan data-data masing-masing siswa menggunakan `for` looping
```java
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
```
### 5. Menghitung banyaknya objek yang kita buat
Deklarasi variabel untuk menyimpan angka hitungan objek
```java
private static int count = 0;
```
variabel tersebut akan di _increment_ setiap menginstansiasi objek baru
```java
 public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        count++;
    }
```
kemudian membuat method `jumlahObjek()` untuk menampilkan hasil dari hitungan
```java
// method untuk menampilkan jumlah objek yang telah di gunakan (no.5)
    public void jumlahObjek(){
        System.out.println("Jumlah objek student: "+count);
    }
```
## Screenshoot running code
[gambar1](?raw=true)
[gambar2](?raw=true)
