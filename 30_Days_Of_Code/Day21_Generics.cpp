#include <iostream>
#include <vector>

using namespace std;

template <class T>
void printArray(vector<T> ar)
    {
        for(auto itr=ar.begin();itr!=ar.end();itr++)
            {
                cout<<*itr<<endl;   
            }
    }
