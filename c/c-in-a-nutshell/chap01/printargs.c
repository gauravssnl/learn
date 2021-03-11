#include <stdio.h>

int main(int argc, char const *argv[])
{   printf("Display command line arguments\n"
        "-----------------------------------\n");
    for (int i = 0; i < argc; i++) {
        printf("Argument %d \t Value: %s\n", i, argv[i]);
    }
    return 0;
}
