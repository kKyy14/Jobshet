public class AssigmentMain {
    public static void main(String[] args) {

        Assigment data[] = {
            new Assigment("Ahmad", "220101001", 2022, 78, 82),
            new Assigment("Budi", "220101002", 2022, 85, 88),
            new Assigment("Cindy", "220101003", 2021, 90, 87),
            new Assigment("Dian", "220101004", 2021, 76, 79),
            new Assigment("Eko", "220101005", 2023, 92, 95),
            new Assigment("Fajar", "220101006", 2020, 88, 85),
            new Assigment("Gina", "220101007", 2023, 80, 83),
            new Assigment("Hadi", "220101008", 2020, 82, 84)
        };

        AssigmentScore sc = new AssigmentScore();

        int highest = sc.highestUTS(data, 0, data.length - 1);
        int lowest = sc.lowestUTS(data, 0, data.length - 1);
        double average = sc.averageUAS(data);

        System.out.println("Highest Midterm Score (UTS): " + highest);
        System.out.println("Lowest Midterm Score (UTS): " + lowest);
        System.out.println("Average Final Score (UAS): " + average);
    }
}