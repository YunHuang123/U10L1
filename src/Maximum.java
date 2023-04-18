public class Maximum {
    public static void main(String[] args) {

    }
    public static int findMaximum(int[] array, int i) {
        if (i == array.length - 1)
        {
            return array[i];
        }
        int val = findMaximum(array, i + 1);
        if (val > array[i])
        {
            return val;
        }
        else
        {
            return array[i];
        }
    }

}
