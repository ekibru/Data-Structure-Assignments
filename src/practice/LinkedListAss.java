package practice;

import java.util.Iterator;

public class LinkedListAss <E>implements Iterable<E>{
    private static class Node<E> {


        private E data;

        private Node<E> next = null;


        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }


        public Node(E data) {
            this(data, null);
        }
    }


    private Node<E> head = null;

    private int size = 0;


    private void addFirst(E item) {
        head = new Node<E>(item, head);
        size++;
    }


    private void addAfter(Node<E> node, E item) {
        node.next = new Node<E>(item, node.next);
        size++;
    }


    private E removeFirst() {
        Node<E> temp = head;
        if (head != null) {
            head = head.next;
        }
        if (temp != null) {
            size--;
            return temp.data;
        } else { // list is empty
            return null;
        }
    }


    private E removeAfter(Node<E> node) {
        Node<E> temp = node.next;
        if (temp != null) {
            node.next = temp.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }


    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }


    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        return node.data;
    }


    public E set(int index, E newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        E result = node.data;
        node.data = newValue;
        return result;
    }


    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> node = getNode(index - 1);
            addAfter(node, item);
        }
    }


    public boolean addLast(E item) {
        add(size, item);
        return true;
    }


    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> removedNode = null;
        if (index == 0) {
            return removeFirst();
        } else {
            Node<E> node = getNode(index - 1);
            return removeAfter(node);
        }
    }

    int size() {
        return size;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node p = head;
        if (p != null) {
            while (p.next != null) {
                sb.append(p.data.toString());
                sb.append(" ==> ");
                p = p.next;
            }
            sb.append(p.data.toString());
        }
        sb.append("]");
        return sb.toString();
    }


    public boolean removeItem(E item) {
        if (head == null) {
            return false;
        }
        Node<E> current = head;
        if (item.equals(current.data)) {
            removeFirst();
            return true;
        }
        while (current.next != null) {
            if (item.equals(current.next.data)) {
                removeAfter(current);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void addBeforeItem(E bitem, E item) {

        if (head == null)
            return;
        if (head.data.equals(bitem)) {
            addFirst(item);
            return;

        }
        Node<E> prev = null;
        Node<E> cur = head;

        while (cur != null && !cur.data.equals(bitem)) {
            prev = cur;
            cur = cur.next;
        }
        // insert between cur and prev
        if (cur != null)
            prev.next = new Node<E>(item, cur);
        size++;

    }

    public void addBeforeIndex(int index, E item) {
        if (index < 0) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            head = new Node(item, head);
            size++;
        } else {
            int i = index;
            Node<E> current = head;
            while (current != null && --i > 0) {
                current = current.next;
            }
            if (i == 0) {
                current.next = new Node(item, current.next);
                size++;
            } else {
                throw new IndexOutOfBoundsException(Integer.toString(index));
            }
        }
    }



    public void removeAllOf(Integer target) {
        Iterator iterator=iterator();

        while(iterator.hasNext()) {

            if(iterator.next() == target) {

                iterator.remove();


            }
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new myIterator<E>();
    }


    class myIterator<T> implements Iterator<T>{
        //public myIterator() {}


        public myIterator() {

        }
        int index = 0;
        @Override
        public boolean hasNext() {
            return (index < size);
        }
        @Override
        public T next() {
            T item =(T) get(index);
            index++;
            return item;
        }
        @Override
        public void remove() {
            T item =(T) get(index-1);

            removeItem((E) item);
            removeItem((E) item);


        }


    }
    public static void main(String args[]) {
        LinkedListAss<Integer> test = new LinkedListAss();

        test.addFirst(10);
        test.addFirst(20);
        System.out.println(test);
        Node x = test.getNode(0);
        test.addAfter(x, 15);
        System.out.println(test + " Size is :" + test.size());
        System.out.println("Removed First Item : " + test.removeFirst());
        System.out.println(test + " Size is :" + test.size());
        x = test.getNode(0);
        test.removeAfter(x);
        System.out.println(test + " Size is :" + test.size());
        System.out.println("Value at the index 0 : " + test.get(0));
        // Modify the index Zero value as 25
        test.set(0, 25);
        System.out.println(test + " Size is :" + test.size());
        test.addFirst(30);
        test.addFirst(30);
        test.addFirst(30);
        test.addFirst(30);
        test.addFirst(40);
        test.addFirst(50);
        test.addLast(10);
        test.addBeforeIndex(2, 35);
        test.addBeforeItem(50,60);
        test.addBeforeItem(40,45);
        System.out.println(test + " Size is :" + test.size());
        System.out.println("Remove value at index 1 : " + test.remove(1));
        System.out.println("Remove value 50 : " + test.removeItem(10));
        System.out.println(test + " Size is :" + test.size());

        // myIterator<T> it = new myIterator<>()


        //test.removeAllOf(40);
        Iterator iterator=test.iterator();
        System.out.println("before removal "+test);
        test.removeAllOf(30);
        System.out.println("after removal "+test);

    }

}
