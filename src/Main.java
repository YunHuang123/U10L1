public class Main {
    public static void main(String[] args) {

        //simpleRecursion(5);
        //System.out.println(simpleRecursiveDivision(8));
        //recursiveMethod(4);
        System.out.println(sum(6));  // should print 21
        System.out.println(sum(10)); // should print 55

    }

    public static void simpleRecursion(int n)
    {
        System.out.println("Called, n = " + n);
        if (n > 2)
        {
            simpleRecursion(n - 1);
        }
        System.out.println("Ended, n = " + n);
    }

    public static int simpleRecursiveDivision(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        return num + simpleRecursiveDivision(num / 2);
    }

    public static void recursiveMethod(int n)
    {
        System.out.println("Called, n = " + n);
        if (n > 2)
        {
            recursiveMethod(n + 1);
        }
        System.out.println("Ended, n = " + n);
    }

    public static int sum(int n)
    {
        if (n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }
}
