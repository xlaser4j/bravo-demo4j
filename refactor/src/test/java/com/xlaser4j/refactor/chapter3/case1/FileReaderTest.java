package com.xlaser4j.refactor.chapter3.case1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @package: com.xlaser4j.refactor.chapter3.case1
 * @author: Elijah.D
 * @time: 2020/3/19 15:02
 * @description:
 * @modified: Elijah.D
 */
public class FileReaderTest {
    public static FileReader input;

    @Before
    public void setup() throws FileNotFoundException {
        input = new FileReader("src/test/resources/data.txt");
    }

    @After
    public void teardown() throws IOException {
        input.close();
    }

    @Test
    public void testRead() throws IOException {
        char ch = '&';
        for (int i = 0; i < 4; i++) {
            ch = ((char)input.read());
        }
        Assert.assertEquals('d', ch);
    }

    @Test
    public void testReadEnd() throws IOException {
        char ch = '&';
        for (int i = 0; i < 24 * 4 + 3 * 2; i++) {
            ch = ((char)input.read());
        }
        Assert.assertEquals("Read Last Char", '6', ch);
        Assert.assertEquals("Read End", -1, input.read());
    }
}
