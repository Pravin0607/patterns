#include<iostream>
int main()
{
    int rows=0;
    std::cout<<"Enter rows : "<<std::endl;
    std::cin>>rows;

    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=i;j++)
        {
            std::cout<<i<<" ";
        }
        std::cout<<"\n";
    }
    return 0;
}