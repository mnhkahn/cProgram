#include <iostream>
#include <string>
using namespace std;

// 4
int four(int a, int b) {
	int c = a+++b;
	cout << "a: " << a << " b: " << b << endl;
	return c;
}

// 5
int five(string c) {
	return c.size();
}

// 6
int six(int a, int b) {
	return a ++ % ++b;
}

// 7
int seven() {
	return (1 % 3) + (5 | 3);
}

// 8
int eight(char* s, char* e) {
	return s - e;
}

// 12
short convertRGB2ARGB(short RGB, char alpha) {
	short ARGB = 44970;

	short A = alpha & 15;
	short R = (RGB >> 11) & 31;
	short G = (RGB >> 6) & 31;
	short B = RGB & 63;
	cout << A << " " << R << " " << G << " " << B << endl;

//	ARGB = (A << 12) + (R << 8) + (G << 4) + B;
	return ARGB;
}

int main() {
	cout << "4: " << four(5, 7) << endl;	

	cout << "5: " << five("\\0211\"xab") << endl;

	cout << "6: " << six(8, 4) << endl;

	cout << "7: " << seven() << endl;

	char a[6][8];
	cout << "8: " << eight(&a[4][6], a[2]) << endl;
	
	short RGB = 31370; // 0111101010001010
	char alpha = 10; // 00001010

	// 1010111110101010 44970
	cout << "12: " << (unsigned short)convertRGB2ARGB(RGB, alpha) << endl;

	return 0;
}