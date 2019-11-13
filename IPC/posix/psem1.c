#include<stdio.h>
#include<semaphore.h>
#include<fcntl.h>
#include<unistd.h>

void main()
	{
	sem_t *sem;
	int pid=0;
	pid = getpid();
	sem = sem_open("/break", O_CREAT|O_RDWR, 0666, 2);
	printf("%d trying to take the semaphore\n", pid);
	sem_wait(sem);
	printf("%d acquired the semaphore\n", pid);	
	/*
	--- crtical section
	*/
	sleep(10);
	printf("%d will release the semaphore\n", pid);
	sleep(1);
	sem_post(sem);
	sem_close(sem);
	}
