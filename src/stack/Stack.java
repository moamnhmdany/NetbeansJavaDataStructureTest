/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Lenovo
 */
public class Stack {

    int data;
    StackNode newNode, top = null, temp;

 public   void push(int data) {
        newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
        } else {

            newNode.next = top;
            top = newNode;

        }
    }


public void pop(){
    if(top == null){
        System.out.println("the stack is empty please push new elemnet");
    }else{
    
  newNode = top ;
  top = newNode.next;
  newNode = null ;
    }
}
  public void display(){

    for(temp = top ; temp!=null;temp=temp.next){
    
        System.err.println(temp.getContent());
    }
}
   
   
   
   
   
   
   
   
   
}
