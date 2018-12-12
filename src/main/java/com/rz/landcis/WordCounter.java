package com.rz.landcis;

import org.junit.platform.commons.util.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/*
Write a quick and dirty program (Shell, Python, Perl, Java, Lisp,
   C++, APL, or whatever) to produce a count of all the different
   "words" in a text file.  Use any definition of word that makes
   logical sense or makes your job easy.  The output might look like
   this:

     17 a
     14 the
      9 of
      9 in
      8 com
      7 you
      7 that
      7 energy
      6 to
      ...

   For this input file, the word "a" occured 17 times, "the" 14 times,
   etc.

 */
public class WordCounter {

    public Map<String, Integer> countWords(String fileName) throws Exception {
        Map<String, Integer> counters = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        while (StringUtils.isNotBlank(line) && line != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                Integer counter = counters.get(word);
                if (counter == null) {
                    counter = 1;
                } else {
                    counter = counter + 1;
                }
                counters.put(word, counter);
            }
        }

        return counters;
    }
}
