#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void GetMemory(char *p)
{
	p = (char *)malloc(100);
}

int Test1(void)
{
	char *str = NULL;
	GetMemory(str);  
	strcpy(str, "hello world");
	printf(str);  //str一直是空，程序崩溃 

	return 0;
}