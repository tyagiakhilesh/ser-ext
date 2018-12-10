package com.akhilesh.learning;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student2 implements Serializable {
    private String name;
    private String emailId;

    public Student2(final String name, final String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String toString() {
        return String.format("Name: %s, Email: %s", this.getName(), this.getEmailId());
    }

    private void readObject(ObjectInputStream in) {

    }

    private void writeObject(ObjectOutputStream out) {

    }
}
