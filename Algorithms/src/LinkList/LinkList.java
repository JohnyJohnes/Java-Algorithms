package LinkList;

public class LinkList {

    private Link firstLink;

    public boolean isEmpty(){
        return (firstLink==null);
    }

    public void insertFirstLink(String name, int value){
        Link newLink = new Link(name,value);
        newLink.setNext(firstLink);
        firstLink = newLink;
    }

    public Link removeFirstLink(){
        Link linkRemoved = firstLink;

        if (!isEmpty())
            firstLink = firstLink.getNext();
        else
            System.out.println("Empty linkedList");
        return linkRemoved;
    }

    public void display(){
        Link tempLink = firstLink;
        while (!isEmpty() && (tempLink!=null)){
            tempLink.display();

            System.out.println("Next Link: "+tempLink.getNext()+ "\n");
            tempLink=tempLink.getNext();
        }
    }

     public Link find(String name){
        Link tempLink = firstLink;
        if (!isEmpty()){
            while (!tempLink.getName().equals(name)){
                if (tempLink.getNext()==null)
                    return null;
                else
                    tempLink = tempLink.getNext();
            }
        }
        else
            System.out.println("Empty");
        return tempLink;
     }

     public Link removeLink(String name){
        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while (!currentLink.getName().equals(name)){
            if(currentLink.getNext()==null)
                return null;
            else {
                previousLink = currentLink;
                currentLink  = currentLink.getNext();
            }
        }
        if (currentLink == firstLink)
            firstLink = firstLink.getNext();
        else
            previousLink.setNext(currentLink.getNext());
        return currentLink;
     }


    public static void main(String[] args) {

        LinkList theLinkedList = new LinkList();

        // Insert Link and add a reference to the book Link added just prior
        // to the field next

        theLinkedList.insertFirstLink("Don Quixote", 500);
        theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
        theLinkedList.insertFirstLink("The Lord of the Rings", 150);
        theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);

        theLinkedList.display();

        System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");

        // Removes the last Link entered

        theLinkedList.removeFirstLink();

        theLinkedList.display();

        System.out.println(theLinkedList.find("The Lord of the Rings").getName() + " Was Found");

        theLinkedList.removeLink("A Tale of Two Cities");

        System.out.println("\nA Tale of Two Cities Removed\n");

        theLinkedList.display();

    }
}
