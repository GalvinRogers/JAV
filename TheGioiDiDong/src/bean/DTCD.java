package bean;

public class DTCD extends DT{
	private String color;

	public DTCD(String maDT, String tenDT, String hangSX, int gia, String color) {
		super(maDT, tenDT, hangSX, gia);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public DTCD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DTCD(String maDT, String tenDT, String hangSX, int gia) {
		super(maDT, tenDT, hangSX, gia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+ "," + color;
	}
	
}
