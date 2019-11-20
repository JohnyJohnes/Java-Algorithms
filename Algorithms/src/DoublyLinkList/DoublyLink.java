package DoublyLinkList;

public class DoublyLink {
    public String name;
    public int value;
    public DoublyLink next;
    public DoublyLink previous;

    public DoublyLink(String name, int value) {
        this.name = name;
        this.value = value;
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
