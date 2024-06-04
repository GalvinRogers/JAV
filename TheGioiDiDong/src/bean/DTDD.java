package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DTDD extends DT {
	private Date ngayHH;
	private int dungLuong;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public DTDD(String maDT, String tenDT, String hangSX, int gia, Date ngayHH, int dungLuong) {
		super(maDT, tenDT, hangSX, gia);
		this.ngayHH = ngayHH;
		this.dungLuong = dungLuong;
	}
	public Date getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(Date ngayHH) {
		this.ngayHH = ngayHH;
	}
	public int getDungLuong() {
		return dungLuong;
	}
	public void setDungLuong(int dungLuong) {
		this.dungLuong = dungLuong;
	}
	public DTDD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DTDD(String maDT, String tenDT, String hangSX, int gia) {
		super(maDT, tenDT, hangSX, gia);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+ "," + sdf.format(ngayHH) + "," + dungLuong;
	}
	
}
