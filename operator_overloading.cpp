#include <iostream>
 
using namespace std;
 
class Distance {
public:
    
    int feet, inch;
    
    Distance()
    {
        this->feet = 0;
        this->inch = 0;
    }
 
    Distance(int f, int i)
    {
        this->feet = f;
        this->inch = i;
    }
 
    // Overloading (+) operator to perform addition of
    // two distance object
    Distance operator+(Distance& d2)
    {
        Distance d3;
 
        // Perform addition of feet and inches
        d3.feet = this->feet + d2.feet;
        d3.inch = this->inch + d2.inch;

        return d3;
    }
};

int main()
{
    cout<<"\nProgram Name: - Write a Program in C++ Language to implement Operator Overloading(friend function).";
    cout<<"\nName : - Sarthak Mishra ";
    cout<<"\n--------------------------------------------------------------------\n";

    Distance d1(8, 9);
    Distance d2(10, 2);

    Distance d3;
    d3 = d1 + d2;

    cout << "\nTotal Hight(Feet'Inches) = " << d3.feet << "'" << d3.inch<<endl;
    return 0;
}