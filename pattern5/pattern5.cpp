#include<iostream>
int main()
{
    int rows=0;
    std::cout<<"Enter rows : ";
    std::cin>>rows;

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<rows-i;j++)
        {
            std::cout<<"* ";
        }
        std::cout<<"\n";
    }
    return 0;
}