#include <iostream>
using namespace std;

// 1
char* uppercase(char* str) {
	char* p = str;
	int diff = 'a' - 'A';

	while(*p != '\0') {
		if (*p >= 'a' && *p <= 'z') {
			*p = char(*p - diff);
		}
		p++;
	}

	return str;
}

// 2
struct node {
	int data;
	struct node* left;
	struct node* right;
};
bool isBalance(node* root, int &depth) {
	if (root == NULL)
	{
		depth = 0;
		return true;
	}

	int left, right;
	if (isBalance(root->left, left) && isBalance(root->right, right))
	{
		int diff = left - right;
		if (diff <= 1 && diff >= -1)
		{
			depth = left > right ? (left + 1) : (right + 1);
			return true;
		}
	}
	return false;
}
bool isBalance(node* root) {
	int depth = 0;
	return isBalance(root, depth);
}

// 3
typedef struct keyvalue {
	int key;
	double value;
};
void sumKeyValueArray(const keyvalue aArray1[], int nLen1, const keyvalue aArray2[], int nLen2, keyvalue aResult[], int &nResultLen) {
	int i, j, k = 0;
	for (i = 0, j = 0; i < nLen1 && j < nLen2; )
	{
		keyvalue kv;
		if (aArray1[i].key == aArray2[j].key) {
			kv.key = aArray1[i].key;
			kv.value = aArray1[i].value + aArray2[j].value;
			aResult[k++] = kv;

			i++;
			j++;
		}
		else {
			kv.key = aArray1[i].key > aArray2[j].key ? aArray2[j].key : aArray2[i].key;
			kv.value = aArray1[i].key > aArray2[j].key ? aArray2[j].value : aArray2[i].value;
			aResult[k++] = kv;

			aArray1[i].key > aArray2[j].key ? j++ : i++;
		}
	}

	for (; i < nLen1; i++)
	{
		keyvalue kv;
		kv.key = aArray1[i].key;
		kv.value = aArray1[i].value;
		aResult[k++] = kv;
	}
	for (; j < nLen2; j++)
	{
		keyvalue kv;
		kv.key = aArray2[j].key;
		kv.value = aArray2[j].value;
		aResult[k++] = kv;
	}
}

// 4
void change(char* str) {
	char* h = str;
	char* t = str;

	while (*t++ != '\0');
	t--;
	t--;

	while (h < t) {
		*t = *h ^ *t;
		*h = *h ^ *t;
		*t = *h++ ^ *t--;
	}
}

// 5
typedef struct student {
	char name[20];
	char sex;
	int no;
	int age;
	student* next;
};
// 有头结点
void removeStu(student * head, int age) {
	student *p, *pre;
	p = head->next;
	pre = head;
	while (p != NULL) {
		if (p->age == age) {
			pre->next = p->next;
			delete p;
			p = pre->next;
			continue;
		}
		p = p->next;
	}
}

int main() {
	// 1
	char str[] = "ab*(cD";
	cout << uppercase(str) << endl;


	// 3
	const keyvalue aArray1[] = {{1, 400.0}, {4, 700.0}, {5, 100.0}};
	const keyvalue aArray2[] = {{1, 300.0}, {2, 500.0}, {3, 400.0}, {4, 200.0}};
	keyvalue aResult[5];
	int size = 5;
	sumKeyValueArray(aArray1, 3, aArray2, 4, aResult, size);

	// 4
	int i;
	for (i = 0; i < size; i++)
	{
		cout << aResult[i].key << " " << aResult[i].value << endl;
	}

	char str4[] = "hello, world";
	change(str4);
	cout << str4 << endl;

	// 5
	student *stu3;
	stu3 = new student;
	strcpy(stu3->name, "Jack");
	stu3->sex = 1;
	stu3->age = 30;
	stu3->next = NULL;
	student *stu2;
	stu2 = new student;
	strcpy(stu2->name, "Rose");
	stu2->sex = 0;
	stu2->age = 28;
	stu2->next = stu3;
	student *stu1;
	stu1 = new student;
	strcpy(stu1->name, "Bryce");
	stu1->sex = 1;
	stu1->age = 26;
	stu1->next = stu2;
	student *stu;
	stu = new student;
	strcpy(stu->name, "");
	stu->sex = -1;
	stu->age = 0;
	stu->next = stu1;

	removeStu(stu, 26);

	student *p = stu->next;
	while (p != NULL) {
		cout << p->name << endl;
		p = p->next;
	}
	
	return 0;
}