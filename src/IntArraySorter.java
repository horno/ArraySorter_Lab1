public class IntArraySorter {

    private final int[] array;


    private int numComparisons;
    private int numSwaps;
    public int getNumComparisons() {
        return numComparisons;
    }
    public int getNumSwaps() {
        return numSwaps;
    }
    public IntArraySorter(int[] array) {
        this.array = array;
    }
    public boolean isSorted() {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        numSwaps += 1;
    }

    public boolean lessThanOrEqual(int i1, int i2) {
        numComparisons += 1;
        return i1 <= i2;
    }

    public void bubbleSort() {
        for(int i=0;i<array.length;i++){
            for(int j = array.length-1;j>i;j--){
                if(lessThanOrEqual(array[j],array[j-1])){
                    swap(j,j-1);
                }
            }
        }
    }

    public void selectionSort() {
        int positionOfMin;      //position of the smallest value of the disordered part of the array
        for(int n=0;n<array.length;n++){
            positionOfMin = n;
            for(int i = n+1; i<array.length;i++){
                if(lessThanOrEqual(array[i],array[positionOfMin])){
                    positionOfMin = i;
                }
            }
           if(array[positionOfMin]!=array[n]){
               swap(n,positionOfMin);
           }
        }
    }

    public void insertionSort() {
        // The prefix [0..s) is a sorted array
        // We insert element s into this prefix
        for (int s = 1; s < array.length; s++) {
            int insert = s;
            // Element at insert is lower than any
            // element in [insert+1..s]
            for (int i = s - 1; i >= 0; i--) {
                if (!lessThanOrEqual(array[i], array[insert])) {
                    swap(i, insert);
                    insert = i;
                } else {
                    break;
                }
            }
        }
    }
}