#include <iostream>
using namespace std;

int getGreatestSumOfSubArray(int *data, int size) {
	int i;
	int fn_1 = 0;
	int max = 0;
	int fn = 0;
	for (i = 0; i < size; i++)
	{
		if (i == 0 || fn_1 <= 0) {
			fn = data[i];
		}
		else {
			fn = fn_1 + data[i];
		}
		fn_1 = fn;

		if (fn > max) {
			max = fn;
		}
	}

	return max;
}

void main() {
	int data[] = {1, -2, 3, 10, -4, 7, 2, -5};
	cout << getGreatestSumOfSubArray(data, sizeof(data) / sizeof(int)) << endl;
}