#include <iostream>
using namespace std;

char* reverse_str(char* str) {
	char* h = str;
	char* t = str;
	while (*t++);
	t--;
	t--;
	
	while (h < t) {
		*h ^= *t;
		*t ^= *h;
		*h ^= *t;
		
		h++;
		t--;
	}
		
	return str;
}

int main() {
	char str[13] = {'h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '\0'};
	char str1[1] = {'\0'};
	char str2[0];
	
	cout << reverse_str(str) << endl;
	cout << reverse_str(str1) << endl;
	cout << reverse_str(str2) << endl;
	return 0;
}