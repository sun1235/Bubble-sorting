/**
 * Created by Hunter on 3/3/2016.
 */

import java.util.*;

public class studentGrade {

    public static void main(String[] args)
    {
        student john = new student();
        john.name ="John Steward";
        input(john.grade);
        System.out.println(john.name + "'grades" );
        sorting(john.grade);
    }


    public static void displayGrade (int [] studentGrade)
    {
        for (int i = 0; i < studentGrade.length; i++)
        {
            System.out.print( studentGrade[i] + "\t");
        }
    }

    public static void input (int []studentGrade)
    {
        Random random = new Random();
        for (int i = 0; i < studentGrade.length; i++)
        {
            studentGrade[i] = random.nextInt(100 - 0 + 1) + 0;
        }
    }

    public static void sorting (int [] unsortGrade)
    {
        System.out.println("Before sorting: ");
        displayGrade(unsortGrade);
        System.out.println();

        int temp;
        for (int nextNumber = 0; nextNumber < unsortGrade.length; nextNumber++)
        {
            for (int compare2Number = 0; compare2Number < ((unsortGrade.length - 1) - nextNumber); compare2Number++)
            {
                if (unsortGrade[compare2Number] > unsortGrade[compare2Number+1])
                {
                    temp = unsortGrade[compare2Number];
                    unsortGrade[compare2Number] = unsortGrade[compare2Number+1];
                    unsortGrade[compare2Number + 1] = temp;
                }
            }
        }
        System.out.println("After sorting: ");
        displayGrade(unsortGrade);
    }
}
