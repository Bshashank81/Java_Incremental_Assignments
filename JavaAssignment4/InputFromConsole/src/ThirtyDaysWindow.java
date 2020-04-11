import java.time.LocalDate;
import java.util.ArrayList;

public class ThirtyDaysWindow {

    public ArrayList<String> signUpDate;
    public ArrayList<String> currDate;

    public ArrayList<LocalDate> startDateList;
    public ArrayList<LocalDate> endDateList;

    public ThirtyDaysWindow() {
        InputDates inputDates = new InputDates();
        inputDates.inputDatesFromConsole();
        signUpDate = inputDates.getSignUpDate();
        currDate = inputDates.getCurrDate();

        startDateList = new ArrayList<LocalDate>();
        endDateList = new ArrayList<LocalDate>();
    }

    public void callingCalculateRangeDates() {
        for (int i = 0; i < signUpDate.size(); i++) {
            calculatingRangeDates(signUpDate.get(i), currDate.get(i));
        }
    }

    public void calculatingRangeDates(String tempSignUpDate, String tempCurrentDate) {

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

        startingDate = LocalDate.of(cur_yy, su_mm, su_dd).minusDays(30);
        endingDate = LocalDate.of(cur_yy, su_mm, su_dd).plusDays(30);
        currentDate = LocalDate.of(cur_yy, cur_mm, cur_dd);

        /**
         * If the current year is same as the signUp year then the result have to be "No Range"
         * Else if the current year should be in the 30 days window => adjust the end date of the window
         * Else if the current year should be less than the 30 days window => window has to be previous year window of the current  year
         * Else if the current year should be greater than the end date of the 30 days window => back date to the 30 days window
         */
        if ((cur_yy - su_yy) < 1) {
            startDateList.add(startingDate);
            endDateList.add(startingDate);
        } else {
            if (currentDate.compareTo(startingDate) >= 0 && (currentDate.compareTo(endingDate) <= 0)) {
                startingDate = startingDate;
                endingDate = currentDate;
                startDateList.add(startingDate);
                endDateList.add(endingDate);
            } else if (currentDate.compareTo(startingDate) < 0) {
                startingDate = startingDate.minusMonths(12);
                endingDate = endingDate.minusMonths(12);
                int startDateYear = startingDate.getYear();

                if (startDateYear == su_yy) {
                    startDateList.add(startingDate);
                    endDateList.add(startingDate);
                } else {
                    startDateList.add(startingDate);
                    endDateList.add(endingDate);
                }
            } else {
                startDateList.add(startingDate);
                endDateList.add(endingDate);
            }
        }
    }

    public ArrayList<LocalDate> getStartDateList() {
        return startDateList;
    }

    public ArrayList<LocalDate> getEndDateList() {
        return endDateList;
    }
}
