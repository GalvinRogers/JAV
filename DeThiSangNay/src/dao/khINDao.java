package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import bean.khachHangDT;
import bean.khachHangInternet;

public class khINDao {
	public ArrayList<khachHangInternet> docFile() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<khachHangInternet> ds = new ArrayList<khachHangInternet>();
		FileReader fr = new FileReader("khachhang.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = "";
		while((line = bf.readLine())!= null) {
			String[] s = line.split("[,]");
			if(s[0].equals("IN")) {
				ds.add(new khachHangInternet(s[0], s[1], s[2], s[3], sdf.parse(s[4]), s[5]));
			}
		}
		bf.close();
		return ds;
	}
}
