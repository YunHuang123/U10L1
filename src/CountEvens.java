public class CountEvens {
    public static void main(String[] args) {

    }
    public static int countEvens(int[] array, int i) {
        if (i == array.length){
            return 0;
        }
        if (array[i] % 2 == 0){
            return 1 + countEvens(array, i+1);
        }
        else{
            return countEvens(array, i+1);
        }
    }

}
