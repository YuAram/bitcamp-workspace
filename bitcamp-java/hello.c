#include <stdio.h>
#include <stdlib.h>

// function prototype
void f1(int);
void f2(int*);


void main()
{
  int a = 200;
  
  f1(a);
  printf("a = %d\n",a);
  
  f2(&a);
  printf("a = %d\n",a);
}

void f1(int a) {
  a = 100;
}

void f2(int* p) {
  *p = 100;
}