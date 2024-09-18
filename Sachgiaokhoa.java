package module03_Bai02;

public class Sachgiaokhoa extends Sach {
	private boolean tinhtrang; //true=moi
	public Sachgiaokhoa() {
		super();
	}
	public Sachgiaokhoa(String masach, String nhaxuatban, double dongia, int soluong,boolean tinhtrang) {
		super(masach,nhaxuatban,dongia,soluong);
		this.tinhtrang=tinhtrang;
	}
	//set
	public void setTinhTrang(boolean tinhtrang) {
		this.tinhtrang=tinhtrang;
	}
	//get
	public boolean getTinhTrang() {
		return tinhtrang;
	}
	//override
	public double tinhThanhtien() {
		if(tinhtrang=true) {
			return super.getSoluong()*super.getDonGia();
		}else {
			return super.getSoluong()*super.getDonGia()*0.5;
		}
	}
	//override
	public String toString() {
		return super.toString()+", tinh trang sach: "+((tinhtrang==true)?"moi":"cu")+", thanh tien:"+tinhThanhtien();
	}
	

}
