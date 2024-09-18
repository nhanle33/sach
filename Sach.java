package module03_Bai02;

public class Sach {
	private String Masach,nhaxuatban;
	private double dongia;
	private int soluong;
	public Sach() {
		super();
	}
	public Sach(String masach, String nhaxuatban, double dongia, int soluong) {
		super();
		this.Masach=masach;
		this.nhaxuatban=nhaxuatban;
		this.dongia=dongia;
		this.soluong=soluong;
		
	}
	//set
	public void setMaSach(String ms) {
		this.Masach=ms;
	}
	public void setNhaXuatBan(String nxb) {
		this.nhaxuatban=nxb;
	}
	public void setDongia(double dg) {
		this.dongia=dg;
	}
	public void setSoluong(int sl) {
		this.soluong=sl;
	}
	//get
	public String getMaSach() {
		return Masach;
	}
	public String getNhaXuatBan() {
		return nhaxuatban;
	}
	public double getDonGia() {
		return dongia;
	}
	public int getSoluong() {
		return soluong;
	}
	public double Tinhthanhtien() {
		return 0;
	}
	//toString
	public String toString() {
		return "Ma sach: "+this.Masach+",ten nha xuat ban: "+this.nhaxuatban
				+", don gia: "+this.dongia + ", so luong: "+this.soluong;
	}
	

}
