/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Vertex {

    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String inoutData) {

        this.data = inoutData;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex end, Integer wieght) {
        this.edges.add(new Edge(this, end, wieght));
    }

    public void removeEdge(Vertex endVertex) {

        edges.removeIf(edge -> edge.getEndV().equals(endVertex));
    }

    public String getData() {
        return this.data;
    }

    public ArrayList<Edge> getEdges() {
        return this.edges;
    }

    public void print(boolean isWeighted) {
        String message = "";

        if (this.edges.size() == 0) {
            System.out.println(this.data + " -->");
            return;
        }

        for (int i = 0; i < this.edges.size(); i++) {
            if (i == 0) {
                message += this.edges.get(i).getStartV().data + " -->  ";
            }

            message += this.edges.get(i).getEndV().data;

            if (isWeighted) {
                message += " (" + this.edges.get(i).getEdgeWieght() + ")";
            }

            if (i != this.edges.size() - 1) {
                message += ", ";
            }
        }
        System.out.println(message);
    }
}
