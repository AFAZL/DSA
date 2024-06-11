import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int val) {
        data = val;
        next = null;
    }

}

class linkedlist {
    Node head;
    int length;

    public linkedlist() {
        head = null;
        length = 0;
    }

    public void addhead(int val) {
        Node newnode = new Node(val);
        newnode.next = this.head;

        this.head = newnode;
        this.length += 1;
    }

    public void addtail(int val) {
        Node curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }
        Node newnode = new Node(val);
        curr.next = newnode;
        this.length = this.length + 1;
    }

    public void addposition(int val, int index) {
        if (index < 0 || index > this.length) {
            return;
        }
        Node curr = this.head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        Node newnode = new Node(val);
        newnode.next = curr.next;
        curr.next = newnode;
        this.length += 1;
    }

    public void del(int index) {
        Node curr = this.head;
        if (index < 0 || index > this.length) {
            return;
        }
        if (index == 0) {
            this.head = this.head.next;
            this.length = this.length - 1;
        } else {
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        this.length = this.length - 1;
    }

    public int getbyindex(int index) {
        if (index < 0 || index > this.length) {
            return -1;
        }
        Node curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public void dis() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}

class link {

    public static void main(String[] args) {

        linkedlist obj = new linkedlist();
        obj.addhead(55);
        obj.addhead(51);
        obj.addhead(53);
        obj.addposition(49, 1);
        obj.addhead(50);
        obj.dis();
        System.out.println("****************************");
        obj.del(3);
        obj.dis();
    }
}
