
package QUIZ_PBOF_0077;

import java.util.*;

class Induk1
{
     private void inString()
     {
        Scanner scan= new Scanner(System.in);
        System.out.println("Input Senteces : ");
        String string = scan.nextLine();
        
        int maxCount = 0;
        char mostFrequentChar = string.charAt(0);
        for (int i = 0; i < string.length(); i++) 
        {
            char c = string.charAt(i);
            int count = 0;
            for (int j = i; j < string.length(); j++) {
                if (string.charAt(j) == c) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = c;
            }
            
        }
        System.out.println("Karakter yang paling sering muncul: " + mostFrequentChar);
     }
     
     void Output()
     {
        inString();
     }
        
}