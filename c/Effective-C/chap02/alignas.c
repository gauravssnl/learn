struct S
{
    int i;
    double d;
    char c;
};

int main(int argc, char const *argv[])
{
    unsigned char bad_buff[sizeof(struct S)];
    _Alignas(struct S) unsigned char good_buff[sizeof(struct S)];

    struct S *bad_ptr = (struct S *)bad_buff;
    struct S *good_ptr = (struct S *)good_buff;

    return 0;
}
