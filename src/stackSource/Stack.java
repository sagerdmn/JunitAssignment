
package stackSource;

public class Stack {
    
    public int [] Stack(){
     int[] arr = new int[20];
     return arr;
    }
    
    public int [] Stack(int capacity){
     int[] arr = new int[capacity];
     return arr;
    }
    
    public int length(int[] arr){
        return arr.length;
    }
}
