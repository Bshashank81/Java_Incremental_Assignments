import java.time.LocalDate;
import java.util.ArrayList;

public class NewDateRanges
{
    public static ArrayList<LocalDate> startDateList = new ArrayList<LocalDate>();
    public static ArrayList<LocalDate> endDateList = new ArrayList<LocalDate>();
    public void calculatingDates(String tempSignUpDate, String tempCurrentDate)
    {
        String[] str_su = tempSignUpDate.split("-");
        int su_dd = Integer.parseInt(str_su[0]);
        int su_mm = Integer.parseInt(str_su[1]);
        int su_yy = Integer.parseInt(str_su[2]);

        String[] str_cur = tempCurrentDate.split("-");
        int cur_dd = Integer.parseInt(str_cur[0]);
        int cur_mm = Integer.parseInt(str_cur[1]);
        int cur_yy = Integer.parseInt(str_cur[2]);

        LocalDate startingDate = null;
        LocalDate endingDate = null;
        LocalDate currentDate = null;

        int k=0;
        if(su_mm == 12)
            k=-1;

        if(cur_yy-su_yy<=1)
        {
            startingDate = LocalDate.of(cur_yy+k,su_mm,su_dd).plusDays(-30);
            if(cur_yy == su_yy)
            {
                startDateList.add(startingDate);
                endDateList.add(startingDate);
            }
            else
            {
                LocalDate temp = LocalDate.of(2000,01,01);
                startingDate = LocalDate.of(cur_yy+k,su_mm,su_dd).plusDays(-30);
                currentDate = LocalDate.of(cur_yy,cur_mm,cur_dd);
                endingDate = LocalDate.of(cur_yy+k,su_mm,su_dd).plusDays(30);

                if(startingDate.compareTo(currentDate)>0)
                {
                    startDateList.add(temp);
                    endDateList.add(temp);
                }

                else if(currentDate.compareTo(endingDate)<0)
                {
                    endingDate = currentDate;
                    startDateList.add(startingDate);
                    endDateList.add(endingDate);
                }
                else
                {
                    startDateList.add(startingDate);
                    endDateList.add(endingDate);
                }
            }
        }
        else {
            startingDate = LocalDate.of(cur_yy+k, su_mm, su_dd).minusDays(30);
            endingDate = LocalDate.of(cur_yy+k, su_mm, su_dd).plusDays(30);
            currentDate = LocalDate.of(cur_yy, cur_mm, cur_dd);


            if (currentDate.compareTo(startingDate) > 0 && currentDate.compareTo(endingDate) < 0) {
                endingDate = currentDate;
            } else if (currentDate.compareTo(startingDate) < 0) {
                startingDate = LocalDate.of(cur_yy - 1, su_mm, su_dd).minusDays(30);
                endingDate = LocalDate.of(cur_yy - 1, su_mm, su_dd).plusDays(30);
            }
            startDateList.add(startingDate);
            endDateList.add(endingDate);
        }
    }
    public ArrayList<LocalDate> getStartDateList()
    {
        return startDateList;
    }
    public ArrayList<LocalDate> getEndDateList()
    {
        return endDateList;
    }
}
