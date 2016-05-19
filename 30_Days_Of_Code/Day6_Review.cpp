#include <iostream>
#include <string>

int main() {

	int tests;
	std::cin >> tests;

	std::string test_string[tests];
	int i = 0;
	int n = tests;

	while(n--)
	{
		std::cin >> test_string[i];
		++i;
	}

	for(int i = 0; i < tests; ++i)
	{
		for(int j = 0; j < test_string[i].size(); j+=2)
		{
			std::cout << test_string[i][j];
		}

		std::cout << " ";

		for(int j = 1; j < test_string[i].size(); j += 2)
		{
			std::cout << test_string[i][j];
		}

		std::cout << std::endl;
	}

	return 0;
}
