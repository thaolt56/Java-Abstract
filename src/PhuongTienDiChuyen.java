
public abstract class PhuongTienDiChuyen {
	private HangSanXuat hSanXuat;
	private String loaiPhuongTien;
	
	public PhuongTienDiChuyen(HangSanXuat hSanXuat, String loaiPhuongTien) {
		
		this.hSanXuat = hSanXuat;
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public HangSanXuat gethSanXuat() {
		return hSanXuat;
	}

	public void sethSanXuat(HangSanXuat hSanXuat) {
		this.hSanXuat = hSanXuat;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	
	public void batDau() {
		System.out.println("start....");
	}
	public void tangToc() {
		System.out.println("Speed Up....");
	}	
	public void dungLai() {
		System.out.println("Stop....");
	}
	public String HangSX() {
		return hSanXuat.getTenHangSX();
	}
	public abstract double layVanToc();
}
