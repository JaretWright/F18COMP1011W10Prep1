import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegexExample {
    public static void main(String[] args)
    {
        ArrayList<String> yinggeList = new ArrayList<>();

        for (int i=0; i<=25; i++)
        {
            int asciiLetterValue = 97+i;
            char asciiLetter = (char) asciiLetterValue;
            String letter = Character.toString(asciiLetter);
            yinggeList.add(letter);
            yinggeList.add(letter+letter);
            yinggeList.add(letter+letter+letter);
        }

        HashSet<String> justALetter = new HashSet<>();

        for (String string: yinggeList)
            justALetter.add(Character.toString(string.charAt(0)));

        System.out.println(yinggeList);
        System.out.println(justALetter);

    }
}
