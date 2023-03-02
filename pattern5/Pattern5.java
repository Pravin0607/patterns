import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        Byte rows=0;
        Scanner sc=new Scanner(System.in);
        rows=sc.nextByte();
        for(Byte i=0;i<rows;i++)
        {
            for(Byte j=0;j<rows-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }    
}
