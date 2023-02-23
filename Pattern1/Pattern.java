import java.util.*;
class Pattern{
    public static void main(String[] args) {
        Byte rows;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number of Rows : ");
        rows=sc.nextByte();
        for(Byte i=1;i<=rows;i++)
        {
            for(Byte j=1;j<=rows;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        } 
        sc.close();       
    }
}