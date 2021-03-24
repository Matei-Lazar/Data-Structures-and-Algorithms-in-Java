package com.company;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);

        ArrayStack stack = new ArrayStack(10);

        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);

        stack.printStack();
    }
}
