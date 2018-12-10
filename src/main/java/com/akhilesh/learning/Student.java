package com.akhilesh.learning;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {
    private String name;
    private String emailId;

    public Student() {}

    public Student(final String name, final String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setEmailId(final String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void writeExternal(final ObjectOutput out) throws IOException {
        out.writeObject(this.getName());
        out.writeObject(this.getEmailId());
    }

    public void readExternal(final ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String) in.readObject();
        this.emailId = (String) in.readObject();
    }

    public String toString() {
        return String.format("Name: %s, Email: %s", this.getName(), this.getEmailId());
    }
}
