package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import bean.DTDD;

public class dtddDao {
	public ArrayList<DTDD> docFile() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<DTDD> ds = new ArrayList<DTDD>();
		FileReader fr = new FileReader("dt.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = "";
		while((line = bf.readLine()) != null) {
			String[] s = line.split("[,]");
			if(s[0].equals("DD0002") || s[0].equals("DD0004")) {
				ds.add(new DTDD(s[0], s[1], s[2], Integer.parseInt(s[3]), sdf.parse(s[4]), Integer.parseInt(s[5])));
			}
		}
		bf.close();
		return ds;
	}
}
