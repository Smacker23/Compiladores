int max(int a, int b)
begin
    if  a  < b then
        return b;
    else
        return a;
end

void main()
begin
    int bla;
    real bli;
    bla = max(2, 10);
    bli = 5 * bla;
    if bli < bla then
        print "ola";
    else
        print 4;
end