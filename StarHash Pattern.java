/*
StarHash Pattern

Input:
10

Output:
*#########
**########
***#######
****######
*****#####
******####
*******###
********##
*********#
**********

*/

import java.util.*;

public class Main
{  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int index1 = row; index1 >= 1; index1--)  
        {  
            for(int index2 = row+1; index2 > index1; index2--)  
            {  
                System.out.print("*");  
            }  
            for(int index3 = 1; index3 < index1; index3++)  
            {  
                System.out.print("#");  
            }  
            System.out.println();  
        }  
    }  
}
