
public class PriorityListQueue extends DoublyLinkedList {
    private DoublyLinkedList aList;

    public PriorityListQueue(){
        aList = new DoublyLinkedList();
    }

    public void insert(long key){
        aList.priorityInsert(key);
    }

    public long remove(){
        if(aList.isEmpty()){
            System.out.println("It's Empty List!!!");
        }
        long value = aList.deleteLast().dData;
        return value;
    }

    public boolean isEmpty(){
        return aList.isEmpty();
    }

    public void displayForward(){
        aList.displayForward();
    }   
}
