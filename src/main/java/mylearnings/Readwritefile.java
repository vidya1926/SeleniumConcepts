package mylearnings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readwritefile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "./data/howdy.txt";
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null){
		    //process the line
		    System.out.println(line);
		}		
		
		FileWriter writer = new FileWriter(fileName, true);
		writer.write("\r\n"); // write new line

		writer.write("Hello World");
		writer.write("\r\n"); // write new line
		writer.write("Good Bye!");
		writer.close();
	
		/*
		 * FileWriter fw = new FileWriter(fileName); BufferedWriter bw = new
		 * BufferedWriter(fw); bw.write("Amazon Indis Private Limited"); bw.newLine();
		 * bw.write("TestLeaf Solutions Private Limited"); bw.close();
		 */
	

}}
