package linkedlist;

class Link {

    int a;
    Link Next;

    public Link(int i){
        a=i;
    }

}

public class LinkList {

    Link First = null;

    public void insertFirst(int a){
        Link objLink = new Link(a);

        objLink.Next=First;
        First = objLink;

    }

    public void displayLink(){

        Link current = First;
        while(current!=null){
            System.out.println(current.a);
            current = current.Next;
        }

    }

   /* public void ReverseLink(){
        Link current = First;
        Link Previous = null;
        Link temp = null;

        while(current!=null){

            if(current==First)
                temp = current.Next;
            else
                temp=current.Next;

            if(temp==null){
                First = current;
                //return;
            }
            current.Next=Previous;
            Previous=current;
            //System.out.println(Previous);
            current = temp;
        }

    }*/
    
    public void ReverseLink(){
    	// My Java Implementation from Youtube C implementation https://www.youtube.com/watch?v=sYcOK51hl-A
    	// ITERATIVE APPROACH to REVERSE THE LINKEDLIST
    	// Let's say we have a previous node equal to null
    	Link prev = null;
    	// The current node variable is initially pointing to first node in the linkedlist
    	Link current = First;
    	
    	Link temp;
    	while (current != null){
    		
    		// Let's store the address of the second node in the temp variable before doing anything. We are doing this because as soon as we set the first node to previous node (which is null)
        	// we will loose the reference to second node.
    		temp = current.Next;
    		// No we can set the link part of current node to the address of the previous node. So Basically we are making first node (current holds first node's 
    		// address at first) pointing to null as prev node has null value at the start (see our declaration above)
    		current.Next = prev;
    		// NOW WE WILL REDIFINE previous and current, we will first set prev to current as follows
    		prev = current;
    		// ANd then we will move current to next
    		current = temp;
    	}
    	// We will be out of the loop when current will be null and now we need to adjust the the first node address to the last node. 
    	// The prev node will be holding the address of the last node so we will have to do the following
    	First = prev;
    	
    }
    
    public void ReverseRecursion(){
    	
    	//Link head = First;
    	
    	
    }

    public static void main(String args[]){

        LinkList objLinkList = new LinkList();
        objLinkList.insertFirst(1);
        objLinkList.insertFirst(2);
        objLinkList.insertFirst(3);
        objLinkList.insertFirst(4);
        objLinkList.insertFirst(5);
        objLinkList.insertFirst(6);
        objLinkList.insertFirst(7);
        objLinkList.insertFirst(8);
        objLinkList.displayLink();
        System.out.println("-----------------------------");
        objLinkList.ReverseLink();
        objLinkList.displayLink();

    }

}