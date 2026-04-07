public class Lecturer08 {
    String id;
    String name;
    boolean gender;
    int age;

    public Lecturer08(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        String jk = (gender) ? "Male" : "Female";
        System.out.println(id + " | " + name + " | " + jk + " | " + age);
    }
}