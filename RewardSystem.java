import java.util.Scanner;

public class RewardSystem {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of loyal years: ");
        int years = input.nextInt();

        int[] rewards = new int[years];
        if (years > 0) rewards[0] = 1;
        if (years > 1) rewards[1] = 1;
        for (int i = 2; i < years; i++) 
        {
            rewards[i] = rewards[i - 1] + rewards[i - 2];
        }
        System.out.println("Reward points per year:");
        for (int i = 0; i < years; i++) {
            System.out.println("Year " + (i + 1) + ": " + rewards[i]);
        }

    input.close();
    }
}
