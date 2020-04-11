import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestOutput {

    RequiredFormatOutputDate range1;
    RequiredFormatOutputDate range2;
    ArrayList<String> startDateInRange;
    ArrayList<String> endDateInRange;

    @Before
    public void setupRequiredFormatOutputDate() {
        range1 = new RequiredFormatOutputDate("inputFiles/input1.txt");
        range2 = new RequiredFormatOutputDate("inputFiles/input2.txt");

        range1.printOutputInDesiredFormat();
        range2.printOutputInDesiredFormat();
    }

    @Test
    public void testOutputRange() {
        startDateInRange = range1.getFormattedStartDateList();
        endDateInRange = range1.getFormattedEndDateList();

        assertEquals("Wrong Answer for input1 - range1", "16-06-2017 27-06-2017", startDateInRange.get(0) + " " + endDateInRange.get(0));
        assertEquals("Wrong Answer for input2 - range1", "05-01-2017 06-03-2017", startDateInRange.get(1) + " " + endDateInRange.get(1));
        assertEquals("Wrong Answer for input3 - range1", "No Range", startDateInRange.get(2) + " " + endDateInRange.get(2));
        assertEquals("Wrong Answer for input4 - range1", "05-03-2016 04-04-2016", startDateInRange.get(3) + " " + endDateInRange.get(3));
        assertEquals("Wrong Answer for input5 - range1", "05-03-2016 15-03-2016", startDateInRange.get(4) + " " + endDateInRange.get(4));

        startDateInRange = range2.getFormattedStartDateList();
        endDateInRange = range2.getFormattedEndDateList();
        assertEquals("Wrong answer for input1 - range2", "16-11-2002 15-01-2003", startDateInRange.get(0) + " " + endDateInRange.get(0));
        assertEquals("Wrong Answer for input2 - range2", "13-12-2009 30-01-2010", startDateInRange.get(1) + " " + endDateInRange.get(1));
        assertEquals("Wrong Answer for input3 - range2", "15-04-2006 13-05-2006", startDateInRange.get(2) + " " + endDateInRange.get(2));
        assertEquals("Wrong Answer for input4 - range2", "24-10-2017 23-12-2017", startDateInRange.get(3) + " " + endDateInRange.get(3));
        assertEquals("Wrong Answer for input5 - range2", "No Range", startDateInRange.get(4) + " " + endDateInRange.get(4));

    }
}
