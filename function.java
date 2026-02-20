public class function {

    public static int hitungIncome(int aglonema, int yam, int alocasia, int rose) {

        int priceAglonema = 75000;
        int priceYam = 50000;
        int priceAlocasia = 60000;
        int priceRose = 10000;

        int income = (aglonema * priceAglonema)
                   + (yam * priceYam)
                   + (alocasia * priceAlocasia)
                   + (rose * priceRose);

        return income;
    }

    public static void main(String[] args) {

        int[][] stock = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };

        String[] branch = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        System.out.println("RoyalGarden Income Report\n");

        for(int i=0;i<stock.length;i++){

            int income = hitungIncome(
                stock[i][0],
                stock[i][1],
                stock[i][2],
                stock[i][3]
            );

            System.out.println(branch[i]);
            System.out.println("Income = " + income);

            if(income > 1500000){
                System.out.println("Status = Very Good");
            }else{
                System.out.println("Status = Need Evaluation");
            }

            System.out.println();
        }

    }
}