
package testapp;

/**
 *
 * @author Lenovo
 */

import fixedStack.FixedStack;
import graphs.Graph;
import graphs.Vertex;
import java.util.Scanner;
import stack.Stack;

public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        FixedStack stack = new FixedStack<Integer>(3) ;
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.display();
        stack.pop();
        System.out.println("after pop element");
        stack.display();
        stack.push(20);
        System.out.println("push 20 ---->");
        stack.display();
                stack.push(25);

      //  Soluation test = new Soluation();
        // Dynamic Stack with link Nodes
//        Stack stack = new Stack();
//                System.err.println("push element");
//        stack.push(5);
//        stack.push(10);
//        stack.push(15);
//        System.err.println("display");
//        stack.display();
//                System.err.println("pop element");
//
//        stack.pop();
//                System.err.println("display");
//        stack.display();
        // Graph structuer
//        Graph graph = new Graph(true, true) ;
//        
//         Vertex mosul = graph.addVertex("mosul");
//         Vertex dhok = graph.addVertex("dhuk");
//         Vertex erbil = graph.addVertex("erbil");
//         
//         graph.addEdge(mosul, dhok, 30);
//         graph.addEdge(dhok, erbil, 50);
//         graph.addEdge(erbil, mosul, 90);
//     
//       graph.print();
        

//        char one = '4' - 48 ;
//                char plus = '+'  ;
//        char two = '2' - 48   ;
//    
//    Character.isDigit(two) ;
//        int result = (1 + plus + 2 ) ;
//        System.out.println(result);
////System.out.println(((Object)plusOne).getClass().getName());
////System.out.println(((Object)result).getClass().getName());
//
//Soluation s1 = new Soluation();
//Soluation Delete = new Soluation();
//int[] numbers={8, 5, 6, 16, 5} ;
//
//
//boolean[] arr = Delete.solution1(numbers, 1, 3) ;
//for(int index = 0 ; index < arr.length ; index++){
//   // System.out.println(arr[index]);
//
//}
//    int[] listNum1 = {1,2,3,0,0,0};
//        int[] listNum3 = {1,2,3,4,5};
//
//    //Delete.removeElementAtFirst(listNum3) ;
//
//        int[] listNum2 = {2,5,6};
//        int[] listNum354564 = {1,2,3,4,5};
//
// // s1.mergeAndBubbleSort(listNum1,3,listNum2,3) ;
////  double x = (float)5/(float)2 ;
////      System.out.println(x);
////s1.deleteElementAt(listNum354564, 2);
//
////int[] newnumbers={0,0,1,1,1,2,2,3,3,4} ; 
////int counter = s1.removeDuplicates(newnumbers);
//// System.out.println(counter);
//int[] ArrNumbers={-2,0,10,-19,4,6,-8} ; 
//int[] ArrNumbers2={7,1,14,11} ; 
//int[] ArrNumbers3={17,18,5,4,6,1} ;
//int[] ArrNumbers4={3,1,2,4} ;
//int[] ArrNumbers5={1,1,4,2,1,3} ;
//int[] ArrNumbers6={3,2,1} ;
//int[] ArrNumbers7={4,3,2,7,8,2,3,1} ;
//int[] ArrNumbers8={1,2,3} ;
//int[] ArrNumbers9={4, 0, 1, -2, 3} ;
//int[][] ArrNumbers10={{1,2,3,4},{5,6,7,8},{9,10,11,12}} ;
//int[] ArrNumbers11={10,2} ;
//
//
//s1.replaceElements(ArrNumbers3) ;
//boolean flage = s1.checkIfExist(ArrNumbers) ;
//s1.heightChecker(ArrNumbers5) ;
//    System.out.println(flage);
//  s1.thirdMax(ArrNumbers6) ;
//  
//Delete.sortArrayByParity(ArrNumbers4)  ;
//s1.findDisappearedNumbers(ArrNumbers7) ;
//s1.plusOne(ArrNumbers8) ;
////s1.solution2222(ArrNumbers9);
//s1.spiralOrder(ArrNumbers10);
//s1.generate(5);
///////////////////////////////////////////////////////////////////////////////
// FileSystem 
//File fileA = new File("fileA.txt", 100);
//        File fileB = new File("fileB.txt", 50);
//        File fileC = new File("fileC.txt", 75);
//        Folder folderD = new Folder("folderD");
//        folderD.addComponent(fileA);
//        folderD.addComponent(fileB);
//
//        Folder folderE = new Folder("folderE");
//        folderE.addComponent(fileC);
//
//        Folder folderF = new Folder("folderF");
//        folderF.addComponent(folderD);
//        folderF.addComponent(folderE);

//        File fileG = new File("fileG.txt", 25);
//
//        Folder root = new Folder("root");
//        root.addComponent(folderF);
//        root.addComponent(fileG);
//
//        root.print();

       // Online Java Compiler
// Use this editor to write, compile and run your Java code online

//          find the prime number
//        Scanner input = new Scanner(System.in);  
//    System.out.println("Enter the your number");
//    int factors = 0;
//    // 8
//    int tempNum ;
//    int  number = input.nextInt();
//       for(int index = 1 ; index <= number; index++){
//           
//             tempNum = number;
//            
//          if (number% tempNum == 0){
//              factors++;
//                      System.out.println(factors);
//
//           }
//          number--;
//       }
//       
//       
//       if(factors >= 2 && number < 1)
//        System.out.println("the number is prime");
//        else
//          System.out.println("the number is not prime");
      //int[] myArr = {1,8,9,4,5,7};
      //  quickSort
    //  test.quickSort(myArr, 0, myArr.length-1);
      //test.printArray(myArr);
      //   mergSort
      
//     test.mergSort(myArr);
//     test.printArray(myArr);
//      
      
      
    }
     
}
