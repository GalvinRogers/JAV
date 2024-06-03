package bo;

import java.util.ArrayList;

import bean.khachHangInternet;
import dao.khINDao;

public class khINBo {
	khINDao kh1 = new khINDao();
	ArrayList<khachHangInternet> ds = new ArrayList<khachHangInternet>();
	public ArrayList<khachHangInternet> docFile() throws Exception{
		ds = kh1.docFile();
		return ds;
	}
}
