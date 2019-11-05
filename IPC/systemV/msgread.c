#include<stdio.h>
#include<sys/ipc.h>
#include<sys/msg.h>
#include<fcntl.h>
struct msgbuf 
	{
	long mtype;
	char mtext[40];
	};

void main()
	{
	int key=0, id=0;
	int num=0;
	struct msgbuf vara;
	key = ftok("/bin", 65);	
	id = msgget(key, IPC_CREAT|0666);
	printf("enter mtype\n");
	scanf("%d", &num);
	msgrcv(id, &vara, sizeof(struct msgbuf), num, 0);
	perror("");
	printf("msg read is -->%s\n", vara.mtext);
	}
