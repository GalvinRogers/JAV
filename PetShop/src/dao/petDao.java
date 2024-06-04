package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class petDao {
	public ArrayList<String> docFile() throws Exception{
		ArrayList<String> pl = new ArrayList<String>();
		FileReader fr = new FileReader("petList.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = "";
		while((line = bf.readLine()) != null) {
			String[] s = line.split("[,]");
			if(s[3].equals("husky") || s[3].equals("corgi") || s[3].equals("red") || s[3].equals("blue")) {
				pl.add(line);
			}
		}
		bf.close();
		return pl;
	}
}

//Hank,3,SG,husky
//Tom,4,HN,red
//Mina,5,DN,blue
//Bo,2,HN,corgi
