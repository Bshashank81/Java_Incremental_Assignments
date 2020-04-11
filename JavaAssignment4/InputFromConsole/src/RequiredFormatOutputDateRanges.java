import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RequiredFormatOutputDateRanges {
    public ArrayList<String> formattedStartDateList;
    public ArrayList<String> formattedEndDateList;

    public ArrayList<LocalDate> startDateList;
    public ArrayList<LocalDate> endDateList;

    public RequiredFormatOutputDateRanges() {
        formattedStartDateList = new ArrayList<String>();
        formattedEndDateList = new ArrayList<String>();

        ThirtyDaysWindow thirtyDaysWindow = new ThirtyDaysWindow();
        thirtyDaysWindow.callingCalculateRangeDates();
        startDateList = thirtyDaysWindow.getStartDateList();
        endDateList = thirtyDaysWindow.getEndDateList();
    }

    public void printOutputInDesiredFormat() {
        String formattedStartDate;
        String formattedEndDate;
        for (int i = 0; i < startDateList.size(); i++) {
            LocalDate startDate = startDateList.get(i);
            LocalDate endDate = endDateList.get(i);
            //No range is indicated by assuming same dates for start_date and end_date
            if (startDate.compareTo(endDate) == 0) {
                formattedStartDateList.add("No");
                formattedEndDateList.add("Range");
            } else {
                formattedStartDate = startDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                formattedEndDate = endDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                formattedStartDateList.add(formattedStartDate);
                formattedEndDateList.add(formattedEndDate);
            }
        }
    }

    public ArrayList<String> getFormattedStartDateList() {
        return formattedStartDateList;
    }

    public ArrayList<String> getFormattedEndDateList() {
        return formattedEndDateList;
    }
}