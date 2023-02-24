import java.util.Scanner;

public class Pattern3
{
    public static void main(String[] args) {
        Byte rows;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        rows=sc.nextByte();
        for(Byte i=1;i<=rows;i++)
        {
            for(Byte j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}