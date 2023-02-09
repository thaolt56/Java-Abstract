
public class MayBay extends PhuongTienDiChuyen{
	private String loaiNhienLieu;

	public MayBay(HangSanXuat hSanXuat, String loaiPhuongTien, String loaiNhienLieu) {
		super(hSanXuat, loaiPhuongTien);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
	public void catCanh() {
		System.out.println("may bay cat canh");
	}
	public void haCanh() {
		System.out.println("may bay ha canh");
	}
	
	
	
	@Override
	public double layVanToc() {
		// TODO Auto-generated method stub
		return 1000;
	}
	
	
}
