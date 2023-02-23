import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Byte rows;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows=sc.nextByte();
        for(Byte i=1;i<=rows;i++)
        {
            for(Byte j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
