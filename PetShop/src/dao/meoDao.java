package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import bean.meo;

public class meoDao {
	public ArrayList<meo> docFile() throws Exception{
		ArrayList<meo> ds = new ArrayList<meo>();
		FileReader fr = new FileReader("petList.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = "";
		while((line = bf.readLine()) != null) {	
			String[] s = line.split("[,]");
			if(s[3].equals("blue") || s[3].equals("red")) {
				ds.add(new meo(s[0], Integer.parseInt(s[1]), s[2], s[3]));
			}
		}
		bf.close();
		return ds;
	}
}
