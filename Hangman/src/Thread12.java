import java.util.ArrayList;

public class Thread12 extends Thread {
	public static String fileName;
	
	public Thread12(){}
	
	public void run(){
		
		for(int i = 0; i <=4; i++){
		ArrayList<String> array = new ArrayList<String>();
		array.addAll(FileHandling.readFile(fileName));
	    ArrayList<String> list = new ArrayList<String>();
	    list = FileHandling.list1;
		list.addAll(array); 
		if(array.size()==200){
			return;
		}
	    	 
	     }
	}

}
