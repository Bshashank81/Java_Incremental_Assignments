import java.io.File;
import java.util.Scanner;

public class FilePath
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the user name");
        String username = sc.next();

        String filename = "";
        System.out.println("Enter a pattern: ");
        filename = sc.next();

        PatternMatcher pM = new PatternMatcher();
        while(!filename .equals("quit"))
        {
            File file = new File("/home"+"/"+username);
            File[] allFiles = file.listFiles();

            pM.searchFiles(allFiles, filename);
            System.out.println("If you want to stop searching file pattern, enter \"quit\" or \nEnter another file name");
            filename = sc.next();
        }
    }
}