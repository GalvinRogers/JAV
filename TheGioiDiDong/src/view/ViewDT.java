package view;

import java.util.ArrayList;
import java.util.List;

import bean.DT;
import bean.DTCD;
import bean.DTDD;
import dao.dtDao;
import dao.dtcdDao;
import dao.dtddDao;

public class ViewDT {
	public static void main(String[] args) throws Exception{
		dtDao dt = new dtDao();
		dtcdDao dtcd = new dtcdDao();
		dtddDao dtdd = new dtddDao();
		List<String> ds1 = new ArrayList<String>();
		ArrayList<DTCD> ds2 = new ArrayList<DTCD>();
		ArrayList<DTDD> ds3 = new ArrayList<DTDD>();
		ds1 = dt.docFile();
		ds2 = dtcd.docFile();
		ds3 = dtdd.docFile();
		System.out.println("--Cau 1--");
		for(String a:ds1) {
			System.out.println(a);
		}
		System.out.println("--Cau 2--");
		System.out.println("Danh sách điện thoại cố định");
		for(DTCD b:ds2) {
			System.out.println(b);
		}
		System.out.println("Danh sách điện thoại di động");
		for(DTDD c:ds3) {
			System.out.println(c);
		}
		
	}
}
