//
//  Ex1-multiTable.cpp
//  IMlearning
//
//  Created by Anna Arushanyan on 26.04.22.
//
#include <iostream>

void ChristmasTree(int length, std::string position);

int main(int argv, char* argc[]) {
    ChristmesTree(10, "left");
    ChristmesTree(10, "right");
    ChristmasTree(30, "both");
    return 0;
}

void ChristmasTree(int length, std::string position) {
    std::string points = "*";
    int tabs = length - 1;
    if(position == "left") {
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < tabs; j++) {
                std::cout << " ";
            }
            std::cout << points << std::endl;
            points+="*";
            tabs--;
        }
    }else if (position == "right") {
        for (int i = 0; i < length; i++) {
            std::cout << points << std::endl;
            points+="*";
        }
    }else if (position == "both") {
        for(int i = 0; i < length; i++) {
            for (int j = 0; j < tabs; j++) {
                std::cout << " ";
            }
            std::cout << points << std::endl;
            points+="**";
            tabs--;
        }
    }else {
        std::cout << "Wrong position" << std::endl;
    }
    std::cout << " " << std::endl;
    
}
