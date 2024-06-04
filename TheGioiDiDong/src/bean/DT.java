package bean;

public class DT {
	private String maDT, tenDT, hangSX;
	private int gia;
	public DT(String maDT, String tenDT, String hangSX, int gia) {
		super();
		this.maDT = maDT;
		this.tenDT = tenDT;
		this.hangSX = hangSX;
		this.gia = gia;
	}
	public String getMaDT() {
		return maDT;
	}
	public void setMaDT(String maDT) {
		this.maDT = maDT;
	}
	public String getTenDT() {
		return tenDT;
	}
	public void setTenDT(String tenDT) {
		this.tenDT = tenDT;
	}
	public String getHangSX() {
		return hangSX;
	}
	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public DT() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return maDT + "," + tenDT + "," + hangSX + "," + gia;
	}
	
}
