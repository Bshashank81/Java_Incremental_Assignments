import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class OutputFormDates
{
    NewDateRanges ndrObj = new NewDateRanges();
    ArrayList<LocalDate> startDateList = ndrObj.getStartDateList();
    ArrayList<LocalDate> endDateList = ndrObj.getEndDateList();



    public void printOutputInDesiredFormat()
    {
        String formattedStartDate;
        String formattedEndDate;
        for(int i=0;i<startDateList.size();i++)
        {
            LocalDate startDate = startDateList.get(i);
            LocalDate endDate = endDateList.get(i);
            if(startDate.compareTo(endDate) == 0)
            {
                System.out.println("No Range");
            }
            else
            {
                formattedStartDate = startDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                formattedEndDate = endDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                System.out.println(formattedStartDate+"\t"+formattedEndDate);
            }
        }
    }
}
