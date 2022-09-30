#include<stdio.h>
struct human{
	int age;
	char name[20];
	float hieght, weight;
};
void main(){
	struct human h;
	printf("Enter your name: ");
	gets(h.name);
	printf("Enter your age: ");
	scanf("%d",&h.age);
	printf("Enter your hieght: ");
	scanf("%f",&h.hieght);
	printf("Enter your weight: ");
	scanf("%f",&h.weight);
	
	
	printf("your name is: %s\n",h.name);
	printf("your age is: %d\n",h.age);
	printf("your hieght is: %.2f",h.hieght);
	printf("your weight is: %.2f",h.weight);
}
