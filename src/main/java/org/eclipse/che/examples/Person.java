package org.eclipse.che.examples;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String name){
        this.firstName=name;
    }
    public void setLastName(String name){
        this.lastName=name;
    }
    public void setAge(int age){
        if(age<0 || age>100) this.age = 0;
        else this.age=age;
    }

    public boolean isTeen(){
        return (this.age > 12 && this.age<20);
    }

    public String getFullName(){
        String firstName = (this.firstName == null)? "" : this.firstName;
        String lastName = (this.lastName == null)? "" : this.lastName;
        if(firstName == "" && lastName == "") return "";
        else if (firstName == "") return lastName;
        else if (lastName == "") return firstName;
        else return firstName + " " + lastName;
    }
}