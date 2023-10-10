package se.kth.id1201;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        treeIterator();
    }
    
    public static void treeIterator(){
        BinaryTree tree = new BinaryTree(); 
        tree.add(5,105);
        tree.add(2,102); 
        tree.add(7,107); 
        tree.add(1,101); 
        tree.add(8,108); 
        tree.add(6,106); 
        tree.add(3,103);
        tree.add(4,104); 
        for(int i : tree){
            System.out.println("nextvalue "+i); 
        }
    }
}
