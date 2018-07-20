package com.epam.homework;

import com.epam.homework.third.IOLibTasks;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {        
        IOLibTasks io = new IOLibTasks();
        try (FileReader fr = new FileReader("data/matrix.txt")){
            int matrix[][] = io.readMatrixFromFile(fr);
            int nums[][] = io.transposeMatrix(matrix);
            IOLibTasks.printMatrix(nums);
            System.out.println("-----------------------");
            
            int nums2[][] = io.rotateMatrix(matrix, 3);
            IOLibTasks.printMatrix(nums2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
