package com.basics.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemonstratingOperations 
{
	public void listFilesDirectory()throws IOException
	{
		Path playPath = Paths.get("C:\\Users\\lab\\Desktop\\JAVA\\JAVA Assignments\\EMPLOYEE PAYROLL\\Employee Payroll Service");
		Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::print);
		Files.newDirectoryStream(playPath).forEach(System.out::println);
		Files.newDirectoryStream(playPath,path->path.toFile().isFile() && path.toString().startsWith("temp"));
		
	}
	public static void main(String[] args) throws IOException 
	{
		DemonstratingOperations emp = new DemonstratingOperations();
		emp.listFilesDirectory();
	}

}
