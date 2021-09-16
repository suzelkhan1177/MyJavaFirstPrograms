import java.io.IOException;
import java.nio.file.CopyOption;
import java.io.File;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task3
{
    public static String readFileAsString(final String file1) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(file1, new String[0])));
        return data;
    }
    
    public static void main(final String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter tha Search Word");
         String s = sc.nextLine();
        System.out.println("Enter tha Directory Location");
         String path1 = sc.nextLine();
        System.out.println("Enter tha Copy Directory Location");
         String path2 = sc.nextLine();
        try {
             File file1 = new File(path1);
             File[] fileArray = file1.listFiles();
            File[] array;
            for (int length = (array = fileArray).length, i = 0; i < length; ++i) {
                 File file2 = array[i];
                 String data = readFileAsString(file2.getPath());
                if (data.contains(s)) {
                     File sorce = new File(file2.getPath());
                     File target = new File(String.valueOf(path2) + file2.getName());
                    Files.copy(sorce.toPath(), target.toPath(), new CopyOption[0]);
                }
            }
        }
        catch (IOException e) {
            System.out.println("File Is Alreadey this Location  " + e);
        }
        System.out.println("Thank you for Using Program");
    }
}
