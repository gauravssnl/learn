#include <stdio.h>
#include <stdlib.h>

int main(void) {
    if (puts("Hello, world.C and Rust are cool.") == EOF) {
        return EXIT_FAILURE;
    }
    return EXIT_SUCCESS;
}