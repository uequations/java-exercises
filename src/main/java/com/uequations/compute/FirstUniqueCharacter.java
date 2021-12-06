package com.uequations.compute;

import java.util.function.Function;

public class FirstUniqueCharacter implements Function<String,Integer> {

    @Override
    public Integer apply(String s) {

        char[] charArray = s.toCharArray();
        int indexOfFirstUnique = -1;

        for (char letter : charArray) {

            int thisCharacterIndex = s.indexOf(letter);

            if (thisCharacterIndex == s.lastIndexOf(letter)){
                indexOfFirstUnique = thisCharacterIndex;
                break;
            } else {
                System.out.println(letter + " is not unique in " + s + ".");
            }
        }

        return indexOfFirstUnique;
    }
}
