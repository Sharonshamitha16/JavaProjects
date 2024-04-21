package org.codewithsharon.ds;
 import java.util.ArrayList;
 import java.util.LinkedList;
 import java.util.Queue;

public class Graph {
    ArrayList <ArrayList<Integer>> adjlist = new ArrayList<>();
     Graph(int v){
         for (int i=0;i<v;i++){
             adjlist.add(new ArrayList<Integer>());
         }
     }
     public void addEdge(int v, int u){
         adjlist.get(v).add(u);
         adjlist.get(u).add(v);
     }
     public void printEdge(){
         for(int i = 0 ;i<adjlist.size();i++){
             System.out.println("Adjacent of vertex "+i);
             for (int j=0;j<adjlist.get(i).size();j++){
                 System.out.println(" "+ adjlist.get(i).get(j));
             }
         }
    }
    public void bfs(int v){ // fisrt element starts to add
         int V = adjlist.size(); //assigning  the size of the list created by
        // adjlist obj
         boolean [] visited = new boolean[V]; //creating a boolean array to assign
        // visited
        visited[v]=true;
        // vertices to be in that array
        Queue<Integer> q = new LinkedList<>(); // creating a queue to add the vertex
        // and its list
        q.add(v); //addding fn
        System.out.println("--------------from bfs------------");
        while(q.size()!=0){ //when size is not equal to  0
         int vertex= q.remove(); //then , remove the element as dequeue does
         System.out.print(" "+vertex);
         for(int i=0; i<adjlist.get(vertex).size();i++){ //THIS IS ITERATING THE ADJACENT VERTEX
             // ,i.e the sub list
            int av = adjlist.get(vertex).get(i);// getting the list for eg A - e b g are the
             // connections with  so that e,b,g are been iterated and taken
             // from the adjlist we created in the graphrep cls
            if(!visited[av]){ // the adjacent vertex which there in the array
                // is undergoing this loop checks whetehr it has visited or not
                q.add(av);// added in the queue i.e the boolean array made a obj as visited as
                visited[av]=true; //MARKS IF THE VERTEX IS NOT VISITED
            }
         }
     }
     }
     public void dfs(int start_vertex){
         int Vertex_size = adjlist.size();
         boolean[] visited = new boolean[Vertex_size];
         System.out.println();
         System.out.println("-----------------from dfs-------------------");
         dfs2(start_vertex,visited); // calling the method recursively
     }
     public void dfs2(int start_vertex,boolean [] visited){ //this is done as we need to call the boolean visited there so it's done like this same like we did on insert  during bst
         visited[start_vertex]=true;
         System.out.print(start_vertex+ " ");
         for(int i=0;i< adjlist.get(start_vertex).size();i++){
             int av= adjlist.get(start_vertex).get(i);
           //  System.out.println(start_vertex+ " ");
             if(!visited[av]){
                  dfs2(av, visited);
             }
         }
     }
}
