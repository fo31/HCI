import java.io.*;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.FileReader; 
import java.io.BufferedReader;


public class FileHandling implements Serializable{
	public static ArrayList<String> list1 = new ArrayList<String>();
	public static void main(String[] arguments){
		//rParallel();
		System.out.println(list1);
	}
	public static void sequence(){
		List<String> listA = readFile("file1.txt");
		List<String> listB = readFile("file2.txt");
		List<String> listC = readFile("file3.txt");
		List<String> listD = readFile("file4.txt");
		list1.addAll(listA);
		list1.addAll(listB);
		list1.addAll(listC);
		list1.addAll(listD);
	}
	public static void forParallel(){
			for(int i = 1; i <=4; i++){
				Thread12.fileName = "file"+i+".txt";
				Thread a = new Thread12(); 
				new Thread(a).start();
			}
			
			try{
				Thread.sleep(100);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	
	public static ArrayList<String> readFile(String fileName) {
		Path path = FileSystems.getDefault().getPath("/s_home/fo31/YEAR 2/HCI/Files", fileName);
		ArrayList<String> lines=new ArrayList<String>(); 
		try 
		{
		BufferedReader fileReader= Files.newBufferedReader(path);
		for(String a;(a=fileReader.readLine()) !=null;)
		{
        lines.add(a);
		}
		fileReader.close();
		
		}
	
		catch(IOException ex)
		{
		   System.out.println("something is wrong: " + ex.getMessage());
		
		}
		
		
		
		// lines;
		int min = 0;
		int max = lines.size();
		max -=1;
		Random r = new Random();
		
		ArrayList<String> first50 = new ArrayList<String>();
		
		for(int i = 0; i <50; i++){
			int n = r.nextInt(max) + min;
			first50.add(lines.get(n));
		}
		return first50;
	}
	
	public static void serialing(String fileName ,ArrayList<String> allFour ){
		Path p = FileSystems.getDefault().getPath("/s_home/fo31/YEAR 2/HCI/Files", fileName);
		try{
			ObjectOutputStream objectStream=new ObjectOutputStream(Files.newOutputStream(p));
			objectStream.writeObject(allFour);
		}catch(IOException exception){
			System.out.println("something has gone wrong");
			exception.printStackTrace();
		}
	}
}


      