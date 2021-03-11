#include <stdio.h>

int main(int argc, char const *argv[])
{
    const char c;
    test_func(c);
    return 0;
}

int test_func(char *s) {
    if (s == NULL) 
        fprintf(stderr, "%s: received null pointer argument\n", __func__);
}
