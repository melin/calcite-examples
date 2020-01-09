SqlNode SqlSubmit() :
{
     SqlNode stringNode;
}
{
    <SUBMIT> <JOB> <AS>
    stringNode = StringLiteral()
    {
        return new SqlSubmit(getPos(), token.image);
    }
}