/**
 Question:
 Write a java function that checks if the input string contains all the letters of the
 alphabet a-z (case-insensitive). Write time and space complexity of your solution as comments in the source file.

 Time Complexity:
 for "assignments" :- constant number of operations -> O(1)
 for 1st "for loop" :- 26x3 + 2 operations -> O(1)
 for 2nd "for loop" :- considering input size as n, 6n + 2 -> O(n)
 for 3rd "for loop" :- 26x3 + 3 operations -> O(1)
 for if-else condition :- 2 operations -> O(1)
 Total time = O(1) + O(n) + O(1) + O(1) => O(n)

 Hence,The time complexity is O(n)

 Space Complexity:
 count -> 4 bytes
 inputString -> n bytes
 alphabet -> 26 bytes
 num array -> 26*4 bytes
 k -> 4 bytes
 i -> 4 bytes
 j -> 4 bytes
 Total = constants + n

 Hence,Space Complexity = O(n)

 **/
import java.util.HashMap;
import java.util.Scanner;

public class NewAlphabet
{
    public boolean containsAllAlphabets(String inputString)
    {
        int  count = 0;
        inputString = inputString.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        HashMap<Integer,Integer> index_value= new HashMap<Integer, Integer>();

        for(int i=0;i<inputString.length();i++)
        {
            char ch = inputString.charAt(i);
            int index = alphabet.indexOf(ch);
            if(Character.isLetter(ch))
            {
                index_value.put(index,1);
            }
        }
        for(int j=0;j<26;j++)
        {
            int currentIndex = index_value.get(j);
            if(currentIndex==0)
                return false;
            else
                count++;
        }
        if(count==26)
            return true;
        else
            return false;

    }
    public static void main(String args[])
    {
        Alphabet alp = new Alphabet();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String inputString = sc.next();
        boolean result = alp.containsAllAlphabets(inputString);
        System.out.println(result);
    }
}
