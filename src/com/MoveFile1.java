package com;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MoveFile1 {
	public static void main(String[] args) {

        Path movefrom = FileSystems.getDefault().getPath("C:/tutorial/test.zip");
        Path target = FileSystems.getDefault().getPath("d:/tutorial/photos/test.zip");

        //method 1
        try {
           // Files.move(movefrom, target, StandardCopyOption.REPLACE_EXISTING);
            Path path=Files.copy(movefrom, target);
        } catch (IOException e) {
            System.err.println(e);
        }


    }
}
