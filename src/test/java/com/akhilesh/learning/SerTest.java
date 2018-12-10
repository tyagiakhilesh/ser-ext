package com.akhilesh.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

public class SerTest {
    @Test
    public void test() throws IOException, ClassNotFoundException {
        Student2 s = new Student2("A", "T");
        File t = Files.createTempFile("s2.temp", "txt").toFile();
        t.deleteOnExit();
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(t));
        os.writeObject(s);
        Student2 s2 = (Student2) new ObjectInputStream(new FileInputStream(t)).readObject();
        Assertions.assertEquals(s2.toString(), s.toString());
    }
}
