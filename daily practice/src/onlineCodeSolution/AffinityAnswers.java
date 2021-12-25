package onlineCodeSolution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class AffinityAnswers {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f1;
		try {
			f1 = new File("C:\\Users\\HP\\Desktop\\2.txt");
			BufferedReader br = new BufferedReader(new FileReader(f1));

			ArrayList <String> st = null;
			
			while (br.readLine() != null)
			{
				st.add(br.readLine());
			}
			int i=0;
			String[] a=null;
			for(String s:st)
			{
				a=s.split(".");
			}
			
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
		}

	}

}
