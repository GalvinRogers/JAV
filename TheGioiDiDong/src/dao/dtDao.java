package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import bean.DT;

public class dtDao {
	public ArrayList<String> docFile() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<String> ds = new ArrayList<String>();
		FileReader fr = new FileReader("dt.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = "";
		while((line = bf.readLine()) != null) {
			String[] s = line.split("[,]");
			if(s[0].equals("CD0001") || s[0].equals("CD0003") || s[0].equals("DD0002") || s[0].equals("DD0004")) {
				ds.add(line);
			}
		}
		bf.close();
		return ds;
	}
}
