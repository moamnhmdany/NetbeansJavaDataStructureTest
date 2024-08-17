/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Lenovo
 */
public class Edge {
    
   private Vertex startV ;
   private Vertex endV ; 
   private Integer edgeWieght ;

    
    
   public Edge(Vertex start,Vertex end,Integer wieght){
       this.startV = start ;
       this.endV = end ;
       this.edgeWieght = wieght ;
   }
   public Vertex getStartV() {
        return startV;
    }

    public Vertex getEndV() {
        return endV;
        
        
        
    }

    public Integer getEdgeWieght() {
        return edgeWieght;
    }
}
