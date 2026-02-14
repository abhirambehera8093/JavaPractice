
import java.util.Scanner;

public class ReverseStringPractice {

 // reversing the strings without using in built reverse function
    public static void main(String[]args)
    {
        System.out.println("Enter The string that you want to reverse");
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();
        sc.close();
        System.out.println(reverseString(input));
    }

    public static String reverseString(String str)
    {
        if(str == null || str.isEmpty() || str.length() == 1)
        {
            return str; 
        }
        
        // String reverrString="";
        // for (int i=str.length()-1;i>-1;i--)
        // {
        //    reverrString= reverrString.concat(String.valueOf(str.charAt(i)));
        // }

        //reverse using character swaping
       char [] strArray= str.toCharArray();
       int left=0;
       int right=strArray.length-1;

       while(left<right)
       {
        char temp =strArray[right];
        strArray[right]=strArray[left];
        strArray[left]=temp;

        left++;
        right--;
       }



        return new String(strArray);
    }
    
}
