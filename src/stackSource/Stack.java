
package stackSource;

import java.util.ArrayList;

public class Stack {
    static ArrayList<Item> arr = new ArrayList<>();
    
    public Stack(){
     arr = new ArrayList<>();
     for(int i=0; i<20; i++){
         arr.add(new Item());
     }
     
    }
    
    public Stack(int capacity){
     arr = new ArrayList<>();
     for(int i=0; i<capacity; i++){
         arr.add(new Item());
     }
    }
    
    public int pop() throws EmptyStackException{
        if(arr.size()<=0){
             throw new EmptyStackException();
        }
        else {
        int temp = arr.get(0).number;
        arr.remove(0);
        return temp;
        
        } 
        
    }
    
    public static void main(String[] args){
        Stack joe = new Stack();
        for(int i=0; i<joe.arr.size(); i++){
            System.out.println(arr.get(i).number);
        }
    }
}
