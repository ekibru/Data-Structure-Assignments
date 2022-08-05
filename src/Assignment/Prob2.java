package Assignment;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Prob2 implements Queue<Admission> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Admission> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Admission admission) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Admission> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(Admission admission) {
        return false;
    }

    @Override
    public Admission remove() {
        return null;
    }

    @Override
    public Admission poll() {
        return null;
    }

    @Override
    public Admission element() {
        return null;
    }

    @Override
    public Admission peek() {
        return null;
    }

    public static void main(String[] args) {
       // Create a Queue object using LinkedList for the class Admission. Admission number generation should be automatic.
        //(Initialize the stating value as 5001 for the first element, then increment by 1 for the next element.
        Queue<Admission> admi = new LinkedList<>();

        admi.add(new Admission("Kidane","123434"));
        admi.add(new Admission("Miky","202734"));
        admi.add(new Admission("Gemechu","2025734"));
        admi.add(new Admission("Gech","202654"));
        admi.add(new Admission("Kelifa","20273467"));

            System.out.println(admi.peek());

        System.out.println(admi.size());


        Iterator<Admission> iterator=admi.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(admi.isEmpty());
        }


}
