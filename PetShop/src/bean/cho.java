package bean;

public class cho extends animal{
	private String chungLoai;

	public cho(String ten, int tuoi, String diaChi, String chungLoai) {
		super(ten, tuoi, diaChi);
		this.chungLoai = chungLoai;
	}

	public String getChungLoai() {
		return chungLoai;
	}

	public void setChungLoai(String chungLoai) {
		this.chungLoai = chungLoai;
	}

	public cho() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+ " " + chungLoai;
	}
	
	
}
