package DoublyLinkList;

public class DoublyLink {
    private String name;
    private int value;
    private DoublyLink next;
    private DoublyLink previous;

    public DoublyLink(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void display(){
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoublyLink getNext() {
        return next;
    }

    public void setNext(DoublyLink next) {
        this.next = next;
    }

    public DoublyLink getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLink previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "DoublyLink{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }
}
