public class App {
    public static void main(String[] args) throws Exception {
       Mahasiswa a = new Mahasiswa("021111","Jian");
       Dosen b = new Dosen("01245", "Budi");
       b.studentID = new String[2];
       b.studentID[0]= "021111";

    System.out.println(b);
    }
}
