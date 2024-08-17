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
public class StackNode {
    
    int data ;
    StackNode next ;
    
    
    public StackNode(int data){
     this.data = data ;
     this.next = null ;
    }
    
    
    public int getContent(){
      return this.data ;
    }
}
