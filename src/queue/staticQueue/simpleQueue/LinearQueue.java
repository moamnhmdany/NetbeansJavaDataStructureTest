/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.staticQueue.simpleQueue;

/**
 *
 * @author Lenovo
 */
public class LinearQueue {
    
    
     int[] queue ;
    int front ;
    int rear = 0 ;
    int data ;
    int size = 0 ;
    int counter = 0;
    
    public LinearQueue(int size){
    
        this.queue = new int[size];
        this.size = size ;
        this.front = 0 ;
    }    
    public void enqueue(int data){
          if(isFull()){
              System.out.println("the queue is full please dequeue");
          }else{
        this.queue[this.rear]= data ;
        this.rear++;
        //
          }
    }
    
    
     public void dequeue(){
        if(isEmpty()){
            System.out.println("the queue is empty please add new element");
             System.exit(-1);
        }else{
        
            for(int index = 0 ; index < this.rear-1; index++){
               
               this.queue[index] = this.queue[index++]; 
            }
          this.queue[this.rear-1] = 0 ;   
          this.rear-- ;
        }
     }
     
    public boolean isEmpty(){
      return this.rear == 0 ;
    }
    
     public boolean isFull(){
       return this.queue.length == this.rear ;
     }
      public int peek(){
          if(isEmpty()){
            System.out.println("the queue is empty");
            System.exit(-1);
          }
         
         return this.queue[this.front];
      }
      
      public void display(){
         for(int index = 0 ; index < this.rear ; index++){
         
             System.out.print(" <== "+"item "+this.queue[index] +" ");
         }
      }

    
}
