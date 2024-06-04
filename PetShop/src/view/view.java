package view;

import java.util.ArrayList;
import java.util.List;
import bean.cho;
import bean.meo;
import dao.choDao;
import dao.meoDao;
import dao.petDao;

public class view {
	public static void main(String[] args) throws Exception {
		petDao dv1 = new petDao();
		choDao sv2 = new choDao();
		meoDao sv3 = new meoDao();
		List<String> dv = new ArrayList<String>();
		ArrayList<cho> sv = new ArrayList<cho>();
		ArrayList<meo> sv1 = new ArrayList<meo>();
		System.out.println("*Cau 1*");
		dv = dv1.docFile();
		sv = sv2.docFile();
		sv1 = sv3.docFile();
		for(String in:dv) {
			System.out.println(in);
		}
		System.out.println("*Cau 2*");
		System.out.println("DOG LIST");
		for(cho in:sv) {
			System.out.println(in);
		}
		System.out.println("CAT LIST");
		for(meo in:sv1) {
			System.out.println(in);
		}
		
	}
}
