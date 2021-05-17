#include "data_structure.hpp"
#include <iostream>
#include <stack>

// файл с определениями

namespace itis {

  // здесь должны быть определения методов вашей структуры

  void Graph::addEdge(int v, int w) {
    adj_m[v].push_back(w);
  }

  Graph::Graph(int numberOfVertex) {
    this->_numberOfVertex = numberOfVertex;
    adj_m = new list<int>[numberOfVertex];
  }

  Graph::~Graph() {}



  void Graph::topologicalSort() {

    // vector<int>answer;
    stack<int> Stack;

    bool *visited = new bool [_numberOfVertex];

    for( int i = 0; i < _numberOfVertex; i++){
      visited[i] = false;
    }

    for (int i = 0; i < _numberOfVertex; i++){
      if (!visited[i])
        depthFirstSearch(i, visited, Stack);
    }

    while (!Stack.empty()){

      cout << Stack.top() << " "<< endl;
      Stack.pop();
    }

  }
  void Graph::depthFirstSearch(int v, bool *visited, stack<int> &Stack) {

    visited[v] = true;

    list<int>::iterator i;
    for (i = adj_m[v].begin(); i != adj_m[v].end(); ++i)
      if (!visited[*i])
        depthFirstSearch(*i, visited, Stack);
//    for (_List_iterator<int> i =adj_m->begin() ; i !=adj_m->end(); ++i) {
//      if (!visited[*i]){
//        depthFirstSearch(*i,visited,Stack);
//      }
    //}

    Stack.push(v);

  }


}