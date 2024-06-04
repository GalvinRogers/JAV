package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import bean.DTCD;

public class dtcdDao {
	public ArrayList<DTCD> docFile() throws Exception{
		ArrayList<DTCD> ds = new ArrayList<DTCD>();
		FileReader fr = new FileReader("dt.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = "";
		while((line = bf.readLine()) != null) {
			String[] s = line.split("[,]");
			if(s[0].equals("CD0001") || s[0].equals("CD0003")) {
				ds.add(new DTCD(s[0], s[1], s[2], Integer.parseInt(s[3]), s[4]));
			}
		}
		bf.close();
		return ds;
	}
}
