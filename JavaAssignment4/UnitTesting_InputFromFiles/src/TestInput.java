import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestInput {

    InputDate input1 = new InputDate("inputFiles/input1.txt");
    InputDate input2 = new InputDate("inputFiles/input2.txt");
    InputDate emptyInputs = new InputDate("inputFiles/emptyFile.txt");

    ThirtyDaysWindow range1;
    RequiredFormatOutputDate output1;

    ArrayList<String> signUpDate = new ArrayList<String>();
    ArrayList<String> currDate = new ArrayList<String>();

    ArrayList<String> startingWindowDateList;
    ArrayList<String> endingWindowDateList;

    @Test
    public void testInput(){

        try {
            input1.input();
        }
        catch (IOException ex){
            System.out.println("IOException because of the IO operations fails");
        }

        try {
            input2.input();
        }
        catch (IOException ex){
            System.out.println("IOException because of the IO operations fails");
        }

        try{
            emptyInputs.input();
        }
        catch (IOException ex){
            System.out.println("IOException because of the empty file");
        }

        signUpDate = input1.getSignUpDate();
        currDate = input1.getCurrDate();
        assertEquals("Wrong Answer for input size",5,input1.getNumberOfInputs());
        assertEquals("Wrong Answer for input1","16-07-1998 27-06-2017",signUpDate.get(0)+" "+currDate.get(0));
        assertEquals("Wrong Answer for input2","04-02-2016 04-04-2017",signUpDate.get(1)+" "+currDate.get(1));
        assertEquals("Wrong Answer for input3","04-05-2017 04-04-2017",signUpDate.get(2)+" "+currDate.get(2));
        assertEquals("Wrong Answer for input4","04-04-2015 04-04-2016",signUpDate.get(3)+" "+currDate.get(3));
        assertEquals("Wrong Answer for input5","04-04-2015 15-03-2016",signUpDate.get(4)+" "+currDate.get(4));

        signUpDate = input2.getSignUpDate();
        currDate = input2.getCurrDate();
        assertEquals("Wrong Answer for input size",5,input2.getNumberOfInputs());
        assertEquals("Wrong Answer for input1","16-12-1999 23-02-2003",signUpDate.get(0)+" "+currDate.get(0));
        assertEquals("Wrong Answer for input2","12-01-2004 30-01-2010",signUpDate.get(1)+" "+currDate.get(1));
        assertEquals("Wrong Answer for input3","15-05-2005 13-05-2006",signUpDate.get(2)+" "+currDate.get(2));
        assertEquals("Wrong Answer for input4","23-11-2016 13-09-2018",signUpDate.get(3)+" "+currDate.get(3));
        assertEquals("Wrong Answer for input5","11-09-2008 19-12-2008",signUpDate.get(4)+" "+currDate.get(4));
    }
}
