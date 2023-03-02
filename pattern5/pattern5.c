#include<stdio.h>
int main()
{
    int rows=0;
    printf("Enter rows : ");
    scanf("%d",&rows);

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<rows-i;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}