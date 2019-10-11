public class MyPoint implements Point {

	double x;
	double y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double A) {
		x = A;

	}

	public void setY(double B) {
		y = B;

	}

	public void moveTo(double C, double D) {
		x = x + C;
		y = y + D;
		System.out.println("[move] x축으로 " + C + ", y축으로 " + D
				+ "만큼 이동 완료 하였습니다.");
		System.out.println("현재 좌표 : (  " + getX() + "," + getY() + " )");
	}

	public void scaleTo(double E) {
		if (E <= 0) {
			System.out.println("[Error] 입력하신 " + E + "는 양수가 아니므로 조건에 어긋납니다.");
			System.out.println("현재 좌표 : (  " + getX() + "," + getY() + " )");
		} else {
			x = x * E;
			y = y * E;
			System.out.println("[scale] 좌표에 " + E + "배를 하였습니다.");
			System.out.println("현재 좌표 : (  " + getX() + "," + getY() + " )");
		}
	}

}