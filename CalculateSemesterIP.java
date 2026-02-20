import java.util.Scanner;

public class CalculateSemesterIP {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] courses = {
            "Pancasila",
            "Information Technology Concepts",
            "Critical Thinking and Problem Solving",
            "Basic Mathematics",
            "English",
            "Basic Programming",
            "Basic Programming Practicum",
            "Occupational Health and Safety"
        };

        int[] credits = {2,2,2,3,2,2,1,2};

        double[] numericScore = new double[courses.length];
        String[] letterGrade = new String[courses.length];
        double[] gradePoint = new double[courses.length];

        double totalQualityPoints = 0;
        int totalCredits = 0;

        System.out.println("Semester IP Calculation Program\n");

        // input numeric score
        for(int i=0;i<courses.length;i++){

            System.out.print("Enter numeric score for course " + courses[i] + ": ");
            numericScore[i] = input.nextDouble();

            // convert score to letter grade and grade point
            if(numericScore[i] > 80){
                letterGrade[i] = "A";
                gradePoint[i] = 4.0;
            }
            else if(numericScore[i] > 73){
                letterGrade[i] = "B+";
                gradePoint[i] = 3.5;
            }
            else if(numericScore[i] > 65){
                letterGrade[i] = "B";
                gradePoint[i] = 3.0;
            }
            else if(numericScore[i] > 60){
                letterGrade[i] = "C+";
                gradePoint[i] = 2.5;
            }
            else if(numericScore[i] > 50){
                letterGrade[i] = "C";
                gradePoint[i] = 2.0;
            }
            else if(numericScore[i] > 39){
                letterGrade[i] = "D";
                gradePoint[i] = 1.0;
            }
            else{
                letterGrade[i] = "E";
                gradePoint[i] = 0.0;
            }

            totalQualityPoints += gradePoint[i] * credits[i];
            totalCredits += credits[i];
        }

        // display conversion table
        System.out.println("\nGrade Conversion Result");
        System.out.println("======================================================================");
        System.out.printf("%-40s %-15s %-15s %-15s\n",
                "Course","Numeric Score","Letter Grade","Grade Point");

        for(int i=0;i<courses.length;i++){
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n",
                    courses[i],numericScore[i],letterGrade[i],gradePoint[i]);
        }

        double semesterIP = totalQualityPoints / totalCredits;

        System.out.println("======================================================================");
        System.out.printf("Semester IP : %.2f\n", semesterIP);

    }
}
