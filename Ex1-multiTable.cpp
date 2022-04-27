//
//  Ex1-multiTable.cpp
//  IMlearning
//
//  Created by Anna Arushanyan on 26.04.22.
//
#include <iostream>

int MultiTable(int number) {
    if(number <= 0) {
        std::cout << "Number must be greater than 0" << std::endl;
        return 1;
    }
    for (int i = 1; i <= 10; i++) {
        std::cout << i << " * " << number << " = " << i * number << std::endl;
    }
    return 0;
}

int main(int args, char* argc[]) {
    int number;
    std::cout << "Enter the number: ";
//    std::sin >> number;
    while(true)
    MultiTable(9);
}
