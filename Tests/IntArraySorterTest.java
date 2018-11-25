import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;


public class IntArraySorterTest {

    private IntArraySorter sorter;

    private int[] sortedArray;
    private int[] invertedArray;
    private Random rng;


    @Before         //Before initialize sorted array, inverted array and the random instance before every test
    public void initArraysAndRandom(){
        initArrays();
        rng = new Random();
    }

    //BUBBLE SORT TESTS

    @Test
    public void bubbleSortSortedArray(){        //Test for bubble sort with a sorted array
        sorter = new IntArraySorter(sortedArray);
        sorter.bubbleSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Bubble Sort with sorted array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void bubbleSortInvertedArray(){      //Test for bubble sort with an inverted array
        sorter = new IntArraySorter(invertedArray);
        sorter.bubbleSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Bubble Sort with inverted array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void bubbleSortLittleUntidyArray(){      //Test for bubble sort with a little untidy array
        sorter = new IntArraySorter(shuffleArray(5));
        sorter.bubbleSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Bubble Sort with a little untidy array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());

    }
    @Test
    public void bubbleSortMildlyUntidyArray(){      //Test for bubble sort with a mildly untidy array
        sorter = new IntArraySorter(shuffleArray(20));
        sorter.bubbleSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Bubble Sort with a mildly untidy array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void bubbleSortVeryUntidyArray(){    //Test for bubble sort with a very untidy array
        sorter = new IntArraySorter(shuffleArray(50));
        sorter.bubbleSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Bubble Sort with a very untidy array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());

    }

    //SELECTION SORT TESTS

    @Test
    public void selectionSortSortedArray(){             //Test for selection sort with a sorted array
        sorter = new IntArraySorter(sortedArray);
        sorter.selectionSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Selection Sort with sorted array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void selectionSortInvertedArray(){           //Test for selection sort with an inverted array
        sorter = new IntArraySorter(invertedArray);
        sorter.selectionSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Selection Sort with inverted array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void selectionSortLittleUntidyArray(){       //Test for selection sort with a little untidy array
        sorter = new IntArraySorter(shuffleArray(5));
        sorter.selectionSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Selection Sort with a little untidy array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void selectionSortMildlyUntidyArray(){       //Test for selection sort with a mildly untidy array
        sorter = new IntArraySorter(shuffleArray(20));
        sorter.selectionSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Selection Sort with a mildly untidy array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void selectionSortVeryUntidyArray(){         //Test for selection sort with a very untidy array
        sorter = new IntArraySorter(shuffleArray(50));
        sorter.selectionSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Selection Sort with a very untidy array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }

    //INSERTION SORT TESTS

    @Test
    public void insertionSortSortedArray(){         //Test for insertion sort with a sorted array
        sorter = new IntArraySorter(sortedArray);
        sorter.insertionSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Insertion Sort with sorted array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void insertionSortInvertedArray(){       //Test for insertion sort with an inverted array
        sorter = new IntArraySorter(invertedArray);
        sorter.insertionSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Insertion Sort with inverted array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void insertionSortLittleUntidyArray(){
        sorter = new IntArraySorter(shuffleArray(5));   //Test for insertion sort with a little untidy array
        sorter.insertionSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Insertion Sort with a little untidy array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void insertionSortMildlyUntidyArray(){
        sorter = new IntArraySorter(shuffleArray(20));  //Test for insertion sort with a mildly untidy array
        sorter.insertionSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Insertion Sort with a mildly untidy array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }
    @Test
    public void insertionSortVeryUntidyArray(){
        sorter = new IntArraySorter(shuffleArray(50));  //Test for insertion sort with a very untidy array
        sorter.insertionSort();
        assertEquals(true,sorter.isSorted());
        System.out.print("---Insertion Sort with a very untidy array ---\n");
        System.out.printf("Swaps: %d\n", sorter.getNumSwaps());
        System.out.printf("Comparisons: %d\n\n", sorter.getNumComparisons());
    }

    private int[] shuffleArray(int iterations){     //This function implements the Fisher Yates algorithm for shuffling
        int random;                                 //an array
        int temporal;
            for (int i = 0; i < iterations; i++) {
                random = i + rng.nextInt(sortedArray.length - i);
                temporal = sortedArray[random];
                sortedArray[random] = sortedArray[i];       //swap
                sortedArray[i] = temporal;
            }
        return sortedArray;
    }

    private void initArrays(){      //Creates a new sorted array and a new inverted array
        sortedArray = new int[50];
        for(int i=0; i<sortedArray.length;i++){
            sortedArray[i] = i+1;
        }
        invertedArray = new int[50];
        for(int i=0; i<invertedArray.length;i++){
            invertedArray[i] = invertedArray.length-i;
        }
    }

}