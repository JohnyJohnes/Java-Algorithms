import java.util.Arrays;

public class TheStack {

    private String[] stackArray;

    private int stackSize;

    private  int topOfStack = -1;

    public TheStack(int stackSize) {
        this.stackSize = stackSize;

        stackArray = new String[stackSize];

        Arrays.fill(stackArray, "-1");
    }

    public void displayTheStack(){
        for (String item :
                stackArray) {
            if(!item.equals("-1"))
                System.out.println('|'+item+'|');
        }
        System.out.println("------------End of stack--------------");
    }

    public void push(String input){
        if (topOfStack+1<stackSize){
            topOfStack++;
            stackArray[topOfStack]= input;
        }
        else
            System.out.println("Stack is full");
        displayTheStack();
    }

    public String pop(){
        displayTheStack();
        if (topOfStack>=0){
            System.out.println("Item "+stackArray[topOfStack]+" has been removed");

            stackArray[topOfStack] = "-1";

            return stackArray[topOfStack--];

        }
        else {

            System.out.println("stack is empty");
            return "-1";
        }

    }

    private String peek(){
        displayTheStack();

        System.out.println("Peeked: "+stackArray[topOfStack]);
        return stackArray[topOfStack];
    }

    public void pushValues(String values){
        String[] temp = values.split(" ");
        for (String item :
                temp) {
            push(item);
        }
    }

    public void popAll(){
        for (int i = topOfStack; i >= 0; i--) {
            pop();
        }
    }

    public static void main(String[] args){
        TheStack stack = new TheStack(10);
        stack.push("halo");
        stack.pop();

        stack.push("halo");
        stack.pushValues("halo 0101 12 213123 241 dasfa da ");
        stack.peek();

        stack.popAll();

    }
}
