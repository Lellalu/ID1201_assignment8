package se.kth.id1201;

public class QueueArray<T> {
    T[] queue;
    int first;
    int last;
    int size;
    int num_element;

    public QueueArray(int size){
        this.first = 0;
        this.last = 0;
        this.size = size;
        this.num_element = 0;
        this.queue =  (T[]) new Object[this.size];
    }

    public boolean isEmpty(){ 
        return num_element == 0; 
    }

    public void add(T item){
        if(size == num_element){
            expand();
        }
        this.queue[last] = item;
        last = (last + 1) % size;
        num_element += 1;
    }

    public void expand(){
        T[] newQueue = (T[]) new Object[2*size];
        int index;
        for(index = 0; index < size; index++){
            newQueue[index]=queue[first];
            first = (first+1)%size;
        }
        first = 0;
        last = size;
        size = size*2;
        queue = newQueue;
    }

    public T remove(){
        if(isEmpty()){
            return null;
        }
        if(num_element < size/4){
            shrink();
        }
        T item = queue[first];
        first = (first + 1) % size;
        num_element -= 1;
        return item;
    }

    public void shrink(){
        int newSize = size/2;
        T[] newQueue = (T[]) new Object[newSize];
        int index = 0;
        while(first != last){
            newQueue[index] = queue[first];
            first = (first+1) % size; 
            index++;
        }
        first = 0;
        last = index;
        size = newSize;
        queue = newQueue;
    }

    
}
