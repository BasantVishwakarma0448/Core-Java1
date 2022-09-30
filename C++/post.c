#include<stdio.h>
void main(){
	int age;
	char gender;
	printf("please enter your age : ");
	scanf("%d",&age);
	printf("please enter your gender : ");
	scanf(" %c",&gender);
	if (18<=age && age<=100 && gender == 'm'){
		printf("you are  eligible for this post!");
	}
	else{
		printf("you are not eligible for this post!");
	}
	
}
