public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int count = 0;

    //overload
    public Student() {
        name = "";
        address = "";
        age = 0;
    }

    //konstruktor berparameter
    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        count++;
    }

    //konstruktor baru dengan parameter masing-masing nilai dari mata pelajaran (no.2)
    public Student (double math, double english, double science){
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        count++;
    }

    public void setName(String n) {

        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(double math) {
        mathGrade = math;
    }

    public void setEnglish(double english) {
        englishGrade = english;
    }

    public void setScience(double science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    // Method boolean untuk menentukan apakah siswa tsb. remidi apabila nilai rata-ratanya kurang dari atau sama dengan 60
    // (no. 03)
    private boolean statusAkhir(){
        if (getAverage() >=61 ) {
            return true;
        } else{
            return false;
        }
    }

    // method untuk menampilkan jumlah objek yang telah di gunakan (no.5)
    public void jumlahObjek(){
        System.out.println("Jumlah objek student: "+count);
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.printf("mempunyai nilai rata rata %.2f", getAverage());
        // display status siswa apakah remidi atau tidak (no.3)
        System.out.println("Status Peserta didik: ");
        if (statusAkhir()==true) {
            System.out.println("Lulus");
        } else{
            System.out.println("Tidak Lulus");
        }
    }
}