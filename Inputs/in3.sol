int quatro = 4;
int add3Numbers(int x, int y, int z)
begin
    int a = x + y;
    return z + a;
end

int times4(int x)
begin
    return x * quatro;
end

void main()
begin
    int p = times4(add3Numbers(1,2,3));
    print p;
end
