#pragma once
#include <list>
using namespace std;
#include <vector>
#include <stack>
// Заголовочный файл с объявлением структуры данных

namespace itis {

  // Tip 1: объявите здесь необходимые структуры, функции, константы и прочее

  // Пример: объявление структуры с полями и методами
  struct Graph {
   public:

    int _numberOfVertex;

    list<int> *adj_m;

    void depthFirstSearch(int v,bool visited[], stack<int> &Stack);

    explicit Graph(int numberOfVertex);

    void addEdge(int v,int w);

    void topologicalSort();

    ~Graph();


  };

}  // namespace itis