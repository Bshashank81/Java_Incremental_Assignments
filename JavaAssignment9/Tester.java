
public class Tester
{
    public static void main(String args[])
    {
        Token tobj = new Token("Once upon time there lived a king");

        boolean sentenceFound = tobj.patternMatch("[A-Z][a-z ]+[A-Z]*[a-z]+.");

        if(sentenceFound)
            System.out.println("The given sentence contains the first letter as capital letter " +
                    "and ends with a period .");
        else
            System.out.println("The given sentence either do not start with a capital letter " +
                    "ends in period .");
    }
}
