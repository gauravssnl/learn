#include <stdio.h>
#include <stdlib.h>

void swap(int *pa, int *pb);

int main() {
    int a = 100;
    int b = 200;
    swap(&a, &b);
    printf("a = %d, b = %d\n", a, b);
    return EXIT_SUCCESS;
}

void swap(int *pa, int *pb) {
    int temp = *pa;
    *pa = *pb;
    *pb = temp;
}