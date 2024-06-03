package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import bean.khachHangDT;

public class khDao {
	public ArrayList<String> docFile() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<String> ds = new ArrayList<String>();
		FileReader fr = new FileReader("khachhang.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = "";
		while((line = bf.readLine())!= null) {
			String[] s = line.split("[,]");
			if(s[0].equals("DT") || s[0].equals("IN")) {
				ds.add(line);
			}
		}
		bf.close();
		return ds;
	}
}
