package src;

import java.util.Iterator;
import java.util.Stack;

public class Baum<T extends Comparable<T>> implements Iterable<T> {
    public class Element {
        T value;
        Element left;
        Element right;

        Element(T value) {
            this.value = value;
        }
    }

    public class BaumIterator implements Iterator<T>
    {
        private Stack<Element> stack;

        public BaumIterator()
        {
            stack = new Stack<Element>();
            Element e = head;
            // Füge zuallererst nur die linken elemente hinzu.
            while (e != null) {
                stack.push(e);
                e = e.left;
            }
        }

        @Override
        public boolean hasNext()
        {
            return !stack.isEmpty();
        }

        @Override
        public T next()
        {
            Element e = stack.pop();
            T value = e.value;
            if (e.right != null) {
                e = e.right;
                // Tiefenabstieg nach links
                while (e != null) {
                    stack.push(e);
                    e = e.left;
                }
            }
            return value;
        }
    }

    private Element head;

    @Override
    public Iterator<T> iterator() {
        return new BaumIterator();
    }

    public void addElement(T value)
    {
        // wenn noch kein kopf existiert, erstelle ihn
        if (head == null)
        {
            head = new Element(value);
            return;
        }

        Element e = head;
        while (e != null) {
            int wert = value.compareTo(e.value);
            if (wert == 0) {
                return;
            }
            // linker ast
            else if (wert < 0) {
                if (e.left == null) {
                    e.left = new Element(value);
                    return;
                } else {
                    e = e.left;
                }
                // rechter ast
            } else {
                if (e.right == null) {
                    e.right = new Element(value);
                    return;
                } else {
                    e = e.right;
                }
            }
        }
    }

    public void RekursiveIter(Element e, int wert)
    {
        if(head !=  null) {
            RekursiveIter(head.left, wert);
            wert++;
            RekursiveIter(head.right, wert);
        }
    }

    public int size()
    {
        int count = 0;
        RekursiveIter(head, count);
        return count;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        Iterator<T> it = iterator();
        while (it.hasNext()) {
            builder.append(it.next());
        }

        return builder.toString();
    }
}
