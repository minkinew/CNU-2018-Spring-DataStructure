public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint minkinew = new MyPoint();
		minkinew.setX(-1.0);
		minkinew.setY(3.0);
		System.out.println("ÇöÀç ÁÂÇ¥ : (  " + minkinew.getX() + "," + minkinew.getY() + " )");
		minkinew.moveTo(2.0, -5.0);
		minkinew.scaleTo(-2.0);
		minkinew.scaleTo(2.0);
	}

}
