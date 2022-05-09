#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <iomanip>
#include <typeinfo>
#include <sstream>
#include <unistd.h>
#include "helpers.h"

// colors
#define YELLOW "\033[33m"
#define BLUE "\033[34m"
#define RED "\033[31m"
#define GREEN "\033[32m"

using namespace std;

int main () {
  Helper helper;
  if(helper.hasData()) {
    helper.start();
  }else {
    cout << "No data found" << endl;
    return 1;
  }
  return 0;
}

