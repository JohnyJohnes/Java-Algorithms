package DoublyLinkList;

public class DoubleEndedLinkedList {

    DoublyLink firstLink;
    DoublyLink lastLink;


    public boolean isEmpty(){
        return firstLink==null;
    }

    public void insertInFirstPosition(String name, int value){
        DoublyLink newLink = new DoublyLink(name,value);
        if (isEmpty())
            lastLink = newLink;
        else {
            firstLink.previous = newLink;
        }
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public void insertInLastPosition(String name,int value){
        DoublyLink newLink = new DoublyLink(name,value);

        if (isEmpty())
            firstLink = newLink;
        else{
            lastLink.next = newLink;
            newLink.previous = lastLink;
        }
        lastLink = newLink;
    }

    public boolean insertAfterKey(String name,int value, int key){
        DoublyLink newLink = new DoublyLink(name,value);
        DoublyLink tempLink = firstLink;
        if (isEmpty())
            return false;
        while(tempLink.value!=key){
            tempLink=tempLink.next;
            if (tempLink.next==null){
                return false;
            }
        }

        if (tempLink  == lastLink){
            newLink.next=null;
            lastLink = newLink;
        }
        else {
            newLink.next = tempLink.next;
            tempLink.next.previous = newLink;
        }
        newLink.previous = tempLink;
        tempLink.next=newLink;

        return true;
    }

    public void insertInOrder(String name,int value, int key){
        DoublyLink newLink = new DoublyLink(name,value);
        DoublyLink currentLink = firstLink;
        DoublyLink previousLink = null;

        while ((currentLink!= null)&&(key>currentLink.value)){
            previousLink = currentLink;
            currentLink = currentLink.next;
        }

        if (previousLink == null){
            firstLink = newLink;
        }
        else {
            previousLink.next = newLink;
        }
        newLink.next = currentLink;
    }
}
