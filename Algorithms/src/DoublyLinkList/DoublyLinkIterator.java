package DoublyLinkList;

public class DoublyLinkIterator {

    DoublyLink currentLink;
    DoublyLink previousLink;

    DoubleEndedLinkedList doubleEndedLinkedList;

    public DoublyLinkIterator(DoubleEndedLinkedList doubleEndedLinkedList) {
        this.doubleEndedLinkedList = doubleEndedLinkedList;
        currentLink = doubleEndedLinkedList.firstLink;
        previousLink = doubleEndedLinkedList.lastLink;
    }

    public boolean hasNext(){
        return (currentLink.next!=null);
    }

    public DoublyLink next(){
        if (hasNext()){
            previousLink = currentLink;
            currentLink = currentLink.next;
            return currentLink;
        }
        return null;
    }

    public void remove(){
        if (previousLink == null)
            doubleEndedLinkedList.firstLink = currentLink.next;
        else{
            previousLink.next = currentLink.next;
            if (currentLink.next == null){
                currentLink = doubleEndedLinkedList.firstLink;
                previousLink = null;
            }
            else {
                currentLink = currentLink.next;
            }
        }
    }

}
