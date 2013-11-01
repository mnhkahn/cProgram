#include <iostream>
#include <string>
using namespace std;

void reference() {
	int a = 1;
	int& b = a;
	cout << &a << endl;
	cout << &b << endl; // same address
}

struct Shape {
	int id;

	Shape() {
		cout << "Constructor of Shape" << endl;
	}

	~Shape() {
		cout << "Destructor of Shape" << endl;
	}
};

struct Circle : Shape {

	Circle() {
		cout << "Constructor of Circle" << endl;
	}

	~Circle() {
		cout << "Destructor of Circle" << endl;
	}
};

int max(int a, int b) {
	return a > b ? a : b;
}

string multiply(string a, string b) {
	// Sign
	char sign, sign1, sign2;
	if (a[0] == '-' || a[0] == '+')
	{
		sign1 = a[0];
		a = a.substr(1, a.size());
	}
	if (b[0] == '-' || b[0] == '+') {
		sign2 = b[0];
		b = b.substr(1, b.size());
	}
	if (sign1 == sign2)
		sign = '+';
	else
		sign = '-';
	
	//
	string* results = new string[b.size()];
	string result(a.size() + b.size(), '0');
	
	int i, j, k;
	for (i = 0; i < b.size(); i++)
	{
		short offset = 0;
		for (j = 0; j < a.size(); j++)
		{
			short temp = static_cast<short>(a[a.size() - j - 1] - '0') * static_cast<short>(b[b.size() - i - 1] - '0');
			results[i].insert(0, 1, static_cast<char>(temp % 10 + '0' + offset));
			offset = static_cast<short>(temp / 10);
		}
		if (offset)
		{
			results[i].insert(0, 1, static_cast<char>(offset + '0'));
		}

		cout << results[i] << endl;
	}

	for (i = 0; i < b.size(); i++)
	{
		short offset = 0;
		for (j = results[i].size() - 1; j >= 0; j--)
		{
			short temp = static_cast<short>(result[result.size() - i - results[i].size() + j] - '0') + static_cast<short>(results[i][j] - '0');
			result[result.size() - i - results[i].size() + j] = static_cast<char>(temp % 10 + '0' + offset);
			offset = static_cast<short>(temp / 10);
			cout << result << " index:" << result.size() - i - results[i].size() + j << " b:" << results[i][j] << " temp:" << temp << endl;
		}
		if (offset)
		{
			cout << "offset: " << offset << endl;
			result[result.size() - i - results[i].size() + j] = static_cast<char>(offset + '0');
		}
	}


	// Remove zeros
	j = 0;
	for (i = 0; result[i] == '0' && i < result.size(); i++)
	{
		j++;
	}
	result = result.substr(j, result.size());

	// Add sign
	if (sign == '-')
	{
		result.insert(0, 1, sign);
	}
	
	return result;
}

int main() {
	reference();

	Circle* circle = new Circle();
	delete circle;

//	string a = "3";
//	string b = "6";
//	string a = "4567";
//	string b = "1234";
//	string a = "111111111111111111111111111111111111111111111111111111111111111111";
//	string b = "11";
	string a = "12";
	string b = "-11";
	cout << multiply(a, b) << endl;

	return 0;
}