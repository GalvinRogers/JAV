package view;

import java.util.ArrayList;
import java.util.List;

import bean.khachHang;
import bean.khachHangDT;
import bean.khachHangInternet;
import bo.khBo;
import bo.khDTBo;
import bo.khINBo;

public class khView {
	public static void main(String[] args) throws Exception{
		khBo kh = new khBo();
		khDTBo kh1 = new khDTBo();
		khINBo kh2 = new khINBo();
		List<String> a = new ArrayList<String>();
		List<khachHangDT> dt1 = new ArrayList<khachHangDT>();
		List<khachHangInternet> in1 = new ArrayList<khachHangInternet>();
		System.out.println("Cau 1");
		a = kh.docFile();
		for(String b:a) {
			System.out.println(b);
		}
		System.out.println("Cau 2");
		dt1 = kh1.docFile();
		in1 = kh2.docFile();
		System.out.println("-Danh sách Khách Hàng dùng Internet:-");
		for(khachHangInternet khin:in1) {
			System.out.println(khin.toString());
		}
		System.out.println("-Danh sách Khánh Hàng dùng Điện Thoại:-");
		for(khachHangDT khdt:dt1) {
			System.out.println(khdt.toString());
		}
	}
}
