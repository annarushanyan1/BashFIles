#include <string>
#include <iostream>

using namespace std;

//colors
#define YELLOW "\033[33m"
#define WHITE "\033[37m"
#define BLUE "\033[34m"
#define RED "\033[31m"
#define GREEN "\033[32m"

#define ARRAYSIZE(array) (sizeof(array)/sizeof(array[0]))
const int QUESTIONS_NUMBER = 10;

class Helper  
{  
public:  
  Helper() {
    questionData();
    correctData();
    moneyData();
  };

  int earnedMoney;
  int contestant;
  string playerName;

  void printQuestion(int n) {
    for(int i = n * 5; i < n * 5 + 5; i++) {
      cout << BLUE << questions[i] << endl;
    }
  }

  void print5050(int n) {
    cout << "50:50 lifeline" << endl;
    string correctAnswer =correctAnswers[n];
    int index = getIndex(correctAnswer[0]);
    int random = index;
    while(random == index) {
      random = rand() % 4;
    }
    for (int i = n * 5; i < n * 5 + 5; i++)
    {
      if(i == n * 5 + index 
        || i == n * 5 + random
        || i == n * 5
        ) {
        cout << *(questions + i) << endl;
      }
    }
  }
  void getHelp() {
  cout <<YELLOW<< "Okay, "<<playerName<<",Here's the mechanics:"<< endl;
  cout << "There is 15 questions." << endl;
  sleep(1);
  cout << "Your answer must be A B C D. Or you can write <<50>> to get lifeline" << endl;
  sleep(1);
  cout << "You Lifeline of 50:50. The two right answers will remain." << endl;
  sleep(1);
  printEmptyLines();
  cout <<"If everything is okay, Please press Z to go to MENU"<< endl;
  char goToMenu;
  while(goToMenu != 'Z') {
    cin >> goToMenu;
  }
  printMenu();
  }
  void printMenu() {
    cout <<BLUE<< "$--------------------------Here is our Menu-------------------------$" << endl;
    cout << "Select the option you want to do:" << endl;
    sleep(1);
    cout << "A) Play" << "\nB) Help"<< "\nC) Exit"<< endl;
    char selectedOption;
    cin>>selectedOption;
    while(selectedOption != 'A' && selectedOption != 'B' && selectedOption != 'C') {
      cout << "Please select a valid option" << endl;
      cin>>selectedOption;
    }
    switch(selectedOption) {
    case 'A':
      play();
      break;
    case 'B':
      getHelp(); 
      break;
    case 'C':
      cout << "Thanks for playing!" << endl;
      exit( 0);
      break;
    }
  }
  void start() {
      cout<<YELLOW<<"$-------------------Who Wants To Be A Millionaire------------------$ "<<endl;
      printEmptyLines();
      sleep(1);
      string playerName;
      cout<<BLUE<<"What is your name?"<<endl;
      cin>>playerName;
      playerName = playerName;
      printEmptyLines();
      cout<<YELLOW<<"Hello, "<<playerName<<"! Welcome to our Game"<<endl;
      printEmptyLines();
      sleep(1);
      printMenu();
  }
  void play() {
    cout << GREEN << "Lets play" << endl;
    printEmptyLines();
    sleep(1);
    int questionNumber = 0;
    int playerCorrectAnswers = 0;
    string earnedMount;
    int count5050 = 2;
    while(questionNumber < QUESTIONS_NUMBER) {
      sleep(1);
      printQuestion(questionNumber);
      string correctAnswer = correctAnswers[questionNumber];
      cout << correctAnswer << "     This is the correct Answers"<<endl;
      string playerAnswer;
      sleep(1);
      cin >> playerAnswer;
      if(playerAnswer == "50") {
        if(count5050 == 0){
          cout << "You don't have any 50:50 lifeline left" << endl;
          cout << "Select one answer!" << endl;
          cin >> playerAnswer;
        }else {
        count5050--;
        printEmptyLines();
        print5050(questionNumber);
        cin >> playerAnswer;
        }
      }

      if(playerAnswer == correctAnswer) {
        cout << GREEN << "Correct!" << endl;
        playerCorrectAnswers++;
        string money =  moneyList[questionNumber];
        stringstream toInt(money);
        int earnedMoney;
        toInt >> earnedMoney;

        if(earnedMoney == 5000 
          || earnedMoney == 80000
          || earnedMoney == 1000000) {
          contestant = earnedMoney;
        }
        cout << "You have "<< earnedMoney << " $" << endl;
        questionNumber++;
      }else{
        cout << RED << "Wrong answer" << endl;
        gameOver(contestant);
        playerAnswer = correctAnswer;
      }
      printEmptyLines();
      }
      gameOver(contestant);
  }
    string questions[QUESTIONS_NUMBER*5];
     void questionData () {
      ifstream data;
      data.open("texts/questions.txt");
      if(data) {

        string line;
        for (int i = 0; i < QUESTIONS_NUMBER*5; i++)
        {
          getline(data , line);
          questions[i] = line;
        }
      }
    }
  string correctAnswers[QUESTIONS_NUMBER];
   void correctData () {
      ifstream correctData;
      correctData.open("texts/correctAnswers.txt");
      if(correctData) {
        string line;
        for (int i = 0; i < QUESTIONS_NUMBER; i++)
        {
          getline(correctData , line);
          correctAnswers[i] = line;
        }
      }
    }
    string moneyList[QUESTIONS_NUMBER];
    void moneyData () {
      ifstream moneyData;
      moneyData.open("texts/money.txt");
      if(moneyData) {
      string line;
      for (int i = 0; i < QUESTIONS_NUMBER; i++)
      {
        getline(moneyData , line);
        moneyList[i] = line;
      }
      }
    }
    bool hasData(){
        return ARRAYSIZE(questions)
        & ARRAYSIZE(correctAnswers)
        & ARRAYSIZE(moneyList);
    }
    void gameOver(int contestant) {
      cout << RED << "Game over!" << endl;
      cout << WHITE << "You earned " << contestant << endl;

      if(contestant == 1000000) {
        cout << GREEN << "You are a millionaire!" << endl;
      }
      exit(0);
    }
    void printEmptyLines() {
    cout<<"\n \n "<<endl;
    }
    int getIndex(char answer) {
    switch (answer)
    {
    case 'A':
      return 1;
      break;
    case 'B':
      return 2;
      break;
    case 'C':
      return 3;
      break;
    case 'D':
      return 4;
      break;
    default:
      return -1;
      break;
    }
  }
};