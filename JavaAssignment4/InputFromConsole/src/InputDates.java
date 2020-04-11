import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InputDates {
    public ArrayList<String> signUpDate = new ArrayList<String>();
    public ArrayList<String> currDate = new ArrayList<String>();
    int numberOfInputs;

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void inputDatesFromConsole(){
        numberOfInputs = sc.nextInt();

        for(int i=0;i<numberOfInputs;i++){
            String[] kycDates = sc.next().split(" ");
            signUpDate.add(kycDates[0]);
            currDate.add(kycDates[1]);
        }
    }

    public ArrayList<String> getSignUpDate() {
        //System.out.println("sign up dates size "+signUpDate.size()+" "+signUpDate);
        return signUpDate;
    }

    public ArrayList<String> getCurrDate() {
        return currDate;
    }
}

