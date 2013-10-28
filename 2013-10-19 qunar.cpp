#include<iostream>
using namespace std;

void main()
{

	short x = 0x1234;
	char* arr;
	arr = reinterpret_cast<char*>(&x);

	cout << hex << static_cast<short>(arr[0]) << static_cast<short>(arr[1]) << endl;

	char y = x;
	cout << "0x" << hex << (short)y << endl;

	union endian {
		int i;
		float f;
		char s;
	};

	endian e;
	e.i = 1;
	cout << static_cast<int>(e.s) << endl;
}