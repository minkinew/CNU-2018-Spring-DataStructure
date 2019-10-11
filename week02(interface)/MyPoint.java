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
		System.out.println("[move] x������ " + C + ", y������ " + D
				+ "��ŭ �̵� �Ϸ� �Ͽ����ϴ�.");
		System.out.println("���� ��ǥ : (  " + getX() + "," + getY() + " )");
	}

	public void scaleTo(double E) {
		if (E <= 0) {
			System.out.println("[Error] �Է��Ͻ� " + E + "�� ����� �ƴϹǷ� ���ǿ� ��߳��ϴ�.");
			System.out.println("���� ��ǥ : (  " + getX() + "," + getY() + " )");
		} else {
			x = x * E;
			y = y * E;
			System.out.println("[scale] ��ǥ�� " + E + "�踦 �Ͽ����ϴ�.");
			System.out.println("���� ��ǥ : (  " + getX() + "," + getY() + " )");
		}
	}

}