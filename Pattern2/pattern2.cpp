#include<iostream>
int main()
{
    int rows=0;
    std::cout<<"Enter a Number of Rows : ";
    std::cin>>rows;
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=i;j++)
        {
            std::cout<<"* ";
        }
        std::cout<<std::endl;
    }
}