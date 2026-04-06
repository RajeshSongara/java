class A<T extends Number>  
{
    T a, b;

    A(T a, T b)
    {
        this.a = a;
        this.b = b;
    }

    double add()
    {
        return a.doubleValue() + b.doubleValue();
    }
}

public class bound
{
    public static void main(String args[])
    {
        A<Integer> obj1 = new A<>(10, 20);
        System.out.println("Sum: " + obj1.add());

        A<Double> obj2 = new A<>(5.5, 6.5);
        System.out.println("Sum: " + obj2.add());

       // A<String> obj3 = new A<>("A","B");
    
    }
}