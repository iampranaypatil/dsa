package queue;

public class Main {
    public static void main(String[] args) {

        CircularQueueLL q = new CircularQueueLL();
        q.insert(10);
        q.insert(20);
        q.insert(30);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
        System.out.println(q);

    }
}
