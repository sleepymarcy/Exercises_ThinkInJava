public class IndexOfMax {
    public static void main(String[] args) {
        int[] tablica = { 1, 10, 6, 3, 22, 12, 2 };
        System.out.print(indexOfMax(tablica));
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int el : arr) {
            if (el >= max) {
                max = el;
            }
        }
        return max;
    }

    public static int indexOf(int element, int[]arr){
        int i = 0;
        for(int el: arr){
            if(el == element) break;
            i++;
        }
        return i;
    }

    public static int indexOfMax(int[] arr){
        return indexOf(maxElement(arr), arr);
    }
}
