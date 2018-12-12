package com.rz.landcis;

import java.util.ArrayList;

public class GNodeUtils {

    /*
    1. Imagine we have an interface "GNode" that looks like this:

       public interface GNode {
         public String getName();
        public GNode[] getChildren();
       }

       ** Observe that this GNode can be thought of as defining a graph.
       ** In implementing the functions below, you can assume that any
          graph defined by a GNode is acyclic (no cycles).
       ** Assume that when a GNode has no children, getChildren() returns
          a array of size 0, and *not* null.
       ** You can also assume that all children returned by getChildren()
          are not null.

       Implement a function with the following signature:

           public ArrayList walkGraph(GNode);

       which should return a ArrayList containing every GNode in the
       graph. Each node should appear in the ArrayList exactly once
       (i.e. no duplicates).

     */
    public ArrayList walkGraph(GNode start) {
        ArrayList feedback = new ArrayList();
        if (start == null) {
            return feedback;
        } else {
            feedback.add(start);
        }
        if (start.getChildren().length == 0) {
            return feedback;
        }
        for (GNode each : start.getChildren()) {
            ArrayList childList = walkGraph(each);
            feedback.addAll(childList);
        }
        return feedback;
    }


    /*
    * 2. Implement a function with the following signature:

        public ArrayList paths(GNode node);

       which should return a ArrayList of ArrayLists, representing all
       possible paths through the graph starting at 'node'. The ArrayList
       returned can be thought of as a ArrayList of paths, where each path
       is represented as an ArrayList of GNodes.

       Example:
       Assume the following graph:

       A
         B
           E
           F
         C
           G
           H
           I
         D
           J

       paths(A) = ( (A B E) (A B F) (A C G) (A C H) (A C I) (A D J) )

    * */
    public ArrayList paths(GNode node) {
        ArrayList feedback = new ArrayList();

        return feedback;
    }

}
