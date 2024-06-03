package bean;

import java.util.Date;

public class khachHangDT extends khachHang{
	private String loaiSim;

	public khachHangDT(String maDv, String tenDichVu, String tenKhachHang, String maKH, Date ngayDangKy,
			String loaiSim) {
		super(maDv, tenDichVu, tenKhachHang, maKH, ngayDangKy);
		this.loaiSim = loaiSim;
	}

	public String getLoaiSim() {
		return loaiSim;
	}

	public void setLoaiSim(String loaiSim) {
		this.loaiSim = loaiSim;
	}

	@Override
	public String toString() {
		return super.toString() + "," + loaiSim;
	}
	
}	
