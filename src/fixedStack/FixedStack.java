/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixedStack;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class FixedStack<T> {
    
    
    int size ;
    ArrayList<T> stack;
    int top = -1 ;
    
    public FixedStack(int size){
        stack = new ArrayList<T>(size);
        this.size = size ;
    }
    public void push(T data){
    
        if(isFull()){
        
            System.out.println("please pop element from stack");
        }else{
        
        this.stack.add(data) ;
        top++;
        }
    }
    
    public void pop(){
        if(isEmpty()){
            System.err.println("please push element stack is empty");
        }else{
            stack.remove(top);
            top--;
        }
    }
    
    public void peek(){}
    
    public Boolean isEmpty(){
        return top < 1 ;
    }
    
    public Boolean isFull(){
       return this.size-1 == top ;
    }
    
    
    
    public void display(){
        for(int index = 0;index <= top;index++ ){
           
            System.out.println(stack.get(index));
        }
    }
    
}
