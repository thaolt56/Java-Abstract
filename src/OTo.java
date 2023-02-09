
public class OTo extends PhuongTienDiChuyen{
	private String loaiNhienLieu;

	public OTo(HangSanXuat hSanXuat, String loaiPhuongTien, String loaiNhienLieu) {
		super(hSanXuat, loaiPhuongTien);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		// TODO Auto-generated method stub
		return 300;
	}
	
	
}
