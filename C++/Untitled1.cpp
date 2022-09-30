#include<stdio.h>
#include<malloc.h>
int nodecount=0;
int create();
int show();
int insert();
int del();
struct linklist{
	int info;
	struct linklist *link;
}*s=NULL,*c=NULL;
int main(){
	int ch;
	while(1){
		printf("\nEnter \n1 for create\n2 for Insert\n3 for Delete\n4 for Show\n5 for exit\n\n");
		scanf("%d",&ch);
		if(ch==1) create();
		else if(ch==2) insert();
		else if(ch==3) del();
		else if(ch==4) show();
		else break;
	}
}
int create(){
	int n;
	struct linklist *node;
	node = (struct linklist*)malloc(sizeof(struct linklist));
	if(node==NULL){
		printf("Memory Not Allocated\n");
		return 1;
	}
	printf("Enter the Data: ");
	scanf("%d",&n);
	node->info=n;
	node->link=NULL;
	
	if(s==NULL){
		s=node;
		c=node;
	}
	else{
		c->link=node;
		c=node;
		c->link=NULL;
	}
	nodecount++;
	printf("\n\nNOde Created\n\n");
	return 1;
}
int insert(){
	int n,p,i,nc;
	struct linklist *node,*t;
	if(s==NULL){
		printf("\nList is Empty\n");
		return 1;
	}
	node=(struct linklist*)malloc(sizeof(struct linklist));
	if(node==NULL){
		printf("Memory Allocation Faild");
		return 1;
	}
	nc  = nodecount+1;
	printf("\nEnter your Data: ");
	scanf("%d",&n);
	node->info=n;
	node->link=NULL;
	printf("Enter the position to enter from 1 to %d",nc);
	scanf("%d",&p);
	if(p<1||p>nc){
		printf("\nInvalid position");
		return 1;
	}
	if(p==1){
		node->link=s;
		node=s;
	}
	else if(p==nc){
		c->link=node;
		node=c;
	}
	else{
		t=s;
		for(i=1;i<(p-1);i++){
			t=t->link;
		}
		node->link=t->link;
		t->link=node;
	}
	nodecount++;
	printf("\nInserted\n");
	return 1;
}
int del(){
	struct linklist *t,*t2;
	int i,p;
	if(s==NULL){
		printf("\nLinklist is Empty");
		return 1;
	}
	printf("Enter the position of node from 1 to %d",nodecount);
	scanf("%d",&p);
	if(p==1){
		t=s;
		s=s->link;
		t->link=NULL;
	}
	else if(p==nodecount){
		t=s;
		for(i=1;i<(p-1);i++){
			t=t->link;
		}
		t=c;
		t=t->link;
		c->link=NULL;
	}
	else{
		t2=s;
		for(i=1;i<(p-1);i++){
			t2=t2->link;
		}
		t=t2->link;
		t2->link=t->link;
		t->link=NULL;
	}
	free(t);
	nodecount--;
	printf("\nNode Deleted\n");
	return 1;
}
int show(){
	struct linklist *t;
	t=s;
	while(t!=NULL){
		printf("\n%d",t->info);
		t=t->link;
	}
	
	return 1;
}
