package bo;

import java.util.ArrayList;

import bean.khachHangDT;
import dao.khDTDao;

public class khDTBo {
	khDTDao kh1 = new khDTDao();
	ArrayList<khachHangDT> ds = new ArrayList<khachHangDT>();
	public ArrayList<khachHangDT> docFile() throws Exception{
		ds = kh1.docFile();
		return ds;
	}
}
