package com.akhilesh.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

public class ExtTest {

    @Test
    public void test1() throws IOException, ClassNotFoundException {
        Student s = new Student("Akhilesh", "Tyagi");
        File t = Files.createTempFile("any", "txt").toFile();
        t.deleteOnExit();
        s.writeExternal(new ObjectOutputStream(new FileOutputStream(t)));
        ObjectInput input = new ObjectInputStream(new FileInputStream(t));
        Student s1 = new Student();
        s1.readExternal(input);
        Assertions.assertEquals(s.toString(), s1.toString());
    }
}
