/*
Pattern

Input:
10

Output:
1098765432*
109876543*1
10987654*21
1098765*321
109876*4321
10987*54321
1098*654321
109*7654321
10*87654321
*987654321

*/

import java.util.*;

public class Main
{  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int index1 = 1; index1 <= rows; index1++)
        {
            for(int index2 = rows; index2 >= 1; index2--)
            {
                if(index2 != index1)
                {
                    System.out.print(index2);
                }
                else
                {
                    System.out.print("*");
                }
            }   
            System.out.println();  
        }    
    }
}
