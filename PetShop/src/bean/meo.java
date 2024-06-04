package bean;

public class meo extends animal{
	private String mau;

	public meo(String ten, int tuoi, String diaChi, String mau) {
		super(ten, tuoi, diaChi);
		this.mau = mau;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public meo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " " + mau;
	}
	
}
