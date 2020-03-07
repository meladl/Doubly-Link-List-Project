
public class Main {

    public static void main(String[] args) {
        PriorityListQueue queue = new PriorityListQueue();
        for (int i = 0; i < 10; i++) {
            queue.insert((long) (Math.random() * 10));
            System.out.println();
            queue.displayForward();
        }
        System.out.println();
        System.out.println();
        System.out.println("Removing Testing!!");
        System.out.println();
        System.out.println();
        while(!queue.isEmpty()){
            System.out.println();
            System.out.println(queue.remove() + " REMOVED!!!");
            System.out.println();
            queue.displayForward();
        }

    }
}
