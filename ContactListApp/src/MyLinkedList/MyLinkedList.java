package MyLinkedList;

import Node.Node;
import Person.Person;

public class MyLinkedList
{
    Person person;
    private Node head ;
    private Node tail;

    public void addLast(Person person)
    {
        Node node = new Node(person);
        if(isempty())
        {
            head=node;
            tail=node;
        }
        else
        {
            tail.setNext(node);
            tail=node;
        }
    }

    private boolean isempty() {
        boolean response = false;
        if(head==null)
        {
            response=true;
        }
        return response;
    }
    public void addFirst(Person person) {
        Node node = new Node(person);
        if (isempty()) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            tail = node;
        }
    }

}
