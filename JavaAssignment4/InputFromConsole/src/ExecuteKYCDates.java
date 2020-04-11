import java.util.ArrayList;

public class ExecuteKYCDates {
    public static void main(String[] args) {
        RequiredFormatOutputDateRanges requiredFormatOutputDateRanges =
                new RequiredFormatOutputDateRanges();

        requiredFormatOutputDateRanges.printOutputInDesiredFormat();

        ArrayList<String> formattedStartDateList =
                requiredFormatOutputDateRanges.getFormattedStartDateList();
        ArrayList<String> formattedEndDateList =
                requiredFormatOutputDateRanges.getFormattedEndDateList();

        for (int i = 0; i < formattedStartDateList.size(); i++) {
            System.out.println(formattedStartDateList.get(i) + " " + formattedEndDateList.get(i));
        }
    }
}
