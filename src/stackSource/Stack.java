
package stackSource;

import java.util.ArrayList;

public class Stack {
    static ArrayList<Item> arr = new ArrayList<>();
    int capacity;
    //Stack default constructor
    public Stack(){
     arr = new ArrayList<>();
     for(int i=0; i<20; i++){
         arr.add(new Item());
     }
     
    }
    //Stack parameterized constructor
    public Stack(int capacity){
        this.capacity = capacity;
        arr = new ArrayList<>();
        for(int i=0; i<capacity; i++){
            arr.add(new Item());
        }
    }
    
    //// METHODS ////
    
    public boolean empty(){
       if(arr.size()<=0){
             return true;
        }
        else {
           return false;
       }
    }
    
    //pop() method
    public int pop() throws EmptyStackException{
        if(empty()){
             throw new EmptyStackException();
        }
        else {
        int temp = arr.get(0).number;
        arr.remove(0);
        return temp;
        }  
    }
    
    //peek() method
    public int peek() throws EmptyStackException{
        if(empty()){
             throw new EmptyStackException();
        }
        else {
        int temp = arr.get(0).number;
        return temp;
        }  
    }
    
    //push() method
    public void push(Item e)throws FullStackException{
        if(arr.size()==capacity){
             throw new FullStackException();
        }
        else {
            arr.add(0,e);
        }
    }

    public static void main(String[] args){
        Stack joe = new Stack();
        System.out.print(joe.empty());
    }
}
