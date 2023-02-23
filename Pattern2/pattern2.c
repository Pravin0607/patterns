#include<stdio.h>
int main()
{
    int rows=0;
    printf("Enter a Number of Rows : ");
    scanf("%d",&rows);
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=i;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
}