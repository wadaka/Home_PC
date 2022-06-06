package run;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Tools {

	public static void Graphic_Creator(String name) throws Exception{
		
		for(int i=0;i<32;i++) {
			System.out.println("");
		}
		
		String file_name =  "src/run/Graphic/"+name +".txt";

		FileInputStream fis =new FileInputStream(file_name);
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);

		String line;
		while((line = br.readLine()) !=null){
			System.out.println(line);
		}
		br.close();
	}
}
