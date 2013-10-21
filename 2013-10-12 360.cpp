#include <stdio.h>

// 4
void four() {
	int a, b;
	for (a = 1, b = 1; a <= 100; a++) {
		if (b >= 20) break;
		if (b % 3 == 1) {
			b += 3;
			continue;
		}
		b -= 5;
	}
	printf("%d\n", a);
}

// 6
void six() {
	int i, k;
	for (i = 0, k = -1; k = 0; i++, k++) {
		printf("%i ");
		k++;
	}
}

// 10

class B {
public :
	void f() {
		printf("B");
	}
};

class A : B {
public:
	void f() {
		printf("A");
	}
};

void ten() {
	A* pa = new A();
	pa->f();
	B* pb = (B*)pa;
	pb->f();
	delete pa, pb;
	pa = new B();
	pa->f();
	pb = (B*)pa;
	pb->f();

}

void main() {
	four();
	six();
	ten();
}
