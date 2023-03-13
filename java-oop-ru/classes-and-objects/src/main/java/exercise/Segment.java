package exercise;

// BEGIN
class Segment{
	private Point beginPoint;
	private Point endPoint;
	
	Segment(Point beginPoint, Point endPoint){
		this.beginPoint = beginPoint;
		this.endPoint = endPoint;
	}
	
	public Point getBeginPoint() {
		return this.beginPoint;
	}
	
	public Point getEndPoint() {
		return this.endPoint;
	}
	
	public Point getMidPoint() {
		int newPX = (beginPoint.getX() + endPoint.getX()) / 2;
		int newPY = (beginPoint.getY() + endPoint.getY()) / 2;
		return new Point(newPX, newPY);
	}
}

// END
