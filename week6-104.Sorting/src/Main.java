
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
       
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }
    
    
    public static int smallest(int[] array) {
        
        int i = Integer.MAX_VALUE;
        
        for(int value : array) {
            if(i > value) {
                i = value;
            }
        }
        
        return i;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        
        for(int i = 0; i < array.length; i++) {
            if(smallest > array[i]){
                smallest = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        
        int smallest = Integer.MAX_VALUE;
        int indexOfSmallest = -1;
        
        for(int i = index; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
                indexOfSmallest = i;
            }
            
        }
        
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2){
        
        for(int i = 0; i < array.length; i++) {
            if(i == index1){
                int temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
            }
        }
    }

    public static void sort(int[] array) {

        //swap(array, indexOfTheSmallest(array), 0);

        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }

    }
    
}
