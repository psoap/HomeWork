package com.epam.homework.third;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOLibTasks {
    private static String getStringFromFileReader(FileReader fileReader, int bufferLenght) throws IOException{
        char buff[] = new char[bufferLenght];
        fileReader.read(buff);
        return new String(buff);
    }
    
    /*A4 
    Найти и вывести слова текста, для которых последняя буква одного слова
    совпадает с первой буквой следующего слова.
    */
    public String wordLastCharEqualsNextWordFirstChar(FileReader fileReader) throws IOException{
        final String PATTERN = " ";
        final int BUFFER_SIZE = 1024;
        String text = getStringFromFileReader(fileReader, BUFFER_SIZE);
        String words[] = text.split(PATTERN);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<words.length-1; i++ ){
            if(words[i].charAt(words[i].length()-1) == words[i+1].charAt(0)){
                result.append(words[i]).append("-").append(words[i+1]).append(" | ");
            }
        }
        return result.toString();
    }
    
    /*A5
    Найти в строке наибольшее число цифр, идущих подряд.
    */
    public String maxLenghtNumberInText(FileReader fileReader) throws IOException{
        final int BUFFER_SIZE = 1024;
        String text = getStringFromFileReader(fileReader, BUFFER_SIZE);
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(text);
        String result = "";
        int currentMaxLenght = 0;
        while (m.find()) {   
            String buff = m.group();
            if(currentMaxLenght<buff.length()){
                result = buff;
                currentMaxLenght = buff.length();
            }
        }
        return result;
    }
    
    //C14,C15
    public int[][] readMatrixFromFile(FileReader fileReader) throws IOException{
        final int BUFFER_SIZE = 1024;
        String data = getStringFromFileReader(fileReader, BUFFER_SIZE);
        final String PATTERN = "["+System.getProperty("line.separator")+",\\s]+";
        String numsStr[]= data.trim().split(PATTERN);
        int nums[][] = new int[(int)Math.sqrt(numsStr.length)][];
        for(int i = 0; i<nums.length; i++){
            nums[i] = new int[nums.length];
            for(int j = 0; j<nums.length; j++){
                nums[i][j] = Integer.parseInt(numsStr[i*nums.length+j]);
            }
        }
        return nums;
    }
    
    /*C14
    Входной файл содержит совокупность строк. Строка файла содержит строку
    квадратной матрицы. Ввести матрицу в двумерный массив (размер матрицы
    найти). Вывести исходную матрицу и результат ее транспонирования.
    */
    public int[][] transposeMatrix(int matrix[][]){
        int result[][] = new int[matrix[0].length][];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(result[j] == null) result[j] = new int[matrix.length];
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    
    /*C15
    Входной файл хранит квадратную матрицу по принципу: строка представляет
    собой число. Определить размерность. Построить 2-мерный массив,
    содержащий матрицу. Вывести исходную матрицу и результат ее поворота
    на 90˚ по часовой стрелке.
    */
    public int[][] rotateMatrix(int matrix[][], int rotate){
        int result[][];
        if(rotate > 0){
            if(rotate > 3) {
                rotate %= 4;
            }
            result = new int[matrix[0].length][matrix.length];
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    result[j][(matrix.length-1)- i] = matrix[i][j]; 
                }
            }
            result = rotateMatrix(result, --rotate);
        } else {
            result = matrix;
        }
        return result;
    }
    
    public static void printMatrix(int matrix[][]){
        for(int i[]:matrix){
            for(int j:i)
                System.out.print(j+" ");
            System.out.println("");
        }
    }
}