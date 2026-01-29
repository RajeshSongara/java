
class box {

    int x = 55;
    static int y = 66;

    static void fun1() {
        System.out.println(" Raz " + y);
    }

    void fun() {
        System.out.println("hello hy Raz " + x);
    }
}

public class jav {

    public static void main(String args[]) {
        box s2 = new box();
        s2.fun();
        box.fun1();

        System.out.println("hello hy Raz " + box.y);
    }
}
