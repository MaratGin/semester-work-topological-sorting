#include <iostream>
#include "data_structure.hpp"
#include <ctime>
#include <chrono>
#include <fstream>
#include "iostream"
#include <string>
#include <algorithm>
#include <sstream>
#include "vector"



  using namespace std;


  vector<int> split(const string& s, char delimiter) {
    vector<int> tokens;
    string token;
    istringstream tokenStream(s);
    while (getline(tokenStream, token, delimiter)) {
      tokens.push_back(stoi(token));
    }
    return tokens;
  }


  int main() {

    //
    ////ИЗМЕНИТЬ ПУТЬ К НАБОРАМ ДАННЫХ
    //
    //
    //
    //
    string path = "C:\\Repos\\semester-work-topological-sortingg\\dataset\\01.csv";
    //
    ////ИЗМЕНИТЬ ПУТЬ К НАБОРАМ ДАННЫХ
    //
    //
    //
    //

    ifstream fin;
    fin.open(path);

    string line;
    vector<int> intValues;
    if (!fin.is_open()) {
      cout << "Error" << endl;

    } else {
      cout << "Success" << endl;

      ////заполнение массива чисел значениями из .csv файла
      while (getline(fin, line)) {

        intValues = split(line, ',');
      }

      auto *graph= new itis::Graph(40);

      int matrix [graph->_numberOfVertex];
      int k=0;

      for (int j = 0; j <graph->_numberOfVertex ; ++j) {

        for (int i = 0; i < graph->_numberOfVertex; ++i) {
          matrix[i] = intValues[k];
          k++;
        }


        for (int i = 0; i<graph->_numberOfVertex ; ++i) {
          if (matrix[i]==1){
            graph->addEdge(j,i);
          }


        }

      }


      /// НАЧАЛО ЗАМЕРА ВРЕМЕНИ
      const auto time_point_before = std::chrono::steady_clock::now();

      cout<<"I am here"<<endl;
      graph->topologicalSort();
      cout<<"I am here"<<endl;
      const auto time_point_after = std::chrono::steady_clock::now();
      ////КОНЕЦ ЗАМЕРА ВРЕМЕНИ


      const auto time_diff = time_point_after - time_point_before;


      const  long long time_elapsed_ns = chrono::duration_cast<chrono::nanoseconds>(time_diff).count();


      cout << "Time elapsed (ns): " << time_elapsed_ns << '\n';

    }

    fin.close();
    return 0;
    }
