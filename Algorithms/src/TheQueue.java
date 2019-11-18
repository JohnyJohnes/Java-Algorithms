import java.util.Arrays;

public class TheQueue {

    private String[] queueArr;
    private int queueSize;
    private int front,rear, numberOfItems = 0;

    public TheQueue(int queueSize) {
        this.queueSize = queueSize;
        queueArr = new String[queueSize];
        Arrays.fill(queueArr,"-1");
    }

    public void insert(String input){
        if (numberOfItems+1<=queueSize){
            queueArr[rear] = input;

            rear++;

            numberOfItems++;
            System.out.println("insert "+input);
        }
        else
            System.out.println("queue is full");
    }

    public void remove(){
        if (numberOfItems>0){
            System.out.println("Remove "+queueArr[front]);
            queueArr[front]  ="-1";
            front++;
            numberOfItems--;
        }
        else
            System.out.println("queue is empty");
    }

    public void displayQueue(){
        for (int i = front; i < rear; i++) {
            System.out.println("|"+queueArr[i]+"|");
        }
        System.out.println("--------End---------");
    }

    public void peek(){
        System.out.println(queueArr[front]);
    }

    public void priorityInsert(String input){
        int i;
        if (numberOfItems == 0){
            insert(input);
        } else {
            for(i = numberOfItems-1; i>=0; i--){
                if (Integer.parseInt(input) > Integer.parseInt(queueArr[i]))
                    queueArr[i+1]= queueArr[i];
                else break;
            }
            queueArr[i+1] = input;
            rear++;
            numberOfItems++;
        }

    }

    public static void main(String[] args){
        TheQueue queue = new TheQueue(10);

        queue.insert("10");
        queue.insert("1012");
        queue.insert("10");

        queue.priorityInsert("11");

        queue.displayQueue();

        queue.remove();
        queue.displayQueue();
        queue.peek();
    }
}
