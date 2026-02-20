import java.util.Scanner;

public class selection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Assignment score: ");
        int tugas = input.nextInt();

        System.out.print("Quiz score: ");
        int kuis = input.nextInt();

        System.out.print("UTS score: ");
        int uts = input.nextInt();

        System.out.print("UAS score: ");
        int uas = input.nextInt();

        if(tugas<0 || tugas>100 || kuis<0 || kuis>100 ||
           uts<0 || uts>100 || uas<0 || uas>100){
            System.out.println("Invalid value");
            return;
        }

        double finalScore = (0.2*tugas)+(0.2*kuis)+(0.3*uts)+(0.3*uas);

        String grade;
        String status;

        if(finalScore>=80) grade="A";
        else if(finalScore>=73) grade="B+";
        else if(finalScore>=65) grade="B";
        else if(finalScore>=60) grade="C+";
        else if(finalScore>=50) grade="C";
        else if(finalScore>=40) grade="D";
        else grade="E";

        if(grade.equals("A")||grade.equals("B+")||grade.equals("B")
        ||grade.equals("C+")||grade.equals("C"))
            status="PASS";
        else
            status="NOT PASS";

        System.out.println("Final Score: "+finalScore);
        System.out.println("Grade: "+grade);
        System.out.println("Status: "+status);
    }
}