package jasperclient;

/**
 * Created with IntelliJ IDEA.
 * User: cscarioni
 * Date: 03/11/2013
 * Time: 13:42
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private final String name;
    private final String lastName;

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
