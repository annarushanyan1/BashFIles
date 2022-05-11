#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <iomanip>
#include <typeinfo>
#include <sstream>
#include <unistd.h>

// colors
#define YELLOW "\033[33m"
#define BLUE "\033[34m"
#define RED "\033[31m"
#define GREEN "\033[32m"
#define WHITE "\033[37m"

using namespace std;
const int QUESTIONS_NUMBER = 10;
#define ARRAYSIZE(array) (sizeof(array) / sizeof(array[0]))

string * questionData(string path);
string * correctData(string path);
string playerName;

struct Question
{
    string question;
    string correctAnswer;
};

Question * allData(string questionPath, string answersPath);
void start(Question * questions);

int main()
{
  Question * questions = allData("texts/questions.txt", "texts/correctAnswers.txt");
  if(questions == NULL) {
    cout << "Error: questions or correctAnswers is NULL" << endl;
    return 1;
  }
  start(questions);
  return 0;
}

// functions
void play(Question * questions);
void Menu(Question * questions);
void getHelp(Question * questions);
void gameOver(int contestant);
void print5050(int n, string * questions);
int moneyList[] = {100, 1000, 5000, 10000, 20000, 40000, 80000, 200000, 500000, 1000000};


Question * allData(string questionPath, string answersPath) {
  Question * questions = nullptr;
  questions = new Question[10];
  string * questionsData = questionData(questionPath);
  string * correctAnswers = correctData(answersPath);
  for(int i = 0; i < QUESTIONS_NUMBER; i++) {
    questions[i].question = questionsData[i];
    questions[i].correctAnswer = correctAnswers[i];
  }
  return questions;
}

string * questionData(string path)
{
  string * questions = new string[QUESTIONS_NUMBER];
  ifstream data;
  string * correctAnswers = new string[QUESTIONS_NUMBER];
  ifstream correctdata;
  data.open(path);
  if (data)
  {
    string line;
    for (int i = 0; i < QUESTIONS_NUMBER; i++)
    {
      getline(data, line, '&');
      questions[i] = line;
    }
  }
  data.close();
  return questions;
}

string * correctData(string path)
{
  string * correctAnswers = new string[QUESTIONS_NUMBER];
  ifstream data;
  data.open(path);
  if (data)
  {
    string line;
    for (int i = 0; i < QUESTIONS_NUMBER; i++)
    {
      getline(data, line);
      correctAnswers[i] = line;
    }
  }
  data.close();
  return correctAnswers;
}

void start(Question * questions)
{
  cout << YELLOW << "$-------------------Who Wants To Be A Millionaire------------------$ \n \n" << endl;
  sleep(1);
  cout << BLUE << "What is your name? \n \n" << endl;
  cin >> playerName;
  cout << YELLOW << "Hello, " << playerName << "! Welcome to our Game \n \n" << endl;
  Menu(questions);
}

void Menu(Question * questions)
{
cout << BLUE << "$--------------------------Here is our Menu-------------------------$" << endl;
cout << "Select the option you want to do: \n A) Play \nB) Help \nC) Exit" << endl;
char selectedOption;
cin >> selectedOption;
while (selectedOption != 'A' && selectedOption != 'B' && selectedOption != 'C')
{
  cout << "Please select a valid option" << endl;
  cin >> selectedOption;
}
switch (selectedOption)
{
case 'A':
  play(questions);
  break;
case 'B':
  getHelp(questions);
  break;
case 'C':
  cout << "Thanks for playing!" << endl;
  exit(0);
  break;
}
}

void play(Question * questions)
{
  cout << GREEN << "Lets play \n \n" << endl;
  sleep(1);
  int number = 0;
  int contestant = 0;
  string earnedMount;
  int count5050 = 2;
  while (number < QUESTIONS_NUMBER)
  {
    sleep(1);
    cout << BLUE << "Question " << number + 1 << ": \n" << questions[number].question << endl;
    string correctAnswer = questions[number].correctAnswer;
    string playerAnswer;
    sleep(1);
    cin >> playerAnswer;
    if (playerAnswer == "50")
    {
      if (count5050 == 0)
      {
        cout << "You don't have any 50:50 lifeline left" << endl;
        cout << "Select one answer! \n" << endl;
        cin >> playerAnswer;
      }
      else
      {
        count5050--;
        // print5050(number);
        cin >> playerAnswer;
      }
    }

    if (playerAnswer == correctAnswer)
    {
      cout << GREEN << "Correct!" << endl;
      int money = moneyList[number];
      if (money == 5000 || money == 80000 || money == 1000000)
      {
        contestant = money;
      }
      cout << "You have " << money << " $ \n" << endl;
      number++;
    }
    else
    {
      cout << RED << "Wrong answer \n" << endl;
      gameOver(contestant);
      playerAnswer = correctAnswer;
    }
  }
  gameOver(contestant);
}
void gameOver(int contestant) {
  cout << RED << "Game over!" << endl;
  cout << WHITE << "You earned " << contestant << endl;

  if(contestant == 1000000) {
    cout << GREEN << "You are a millionaire!" << endl;
  }
  exit(0);
}

void print5050(int n, string * questions) {

}

void getHelp(Question * questions) {
  cout <<YELLOW<< "Okay, "<<playerName<<",Here's the mechanics:"<< endl;
  cout << "There is 15 questions." << endl;
  sleep(1);
  cout << "Your answer must be A B C D. Or you can write <<50>> to get lifeline" << endl;
  sleep(1);
  cout << "You Lifeline of 50:50. The two right answers will remain. \n \n" << endl;
  sleep(1);
  cout <<"If everything is okay, Please press Z to go to MENU"<< endl;
  char goToMenu;
  while(goToMenu != 'Z') {
    cin >> goToMenu;
  }
  Menu(questions);
}
