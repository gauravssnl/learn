#include <stdio.h>
#include <stdlib.h>

int main(void) {
    if (puts("Hello, world.C and Rust are cool.") == EOF) {
        return EXIT_FAILURE;
    }
    int chrCount = printf("%s\n", "Hello, World");
    printf("No. of characters: %d\n", chrCount);
    return EXIT_SUCCESS;
}