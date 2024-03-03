package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import src.interfaces.DataStore;
import src.interfaces.DataStoreImpl;
import src.interfaces.FileInputConfig;
import src.interfaces.InputConfig;
import src.interfaces.OutputConfig;
import src.interfaces.FileOutputConfig;
import src.interfaces.WriteResult.WriteResultStatus;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.List;

public class DataStoreTest {
    @Test
    public void smokeTestRead() throws Exception {
        // Now that our implementation is a bit more real, our mock parameter needs to be more real too
        // In this case, it becomes easier to just make a real version
        File file = new File("dataStoreTest.smokeTestRead.txt.temp");
        file.createNewFile();
        file.deleteOnExit();
        InputConfig inputConfig = new FileInputConfig(file.getCanonicalPath());

        DataStore dataStore = new DataStoreImpl();
        Assert.assertEquals(false, dataStore.read(inputConfig).iterator().hasNext());
    }

    @Test
    public void smokeTestWrite() throws Exception {
        // Now that our implementation is a bit more real, our mock parameter needs to be more real too
        // In this case, it becomes easier to just make a real version
        File file = new File("dataStoreTest.smokeTestWrite.txt.temp");
        file.deleteOnExit();
        OutputConfig outputConfig = new FileOutputConfig(file.getCanonicalPath());

        DataStore dataStore = new DataStoreImpl();

        // assertEquals will use .equals, so this type of call is generally safe for any Object, but for enums you can also use ==
        // Note that if your dummy implementation returns null, this will NPE - that's fine! As long as the test fails,
        // the exact failure doesn't matter
        Assert.assertEquals(WriteResultStatus.SUCCESS, dataStore.appendSingleResult(outputConfig, "result", ';').getStatus());
    }

    @Test
    public void testAppend() throws Exception {
        // Add tests to verify that our append logic is in fact appending
        File file = new File("dataStoreTest.testAppend.txt.temp");
        file.deleteOnExit();
        OutputConfig outputConfig = new FileOutputConfig(file.getCanonicalPath());

        DataStore dataStore = new DataStoreImpl();

        Assert.assertEquals(WriteResultStatus.SUCCESS, dataStore.appendSingleResult(outputConfig, "result1", ';').getStatus());
        Assert.assertEquals(WriteResultStatus.SUCCESS, dataStore.appendSingleResult(outputConfig, "result2", ';').getStatus());

        String expected = "result1;result2;";
        List<String> allLines = Files.readAllLines(file.toPath());

        // it's good to check all assumptions about the output - this increases the value of the test,
        // and makes any failures more informative
        Assert.assertEquals(1, allLines.size());
        Assert.assertEquals(expected, allLines.get(0));
    }

    @Test
    public void testRead() throws Exception {
        // Now that our implementation is a bit more real, our mock parameter needs to be more real too
        // In this case, it becomes easier to just make a real version
        File file = new File("dataStoreTest.testRead.txt.temp");
        file.createNewFile();
        file.deleteOnExit();
        FileWriter writer = new FileWriter(file, true);
        writer.append("1\n");
        writer.append("2\n");
        writer.close();

        InputConfig inputConfig = new FileInputConfig(file.getCanonicalPath());

        DataStore dataStore = new DataStoreImpl();
        Iterator<Integer> iterator = dataStore.read(inputConfig).iterator();
        Assert.assertEquals(true, iterator.hasNext());
        Assert.assertEquals(1, iterator.next().intValue());
        Assert.assertEquals(true, iterator.hasNext());
        Assert.assertEquals(2, iterator.next().intValue());
        Assert.assertEquals(false, iterator.hasNext());
    }
}
