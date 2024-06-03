package bo;

import java.util.ArrayList;

import dao.khDao;

public class khBo {
	ArrayList<String> dsBo = new ArrayList<String>();
	khDao d = new khDao();
	public ArrayList<String> docFile() throws Exception{
		dsBo = d.docFile();
		return dsBo;
	}
}
