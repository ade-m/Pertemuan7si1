public class Dosen {
    private String kdDosen, Nama;
    public String[] studentID; //assoc ke mhs
    public Dosen() {
    }

    public Dosen(String kdDosen, String Nama) {
        this.kdDosen = kdDosen;
        this.Nama = Nama;
    }

    public String getKdDosen() {
        return this.kdDosen;
    }

    public void setKdDosen(String kdDosen) {
        this.kdDosen = kdDosen;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String[] getStudentID() {
        return this.studentID;
    }
    public String getStudentIDs(){
            String hasil ="";
            for (String string : studentID) {
                hasil+=string + " \n";
            }
            return hasil;
    }

    public void setStudentID(String[] studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "{" +
            " kdDosen='" + getKdDosen() + "'" +
            ", Nama='" + getNama() + "'" +
            ", studentID='" + getStudentIDs() + "'" +
            "}";
    }

}
