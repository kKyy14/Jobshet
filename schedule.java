import java.util.Scanner;

public class schedule {

    static String[][] schedule;

    static void inputData(int n){

        Scanner input = new Scanner(System.in);

        for(int i=0;i<n;i++){

            System.out.println("Schedule " + (i+1));

            System.out.print("Course name: ");
            schedule[i][0] = input.nextLine();

            System.out.print("Room: ");
            schedule[i][1] = input.nextLine();

            System.out.print("Day: ");
            schedule[i][2] = input.nextLine();

            System.out.print("Time: ");
            schedule[i][3] = input.nextLine();

            System.out.println();
        }
    }

    static void showAll(int n){

        System.out.println("\nAll Schedule:");

        for(int i=0;i<n;i++){

            System.out.println(
                schedule[i][0] + " | " +
                schedule[i][1] + " | " +
                schedule[i][2] + " | " +
                schedule[i][3]
            );
        }
    }

    static void searchDay(int n, String day){

        System.out.println("\nSchedule on " + day + ":");

        for(int i=0;i<n;i++){

            if(schedule[i][2].equalsIgnoreCase(day)){

                System.out.println(
                    schedule[i][0] + " | " +
                    schedule[i][1] + " | " +
                    schedule[i][3]
                );
            }
        }
    }

    static void searchCourse(int n, String course){

        System.out.println("\nSearch result:");

        for(int i=0;i<n;i++){

            if(schedule[i][0].equalsIgnoreCase(course)){

                System.out.println(
                    schedule[i][0] + " | " +
                    schedule[i][1] + " | " +
                    schedule[i][2] + " | " +
                    schedule[i][3]
                );
            }
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter total schedule: ");
        int n = input.nextInt();
        input.nextLine();

        schedule = new String[n][4];

        inputData(n);

        showAll(n);

        System.out.print("\nEnter day to search: ");
        String day = input.nextLine();
        searchDay(n, day);

        System.out.print("\nEnter course name to search: ");
        String course = input.nextLine();
        searchCourse(n, course);
    }
}