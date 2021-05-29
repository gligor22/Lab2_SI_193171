import java.util.Scanner;

public class triangleProblem {
    public static void main(String[] args) {
        PrintTriangleType();
    }

    private static void PrintTriangleType() {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();//a
        b=in.nextInt();//a
        c=in.nextInt();//a
        String tip= "raznostran";//b
        if(a==b||b==c||c==a)//c
            tip = "ramnoKrak";//d
        if(a==b&&b==c)//e
            tip = "ramnostran";//f
        if(a > (b+c) || b > (c+a) || c > (a+b))//g
            tip = "ne e triagolnik";//h
        if(a<1||b<1||c<1)//i
            tip = "nepravilen vlez";//j
        System.out.println(tip);//k
    }
}
