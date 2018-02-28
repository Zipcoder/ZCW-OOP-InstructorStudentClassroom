package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void add() {
        //Given
        People people = new People();
        ArrayList<Person> temp = new ArrayList<Person>();
        Person person1 = new Person(99999);
        Person person2 = new Person(3333);


        //When
        temp.add(person1);
        temp.add(person2);
        int expected = 2;
        int actual = temp.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findById() {
        //Given
        People people = new People();
        ArrayList<Person> temp = new ArrayList<Person>();
        Person person1 = new Student(111);
        Person person2 = new Student(222);
        Person person3 = new Student(333);

        //When
        people.add(person1);
        people.add(person2);
        people.add(person3);

        Person expected = person2;
        Person  actual = people.findById(222);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        //Given
        People people = new People();
        ArrayList<Person> temp = new ArrayList<Person>();
        Person person1 = new Student(111);
        Person person2 = new Student(222);
        Person person3 = new Student(333);

        //When
        people.add(person1);
        people.add(person2);
        people.add(person3);

        people.remove(person2);

        int expected = 2;
        int  actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }
}