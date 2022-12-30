// LINEAR SEARCH

package codingjourneystart;
public class Ch14ARRAYS06 {
    public static int linearSearch(int []array,int key){
        for(int i=0; i< array.length; i++){ // to traverse each element to match with key
            if(array[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []array = {10,20,30,40};
        int key = 40;
        // fun call
        int index = linearSearch(array,key);
        if(index == -1)
            System.out.println("Element not found...");
        else
            System.out.println("Element found at index " + index);
    }

}
