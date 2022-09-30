#include<stdio.h>
int fact(int n){
	if(n==0){
		return 1;
	}else{
		return(n*fact(n-1));
	}
}
void main(){
	int i=1;
	for(i=1; i<=10; ++i){
		printf("%d\n", fact(i));
	}
}
