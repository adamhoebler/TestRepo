package hoebler;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static void main(String[] args) {
	//Create a queue amd enqueue/dequeue strings
        Queue<String> q = new Queue<String>(); //Declare a new queue s of type string
        while(!StdIn.isEmpty()){
            String item = StdIn.readString(); //Read a string item in
            if(!item.equals("-")) q.enqueue(item); //If item equals - enqueue the item
            else if(!q.isEmpty()) StdOut.print(q.dequeue()+" ");
            //StdOut.println("("+q.size()+" left on queue)");
        }
        StdOut.println("("+q.size()+" left on queue)");
    }
}
