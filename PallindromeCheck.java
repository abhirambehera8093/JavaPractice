import java.util.Scanner;

public class PallindromeCheck {
    public static void main(String[] args) {
        
   System.out.println("Enter your string to check if it is pallindrome");
   Scanner sc= new Scanner(System.in);
   String inputString= sc.nextLine();
   System.out.println(checkPallindrome(inputString)?"It is a palindrome":"It is not a palindrome");
    sc.close();
    }

    public static boolean checkPallindrome(String inputStr)
        {
          


            int left =0;
            int right= inputStr.length()-1;

            while(left<right)
            {
                char leftChsr= inputStr.charAt(left);
                char rightChar= inputStr.charAt(right);

                if(!Character.isLetterOrDigit(leftChsr))
                {
                    left++;
                    continue;
                }

                if(!Character.isLetterOrDigit(rightChar))
                {
                    right--;
                    continue;
                }

                if(Character.toLowerCase(leftChsr)!= Character.toLowerCase(rightChar))
                {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    
}
