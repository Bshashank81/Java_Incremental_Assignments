import java.io.*;
import java.util.ArrayList;

public class InputDate {
    public ArrayList<String> signUpDate = new ArrayList<String>();
    public ArrayList<String> currDate = new ArrayList<String>();
    int numberOfInputs;

    String fileName;

    public InputDate(String fileName) {
        this.fileName = fileName;
    }

    public void input() throws IOException {
        String line = null;
        int linenumber = 1;

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        while ((line = reader.readLine()) != null) {
            if (linenumber == 1) {
                numberOfInputs = Integer.parseInt(line);
                linenumber++;
                continue;
            } else {
                String input = line;
                String arrayInput[] = input.split(" ");
                signUpDate.add(arrayInput[0]);
                currDate.add(arrayInput[1]);
            }
        }
    }

    public int getNumberOfInputs() {
        return numberOfInputs;
    }

    public ArrayList<String> getSignUpDate() {
        return signUpDate;
    }

    public ArrayList<String> getCurrDate() {
        return currDate;
    }
}

