import java.text.ParseException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.CopyOption;
import java.util.Date;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Task2
{
    public static void main(final String[] args) throws ParseException, IOException {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter tha date First : Format yyyy-mm-dd");
         String d1 = sc.nextLine();
        System.out.println("Enter tha date second : Format yyyy-mm-dd");
          String d2 = sc.nextLine();
        System.out.println("Enter tha Directory Location");
         String path1 = sc.nextLine();
        System.out.println("Enter tha Copy Directory Location");
         String path2 = sc.nextLine();
        sc.close();
         Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d1);
         Date  date2 = new SimpleDateFormat("yyyy-MM-dd").parse(d2);
        try {
             File file1 = new File(path1);
             File[] fa = file1.listFiles();
            File[] array;
            for (int length = (array = fa).length, i = 0; i < length; ++i) {
                 File file2 = array[i];
                if (file2.isFile()) {
                     long fileDate = file2.lastModified();
                     Date Searchdate = new Date(fileDate);
                    System.out.println(Searchdate);
                    if (Searchdate.equals(date1) || (Searchdate.after(date1) && Searchdate.equals(date2)) || Searchdate.after(date1)) {
                        System.out.println("Suzel");
                    }
                     File sorce = new File(file2.getPath());
                     File target = new File(String.valueOf(path2) + file2.getName());
                    Files.copy(sorce.toPath(), target.toPath(), new CopyOption[0]);
                }
                System.out.println(file2.getPath());
            }
        }
        catch (IOException e) {
            System.out.println("File Is Alreadey this Location  " + e);
        }
        System.out.println("Thank you for Using Program");
    }
}
