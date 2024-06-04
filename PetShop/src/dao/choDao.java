package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import bean.cho;

public class choDao {
	public ArrayList<cho> docFile() throws Exception{
		ArrayList<cho> ds = new ArrayList<cho>();
		FileReader fr = new FileReader("petList.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = "";
		while((line = bf.readLine()) != null) {	
			String[] s = line.split("[,]");
			if(s[3].equals("husky") || s[3].equals("corgi")) {
				ds.add(new cho(s[0], Integer.parseInt(s[1]), s[2], s[3]));
			}
		}
		bf.close();
		return ds;
	}
}
