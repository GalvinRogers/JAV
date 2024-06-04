package bean;

public class animal {
	private String ten;
	private int tuoi;
	private String diaChi;
	public animal(String ten, int tuoi, String diaChi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return ten + "," + tuoi + "," + diaChi;
	}
	
}
