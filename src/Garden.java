import java.sql.SQLOutput;
import java.util.Scanner;

public class Garden {
    public static void main(String[] args)
    {
        System.out.println(" Welcome to Dora's Garden");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter -> No of Rows and Columns and finally the Tree number");
        int rowsInGarden = scan.nextInt();
        int columnsInGarden = scan.nextInt();
        int treeNumber = scan.nextInt();

        System.out.println(mangoChecker(rowsInGarden,columnsInGarden,treeNumber));

    }

    private static String mangoChecker(int rowsInGarden, int columnsInGarden, int treeNumber)
    {
        if(treeNumber >=1 && treeNumber <= columnsInGarden)
            return "yes";
        else if (treeNumber <= rowsInGarden*columnsInGarden && (treeNumber >= columnsInGarden*(rowsInGarden-1)+1))
                return "yes";
        else if(treeNumber%columnsInGarden==1)
               return "yes";
        else return "no";
    }
}