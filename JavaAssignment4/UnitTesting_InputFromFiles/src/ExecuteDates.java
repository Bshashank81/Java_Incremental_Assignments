import java.util.ArrayList;

public class ExecuteDates
{
    public static void main(String args[])
    {
        RequiredFormatOutputDate rfd = new RequiredFormatOutputDate("inputFiles/input2.txt");
        rfd.printOutputInDesiredFormat();

        ArrayList<String> startDateWindowList = rfd.getFormattedStartDateList();
        ArrayList<String> endDateWindowList = rfd.getFormattedEndDateList();

        for(int i=0;i<startDateWindowList.size();i++){
            System.out.println(startDateWindowList.get(i)+" "+endDateWindowList.get(i));
        }
    }
}