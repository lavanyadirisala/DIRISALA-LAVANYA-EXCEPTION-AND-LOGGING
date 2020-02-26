package epam.com.logger;

public class House {
	double area;
	int op;
	public House(double area,int op) {
		this.area=area;
		this.op=op;
	}
	int[] retrive= {1200,1500,1800,2500};
	public double total() {
	return area*retrive[this.op-1];
	}
}
