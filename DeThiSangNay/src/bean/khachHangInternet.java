package bean;

import java.util.Date;

public class khachHangInternet extends khachHang {
	private String bangThong;

	public khachHangInternet(String maDv, String tenDichVu, String tenKhachHang, String maKH, Date ngayDangKy,
			String bangThong) {
		super(maDv, tenDichVu, tenKhachHang, maKH, ngayDangKy);
		this.bangThong = bangThong;
	}

	public String getBangThong() {
		return bangThong;
	}

	public void setBangThong(String bangThong) {
		this.bangThong = bangThong;
	}

	@Override
	public String toString() {
		return super.toString() + "," + bangThong;
	}
	
}
