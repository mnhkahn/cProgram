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
	printf(str);  //strһֱ�ǿգ�������� 

	return 0;
}