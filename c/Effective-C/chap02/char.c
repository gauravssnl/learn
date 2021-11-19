#include <stdio.h>
#include <stdlib.h>
#include <wchar.h>
#include <locale.h>

int main(int argc, char const *argv[])
{
    char c = 'A';
    signed char d = -1;
    unsigned char e = 1;
    wchar_t *f = L"सू  RGH";
    setlocale(LC_CTYPE, "");
    printf("c = %c, d, %i, e = %u, f = %ls\n", c, d, e, f);
    return 0;
}
