
public class Test {
	public static void main(String[] args) {
		HangSanXuat hSanXuat_1 = new HangSanXuat("BMW", "Duc");
		HangSanXuat hSanXuat_2 = new HangSanXuat("Boing", "USA");
		HangSanXuat hSanXuat_3 = new HangSanXuat("Thong Nhat", "Viet Nam");
		
		System.out.println("------check thong tin May bay:-----");
		MayBay mb = new MayBay(hSanXuat_2, "May Bay", "Xang");
		mb.batDau();
		mb.catCanh();
		mb.dungLai();
		mb.layVanToc();
		System.out.println("Nhien lieu:" + mb.getLoaiNhienLieu());
		System.out.println("Van toc:" + mb.layVanToc());
		System.out.println("ten Hang san xuat:" + mb.HangSX());
		
		
		System.out.println("-----check thong tin Oto: ------");
		OTo car = new OTo(hSanXuat_1, "O To", "Dau");
		
		car.batDau();
//		car.catCanh();
		car.dungLai();
		car.layVanToc();
		System.out.println("Nhien lieu:" + car.getLoaiNhienLieu());
		System.out.println("Van toc:" + car.layVanToc());
		System.out.println("ten Hang san xuat:" + car.HangSX());
	}
}
