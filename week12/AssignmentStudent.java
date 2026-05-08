public class AssignmentStudent {

    String nim, name, menu;

    public AssignmentStudent(String nim, String name, String menu) {
        this.nim = nim;
        this.name = name;
        this.menu = menu;
    }

    void print() {
        System.out.println(nim + " - " + name + " - Order: " + menu);
    }
}