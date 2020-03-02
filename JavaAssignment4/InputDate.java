import java.util.ArrayList;
import java.util.Scanner;

public class InputDate
{
    ArrayList<String> signUpDate = new ArrayList<String>();
    ArrayList<String> currDate = new ArrayList<String>();
    public void input()
    {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String[] inputStrings = sc.next().split(" ");
            signUpDate.add(inputStrings[0]);
            currDate.add(inputStrings[1]);
        }
    }
    public ArrayList<String> getSignUpDate()
    {
        return signUpDate;
    }
    public ArrayList<String> getCurrDate()
    {
        return currDate;
    }
}
