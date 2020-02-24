package ADT;


import Person.Person;

public interface ADT<E> {
    void add(Person data);

    void remove(Person data);

    Person search(String firstName);

    void print();
}
