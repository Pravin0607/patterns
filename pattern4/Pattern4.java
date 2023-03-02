import java.util.*;
public class Pattern4{
    public static void main(String[] args) {
        Byte rows=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        rows=sc.nextByte();

        for(Byte i=1;i<=rows;i++)
        {
            for(Byte j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();        
    }
}