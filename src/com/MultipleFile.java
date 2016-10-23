package com;

import java.io.File;

public class MultipleFile {
	private static final String SOURCE_FILE_PATH = "C:/sourceFolder/";
public static void main(String[] args) {
	String file=MultipleFile.getPath(SOURCE_FILE_PATH);
	System.out.println(file);
}

public static String getPath(String path){
	File file = new File(path);
	String absolutePath=null;
    if(file!=null && file.exists()){
        File[] listOfFiles = file.listFiles();

        if(listOfFiles!=null){

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                	absolutePath=listOfFiles[i].getAbsolutePath();
                }
            }
        }
    }
	return absolutePath;
}
}
