package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class MyFilePart2 
{

	public static void main(String[] args) 
	{
		File textFile;
		Scanner input = new Scanner(System.in);
		String response;
		
		textFile = new File("C:\\Users\\39046001\\git\\CS30P2\\Chapter11\\src\\SkillBuilders\\zzz.txt");
		
		if(textFile.exists())
		{
			System.out.println("zzz.txt file exists.");
		}
		else
		{
			try
			{
				textFile.createNewFile();
				System.out.println("zzz.txt file has been created.");
			}
			catch (IOException e) 
			{
				System.out.println("File could not be created.");
				System.out.println("IOException: " + e.getMessage());
			}
		}
	}
}