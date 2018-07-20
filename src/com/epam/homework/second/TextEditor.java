package com.epam.homework.second;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

public class TextEditor {
    //A8
    public String removeTextBetweenSymbols (String text, char leftSymb, char rightSymb){
        Pattern p = Pattern.compile(text);
        return null;
    }
    
    //A2
    public String swapSymbolsToTheirNumbers (String text, Locale lang){
	final Integer deltaUnicodeEN = 96;
	final Integer deltaUnicodeRU = 1071;
	final String patternEN = "[a-z]";
	final String patternRU = "[а-я]";
        final String EMPTY_STRING = " ";

        StringBuilder result = new StringBuilder();
        Pattern p;
        int currentDelta;
        if(lang.equals(new Locale("ru"))){
            currentDelta = deltaUnicodeRU;
            p = Pattern.compile(patternRU);
        } else if(lang.equals(Locale.ENGLISH)||lang.equals(Locale.UK)){
		currentDelta = deltaUnicodeEN;
            p = Pattern.compile(patternEN);
        } else {
            return text;
        }
        text = text.toLowerCase(lang);
        for(String c : text.split(EMPTY_STRING)){
            if(p.matcher(c).find()) {
                result.append(((int)c.charAt(0))-currentDelta).append(" ");
            } else {
                result.append(c).append(" ");
            }
        }
        return result.toString();
    }
    
    //B13,B9
    public String sortWordsThatIncludesSymbol(String text, char symbol){
        String words[] = text.split(" ");
        Arrays.sort(words);
        Pattern p = Pattern.compile(String.valueOf(symbol));
        Arrays.sort(words, (String o1, String o2) -> {
            long counter1 = o1.chars().filter(ch -> ch==symbol).count();
            long counter2 = o2.chars().filter(ch -> ch==symbol).count();
            if(counter1>counter2) {
                return -1;
            } else if(counter1<counter2) {
                return 1;
            } else {
                return 0;
            } 
        });
        return Arrays.toString(words);
    }
    
    //C12,c13
    public String transformByBurrowsWheeler (String text){
        String cycleShiftWords[] = new String[text.length()];
        cycleShiftWords[0] = text;
        for(int i = 1; i<cycleShiftWords.length; i++){
            cycleShiftWords[i] = cycleShiftWords[i-1].substring(1)
                                 + cycleShiftWords[i-1].charAt(0);
        }
        Arrays.sort(cycleShiftWords);
        StringBuilder result = new StringBuilder();
        for(String word: cycleShiftWords){
            result.append(word.charAt(word.length()-1));
        }
        return result.toString();
    }
}