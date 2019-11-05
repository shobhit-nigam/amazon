#include<stdio.h>
#include<unistd.h>
void funca()
	{
	int i = 0;
	for(i=6; i>0; i--)
		{
		printf("A will end in %d secs\n", i);
		sleep(1);
		}
	}
void funcb()
	{
	int i = 0;
	for(i=3; i>0; i--)
		{
		printf("B will end in %d secs\n", i);
		sleep(1);
		}
	}
void main()
	{
	int i = 0;
	funca();
	funcb();
	for(i=9; i>0; i--)
		{
		printf("main will end in %d secs\n", i);
		sleep(1);
		}
	}
//	BSD
//	Sys V
	
//	POSIX 
//		1a 	OS
//		1b	RTOS
//		1c	threads


























