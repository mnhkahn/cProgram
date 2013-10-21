#include <iostream>
#include <string>
using namespace std;

// 4
char firstSingle(char * str) {
	const int table_size = 256;
	int hast_table[table_size] = {0};

	char* p = str;
	while (*p != '\0') {
		hast_table[*p]++;
		p++;
	}

	int i;
	for (i = 0; i < table_size; i++)
	{
		if (hast_table[i] == 1)
			return char(i);
	}

	return '\0';
}

// 5
char* reverse(char* str, int s, int e) {
	char *h, *t;

	h = str + s;
	t = str + s;

	int i;
	for (i = 0; i < e - s; i++)
	{
		t++;
	}

	while (h < t) {
		*h = *h ^ *t;
		*t = *h ^ *t;
		*h = *h++ ^ *t--;
	}

	return str;
}

void rightShift(char* str, int K, int N) {
	K = K % N;

	reverse(str, 0, N - K - 1);
	reverse(str, N - K, N - 1);
	reverse(str, 0, N - 1);
}

int main() {
	char str[] = "abaccdeff";
	cout << firstSingle(str) << endl;

	char str1[] = "abcd1234";
	rightShift(str1, 12, 8);
	cout << str1 << endl;
	return 0;
}