import java.util.ArrayList;

public class PrintVampireNumber
{
    public void calculateVampire()
    {
        Permutations perObj = new Permutations();
        int count = 0;
        long num = 10;
        ArrayList<String> currPermutationsList = new ArrayList<String>();
        while(count<100)
        {
            long numOfDigits = Long.toString(num).length();
            if(numOfDigits%2!=0) {
                num=num*10;
            }
            String str = Long.toString(num);
            long denominator = (long)Math.pow(10,numOfDigits/2);

            currPermutationsList.clear();
            perObj.findAllPermutations(str,"");
            currPermutationsList = perObj.getList();

            for(int i = 0; i<currPermutationsList.size();i++)
            {
                String currStr = currPermutationsList.get(i);
                long currNum = Long.parseLong(currStr);

                long num1 = currNum/denominator;
                long num2 = currNum%denominator;

                if(num1%10 == 0 && num2%10 == 0)
                {
                    continue;
                }

                long result = num1 * num2;
                if(result == num)
                {
                    count++;
                    System.out.println(num);
                    break;
                }
            }
            num++;
        }
    }
    public static void main(String args[])
    {
        PrintVampireNumber pvn = new PrintVampireNumber();
        pvn.calculateVampire();
    }
}
