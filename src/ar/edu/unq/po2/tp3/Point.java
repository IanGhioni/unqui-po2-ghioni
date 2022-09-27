package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	 
	// Constructor
	Point() {
		this.setX(0);
		this.setY(0);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void movePoint(int x, int y) {
		this.setXY(x, y);
	}
	
	public Point sumPoints(Point coord1,Point coord2) {
		Point newPoint = new Point();
		
		newPoint.setX( (coord1.getX() + coord2.getX() )  );
		 newPoint.setY( (coord1.getY() + coord2.getY() )  );
		return(newPoint);
	}

}