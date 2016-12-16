package c.h.jdbm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.SortedMap;

import static org.junit.Assert.*;

/**
 * Created by jiang on 2016/12/16 0016.
 */
@SuppressWarnings("Duplicates")
public class DBMakerTest {
    @Test
    public void openFile() throws Exception {
        DB db = DBMaker.openFile("hello").make();
        SortedMap<Integer, String> map = db.createTreeMap("hello");
        map.put(1, "1");
        map.put(2, "2");
        assertEquals("1", map.get(1));
    }

    @Test
    public void openZip() throws Exception {

    }

    @Test
    public void isZipFileLocation() throws Exception {

    }

    @Test
    public void enableWeakCache() throws Exception {

    }

    @Test
    public void enableSoftCache() throws Exception {

    }

    @Test
    public void enableHardCache() throws Exception {

    }

    @Test
    public void enableMRUCache() throws Exception {

    }

    @Test
    public void setMRUCacheSize() throws Exception {

    }

    @Test
    public void disableCacheAutoClear() throws Exception {

    }

    @Test
    public void enableEncryption() throws Exception {

    }

    @Test
    public void readonly() throws Exception {

    }

    @Test
    public void disableCache() throws Exception {

    }

    @Test
    public void disableTransactions() throws Exception {

    }

    @Test
    public void disableLocking() throws Exception {

    }

    @Test
    public void useRandomAccessFile() throws Exception {

    }

    @Test
    public void closeOnExit() throws Exception {

    }

    @Test
    public void deleteFilesAfterClose() throws Exception {

    }

    @Test
    public void make() throws Exception {

    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void openMemory() throws Exception {
        DB db = DBMaker.openMemory().make();
        SortedMap<Integer, String> map = db.createTreeMap("hello");
        map.put(1, "1");
        map.put(2, "2");
        assertEquals("1", map.get(1));
    }

}