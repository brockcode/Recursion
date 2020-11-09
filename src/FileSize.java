import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileSize {

	/*
	 * 
	 * Directory 
	 * |
	 * | file1 file2 file3 dir1
	 * 						 |
	 * 						 file4 file5 dir2
	 * 									   |
	 * 									   file 6
	 * 
	 * 	 
	 * 
	 * 
	 */
	
	
	
	public static long getSize(File file) {
		long size = 0;
		//if file => getsize
		//if dir => get all of the files, and 
		//	process all of files and dir
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			List<File> xFiles = new LinkedList<>(Arrays.asList(files));
			for(File i : xFiles) {
				size += getSize(i);
			}
		}
			else {
				size += file.length();
			}
		
		return size;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please give me a directory or a file: ");
		String str = input.nextLine();
		System.out.println("The size is: " + getSize(new File(str)));
		
		

	}

}
