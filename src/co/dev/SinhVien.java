package co.dev;

public class SinhVien {
	private String name;
	private double toan;
	private double ly;
	private double hoa;
	
	public SinhVien(String name, double toan, double ly, double hoa) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
			}
public double diemTrungBinh(double toan, double ly, double hoa) {
	return (toan + ly + hoa) / 3;
		}
public void show() {
	System.out.println(name+":"+diemTrungBinh(toan, ly, hoa));
	}
}


