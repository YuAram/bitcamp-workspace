#include <stdio.h>
#include <stdlib.h>

void main()
{
    int *p = malloc(4);
    *p = 200;
    printf("i = %d\n", *p);
    //return 0;
}