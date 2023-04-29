package com.Brax.Testing;

import com.Brax.Model.Model_FileSystem;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class Model_FileSystemTest {
    Model_FileSystem fs = new Model_FileSystem();
    /**
     * testFileExist() checks whether the file exists or is it just a directory.
     * The FileSystem class consists a String variable which contains the file to the
     * record.csv file.
     * The csv file will be added to the newly created File object and check
     * if the file exists and if it is just a directory.
     */
    @Test
    public void testFileExist() {

        String filePath = fs.getM_RecordFilePath();

        File file = new File(filePath);

        assertEquals(file.exists(),true);

        assertEquals(file.isDirectory(),false);

    }

}