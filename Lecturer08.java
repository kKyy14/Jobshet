public class Lecturer08 {

    private String idLecturer;
    private String name;
    private boolean activeStatus;
    private int yearOfEntry;
    private String expertiseCompetency;

    public Lecturer08() {
        idLecturer = "-";
        name = "-";
        activeStatus = false;
        yearOfEntry = 0;
        expertiseCompetency = "-";
    }

    public Lecturer08(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    public void displayInformation() {
        System.out.println("ID Dosen            : " + idLecturer);
        System.out.println("Nama                : " + name);
        System.out.println("Status Aktif        : " + (activeStatus ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Masuk         : " + yearOfEntry);
        System.out.println("Bidang Keahlian     : " + expertiseCompetency);
        System.out.println("--------------------------------------");
    }

    public void setStatusActive(boolean status) {
        activeStatus = status;
        System.out.println("Status dosen sekarang: " + (activeStatus ? "Aktif" : "Tidak Aktif"));
    }

    public int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    public void changeSkill(String skill) {
        expertiseCompetency = skill;
        System.out.println("Bidang keahlian berhasil diubah menjadi: " + expertiseCompetency);
    }
}