package Assignment;



public class Linked<E>{
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E item) {
            this.data = item;
            this.next = null;
        }

        public Node(E item, Node<E> nodeRef) {
            this.data = item;
            this.next = nodeRef;
        }
    }

    // Outer class data Member
    private Node<E> head = null;
    private int size = 0;

    public void addfirst(E item) {
        Node<E> temp = new Node<>(item, head);
        head = temp;
        size++;
    }

    private void addafter(E item, Node<E> node) {
        Node<E> temp = new Node<>(item, node.next);
        node.next = temp;
        size++;
    }

    private E removeAfter(Node<E> node) {
        Node<E> tRemove = node.next;
        if (tRemove != null) {
            node.next = tRemove;
            size--;
            return tRemove.data;
        } else
            return null;
    }

    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }

    private E removeFirst() {
        Node<E> tRemove = head;
        if (tRemove != null) {
            head = head.next;
            size--;
            return tRemove.data;
        } else
            return null;

    }

    public void add(int index, E item) {
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();
        if (index == 0) {
            addfirst(item);
        } else {
            Node<E> node = getNode(index - 1);
            addafter(item, node);
        }
    }

    public void add(E item) {
        add(size, item);
    }

    public int size() {
        return this.size;
    }

    public void traverse() {
        Node<E> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node<E> node = getNode(index);
        return node.data;
    }

    public boolean removeItemB(E item) {
        if (head == null)
            return false;
        Node<E> current = head;
        if (current.data.equals(item)) {
            removeAfter(current);
            return true;
        }

        while (current.next != null) {
            if (item.equals(item)) {
                removeAfter(current);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Q1
    public E removeItem(E item) {
        if (head == null)
            return null;
        Node<E> current = head;
        if (current.data.equals(item)) {

            return removeAfter(current);
        }

        while (current.next != null) {
            if (current.equals(item)) {

                return removeAfter(current);
            }
            current = current.next;
        }
        return null;
    }
    private boolean search(Node head, E item) {
        if (head == null)
            return false;
        if (head.data == item)
            return true;
        else
            return search(head.next, item);
    }
    public boolean search(E item) {
        return search(head, item);
    }

    public static void main(String[] args) {
        Linked<Integer> num = new Linked<>();
        num.add(10);
        num.add(90);
        num.add(20);
        num.add(30);
        System.out.println(num);
        num.search(10);
        //num.search(num.head,3);
    }

}
