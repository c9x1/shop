package src;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    public class Element {
        T value;
        Element next;

        Element(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public Element head;

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Element e = head;
            @Override
            public boolean hasNext() {
                return e != null;
            }

            @Override
            public T next() {
                T value = e.value;
                e = e.next;
                return value;
            }
        };
    }

    public void addElement(T value) {
        Element neuElement = new Element(value);

        // wenn noch kein kopf existiert, setze ihn
        // aufs aktuelle element
        if (head == null) {
            head = neuElement;
            return;
        }

        // find das letzte element
        Element e = head;
        while (e.next != null)
            e = e.next;

        // und setzte es ein
        e.next = neuElement;
    }

    public T removeElement(T value) {
        Element neuElement = new Element(value);
        // erstes Element wird gelöscht
        if (value == head.value) {
            Element gzuloeschen = head;
            head = gzuloeschen.next;
            return gzuloeschen.value;
        }

        //vorlaufen bis eins vor dem zu löschenden Element
        Element gericht = head;
        while (gericht.next != null) {
            gericht = gericht.next;
            if (gericht.value == gericht) {
                Element gzuloeschen = gericht;
                gericht = gzuloeschen.next;
                return gzuloeschen.value; // Fehlersuche

            }
            //verlinkung ändern
            Element rem = gericht.next;
            gericht.next = rem.next;
            return rem.value;
        }

        return neuElement.value;
    }

    public int size() {
        if (head == null)
            return 0;

        int count = 0;
        Element e = head;
        while (e.next != null) {
            e = e.next;
            count++;
        }

        return count;
    }
}
