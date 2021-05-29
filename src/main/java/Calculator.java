public class Calculator {

    public double devide (double a , double b)
    {
        if(b==0)
        {
            throw new RuntimeException("Delitel e 0");
        }
        return a/b;
    }
}
