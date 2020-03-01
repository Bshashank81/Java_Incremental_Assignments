/**
1. A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.
**/

import java.util.ArrayList;

public class Permutations
{
    public static ArrayList<String> allPermutationsListOfNumber = new ArrayList<String>();
    public void findAllPermutations(String str, String ans)
    {
        // If string is empty
        if (str.length() == 0) {
            allPermutationsListOfNumber.add(ans);
            return;
        }


        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            // Recurvise call
            findAllPermutations(ros, ans + ch);
        }
    }

    public static ArrayList<String> getList()
    {
        return allPermutationsListOfNumber;
    }
}
