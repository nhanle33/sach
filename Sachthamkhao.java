package module03_Bai02;

public class Sachthamkhao extends Sach {
	private double thue;
	public Sachthamkhao() {
		super();
	}
	public Sachthamkhao(String masach, String nhaxuatban, double dongia, int soluong, double thue) {
		super(masach,  nhaxuatban,  dongia,  soluong);
		this.thue=thue;
	}
	//set
	public void setThue(double thue) {
		this.thue=thue;
	}
	//get
	public double getThue() {
		return thue;
	}
	//override
	public double tinhthanhtien() {
		return super.getSoluong()*super.getDonGia()+thue;
	}
	//toString
	public String toString() {
		return super.toString()+", thue: "+this.thue+",thanh tien: "+tinhthanhtien();
	}

}
