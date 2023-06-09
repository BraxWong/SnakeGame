package com.Brax.Testing;

import com.Brax.Controller.Controller_FileSystem;
import com.Brax.Model.Model_LeaderboardEntry;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class Controller_FileSystemTest {
    Controller_FileSystem m_FileSys = new Controller_FileSystem();

    /**
     * checkVectorSize() checks the size of the vector.
     * The FileSystem class contains a method called readFile(),
     * which reads the record.csv file and stores the value and return them
     * as a vector of LeaderboardEntry objects.
     * This test will check if the size of the vector is null.
     * @throws FileNotFoundException
     */

    @Test
    public void checkVectorSize() throws FileNotFoundException {

        Vector<Model_LeaderboardEntry> vectorOfEntries = m_FileSys.readFile();

        assertNotEquals(vectorOfEntries.size(),(Integer) null);

    }


    /**
     * checkDataValidity() will first obtain a vector of Model_LeaderboardEntry
     * objects. Then it will run a for loop until it hits the size of the
     * vector. It will check whether the first value of Model_LeaderboardEntry
     * is a String and the second value is an Int. If so, check1
     * will be true. Else the test will fail since check1 will be false.
     * @throws FileNotFoundException
     */

    @Test
    public void checkDataValidity() throws FileNotFoundException {
        Vector<Model_LeaderboardEntry> vectorOfEntries = m_FileSys.readFile();
        Boolean check1;
        for(int i = 0; i < vectorOfEntries.size(); ++i) {
            Model_LeaderboardEntry le = vectorOfEntries.get(i);
            if(le.getM_PlayerName() instanceof String) {
                check1 = true;
            }
            else {
                check1 = false;
            }
            if(le.getM_Score() == (int)le.getM_Score()){
                check1 = true;
            }
            else {
                check1 = false;
            }
            assertEquals(check1,true);
        }
    }

}