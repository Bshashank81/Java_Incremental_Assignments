import java.util.ArrayList;

public class ExecuteDates
{
    public static void main(String args[])
    {
        InputDate idObj = new InputDate();
        idObj.input();

        ArrayList<String> signUpDate = idObj.getSignUpDate();
        ArrayList<String> currDate = idObj.getCurrDate();

        for(int i=0;i<signUpDate.size();i++)
        {
            String tempSignUpDate = signUpDate.get(i);
            String tempCurrentDate = currDate.get(i);
            NewDateRanges ndr = new NewDateRanges();
            ndr.calculatingDates(tempSignUpDate,tempCurrentDate);
        }

        OutputFormDates ofdObj = new OutputFormDates();
        ofdObj.printOutputInDesiredFormat();

    }
}
