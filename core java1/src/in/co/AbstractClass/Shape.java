package in.co.AbstractClass;

public abstract class Shape {
	private int bw;
	private String color;
	 abstract void area();
	 public int getBW() {
		 return bw;
	 }
	 public void setBW(int bw) {
		 this.bw=bw;
	 }
	 public String getColor() {
		 return color;
	 }
	 public void setColor(String color) {
		 this.color=color;
	 }
}