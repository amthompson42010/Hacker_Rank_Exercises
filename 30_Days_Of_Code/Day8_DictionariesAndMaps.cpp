#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>

using namespace std;

int main() {
	string names, queries;
	int n, numbers;
	cin>>n;
	map<string, int> phbook;

	while(n--)
	{
		cin>>names>>numbers;
		phbook[names] = numbers;
	}

	while(cin>>queries)
	{
		if(phbook.count(queries))
		{
			cout<<queries<<"="<<phbook[queries]<<endl;
		}
		else
		{
			cout<<"Not found"<<endl;
		}
	}

	return 0;
}
