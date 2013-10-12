#include <iostream>
using namespace std;

char* rm_bracket(char* str) {
	char bracket[5];
	
	char* p = str;
	char* q = str;
	int top = -1;
	while (*p && *p != '\0') {
		
		// if p points to the first char or last char or it's a number
		if ((p == str && *p == '(') || (!(*(p + 1)) && *p == ')') || (*p >= '0' && *p <= '9') || *p == ',') {
			*q++ = *p;
		}
		else if (*p == ')' || *p == '(') {
			// check brackets
			if (top >= 0 && bracket[top] == '(' && *p == ')') {
				top--;
			}
			else {
				bracket[++top] = *p;
			}
		}
		// invalid character
		else {
			cout << "input error: " << *p << endl;
			break;
		}
		p++;
	}
	if (top != -1) {
		cout << top << endl;
		cout << bracket << endl;
		cout << "error with brackets: " << endl;
	}
	*(q++) = '\0';
	return str;
}

int main() {
	char str[] = {'(', '1', ',', '(', '2', ',', '3', ')', ',', '(', '4', ',', '(', '5', ',', '6', ')', ',', '7', ')', ')', '\0'};
	char str1[] = {'(', '1', ',', '2', ',', '3', ')', ',', '(', '4', ',', '(', '5', ',', '6', ')', ',', '7', ')', ')', '\0'};
	
	cout << rm_bracket(str) << endl;
	cout << rm_bracket(str1) << endl;
	return 0;
}