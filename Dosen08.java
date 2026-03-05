public class Dosen08 {
    // atribut
    String code;
    String name;
    boolean gender;
    int age;

    // constructor
    public Dosen08(String code, String name, boolean gender, int age) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // tampil data dosen
    void printInfo() {
        System.out.println("Code   : " + code);
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + (gender ? "Male" : "Female"));
        System.out.println("Age    : " + age);
        System.out.println("-----------------------------------");
    }
}