#include <iostream>

#include "data_structure.hpp"

using namespace std;

int main(int argc, char *argv[]) {
  cout<<"Ss"<< endl;

  auto *graph= new itis::Graph(6);

  cout<<"Ss"<< endl;

  graph->addEdge(5,2);

  cout<<"Ss"<< endl;

  graph->addEdge(5,0);
  cout<<"Ss"<< endl;
  graph->addEdge(4,0);
  cout<<"Ss"<< endl;
  graph->addEdge(4,1);
  cout<<"Ss"<< endl;
  graph->addEdge(3,1);
  cout<<"Ss"<< endl;
  graph->addEdge(2,3);
  cout<<"Ss"<< endl;


  graph->topologicalSort();

  return 0 ;
}


