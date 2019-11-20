package LinkList;

public class Link {
    private String name;
    private int value;

    private Link next;

    public Link(String name, int value) {
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

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
