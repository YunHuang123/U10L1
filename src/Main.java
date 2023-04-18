public class Main {
    public static void main(String[] args) {

        //simpleRecursion(5);
        //System.out.println(simpleRecursiveDivision(8));
        //recursiveMethod(4);
        //System.out.println(sum(6));  // should print 21
        //System.out.println(sum(10)); // should print 55
        //int someNum = mystery(9, 2);
        //System.out.println(someNum);
        //System.out.println(bunnyEars(10));
        //int[] myNums = {6, 2, 8, 4, 7};
        //int result = arrayRecursive(myNums, myNums.length - 1);
        //System.out.println(result);
        //System.out.println(mysteryString("xyzxyxy"));
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

    public static int mystery(int m, int n)
    {
        if (m <= 0)
        {
            return n;
        }
        return n * mystery(m - 2, n + 1);
    }

    public static int bunnyEars(int bunnies)
    {
        if (bunnies > 5)
        {
            return 2 + bunnyEars(bunnies - 1);
        }
        else if (bunnies > 0)
        {
            return 3 + bunnyEars(bunnies - 2);
        }
        else
        {
            return 4;
        }
    }

    public static int arrayRecursive(int[] nums, int index)
    {
        if (index < 0)
        {
            return 0;
        }

        return nums[index] + arrayRecursive(nums, index - 1);
    }

    public static int mysteryString(String str)
    {
        if (str.length() == 1)
        {
            if (str.substring(0, 1).equals("y"))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if (str.substring(0, 1).equals("y"))
            {
                return 1 + mysteryString(str.substring(1));
            }
            else
            {
                return mysteryString(str.substring(1));
            }
        }
    }

}
