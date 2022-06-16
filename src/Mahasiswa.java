public class Mahasiswa {
    private String nama, StudentID;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String StudentID) {
        this.nama = nama;
        this.StudentID = StudentID;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudentID() {
        return this.StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

}
