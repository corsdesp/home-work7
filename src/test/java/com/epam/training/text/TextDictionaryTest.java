package com.epam.training.text;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TextDictionaryTest {
    @Test
    public void dictionaryTest() throws Exception {
        Map<String, Integer> dictionary = new HashMap<>();
        dictionary.put("qwerty", 3);
        dictionary.put("trewq", 1);

        Map<String, Integer> result = new TextDictionary().dictionary("QWERTY: qwerty, trewq- !qWerty!");
        Assert.assertTrue(dictionary.equals(result));
    }
}
