package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class khachHang {
	private String maDv, tenDichVu, tenKhachHang,maKH;
	private Date ngayDangKy;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public khachHang(String maDv, String tenDichVu, String tenKhachHang, String maKH,Date ngayDangKy) {
		super();
		this.maDv = maDv;
		this.tenDichVu = tenDichVu;
		this.tenKhachHang = tenKhachHang;
		this.maKH = maKH;
		this.ngayDangKy = ngayDangKy;
	}

	public String getMaDv() {
		return maDv;
	}

	public void setMaDv(String maDv) {
		this.maDv = maDv;
	}

	public String getTenDichVu() {
		return tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public Date getNgayDangKy() {
		return ngayDangKy;
	}

	public void setNgayDangKy(Date ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}

	public khachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return maDv + ","+ tenDichVu + "," + tenKhachHang + ","
				+ maKH + "," + sdf.format(ngayDangKy);
	}
	
}
