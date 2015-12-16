//#include <stdafx.h> // Visual Studio users need to uncomment this line
#include <iostream> // for std::cout and std::endl
 
// Definition of function doPrint()
void doPrint()
{
    std::cout << "In doPrint()" << std::endl;
}
 
// Definition of function main()
int main()
{
    std::cout << "Starting main()" << std::endl;
    doPrint(); // Interrupt main() by making a function call to doPrint()
    std::cout << "Ending main()" << std::endl;
    return 0;
}
