import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MedianOfPingTimes
{
    public ArrayList<Double> getPingTimes() throws IOException
    {
        String s = null;

        // run the Unix "ping -c 6 google.com" command
        // using the Runtime exec method:
        Process p = Runtime.getRuntime().exec("ping -c 6 google.com");

        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

        // read the output from the command into ArrayList
        ArrayList<Double> listOfPingTimes = new ArrayList<Double>();
        while ((s = stdInput.readLine()) != null)
        {
            int index = s.indexOf("time=");
            if(index!=-1)
            {
                String st = s.substring(index + 5, index + 9);
                double d = Double.parseDouble(st);
                listOfPingTimes.add(d);
            }
        }
        return listOfPingTimes;
    }
}

class CalculateMedian
{
    public static void main(String args[])
    {
        try
        {
            MedianOfPingTimes moptObj = new MedianOfPingTimes();
            ArrayList<Double> listOfPingTimes = moptObj.getPingTimes();
            Collections.sort(listOfPingTimes);
            System.out.println("The list of ping times:\n"+listOfPingTimes);
            if(listOfPingTimes.size()%2 == 1)
            {
                int medianIndex = (listOfPingTimes.size()/2);
                System.out.println("median is "+listOfPingTimes.get(medianIndex));
            }
            else if(listOfPingTimes.size()%2 == 0)
            {
                int medianIndex = (listOfPingTimes.size())/2;
                double median1 = listOfPingTimes.get(medianIndex);
                double median2 = listOfPingTimes.get(medianIndex-1);
                double median = (median1 + median2)/2;

                System.out.printf("The median of the time taken to ping is %.2f",median);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}