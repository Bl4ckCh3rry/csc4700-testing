/**
 * Created by jdob on 2/22/15.
 */

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import csc4700.FileReaderDemo;

public class FileReadersDemoTests {

    private String filename;

    @Before
    public void createTempFile() throws IOException {
        File tempFile = File.createTempFile("FileReadersDemoTests", "");
        this.filename = tempFile.getAbsolutePath();

        BufferedWriter bw = new BufferedWriter(new FileWriter(this.filename));
        bw.write("Test Data");
        bw.close();
    }

    @After
    public void deleteTempFile() {
        File f = new File(this.filename);
        f.delete();
    }

    @Test
    public void testReadFile() throws IOException {
        // Setup
        FileReaderDemo frd = new FileReaderDemo(this.filename);

        // Test
        String contents = frd.readContents();

        // Verify
        assertEquals("Test Data", contents);
    }

    @Test
    public void testReadFileFakeFile() throws IOException {
        // Setup
        FileReaderDemo frd = new FileReaderDemo("foo.txt");

        // Test
        String contents = frd.readContents();

        // Verify
        assertEquals(null, contents);
    }

}
