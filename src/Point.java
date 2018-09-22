//**************************************************************************************************
// CLASS: Point (Point.java)
//
// DESCRIPTION
// This is the Point class from "Objects and Classes: Section 1".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************

// Hw 6.1
public class Point implements Comparable<Point> {
    // A point in the Cartesian plane is located at (x, y) where x and y form the
    // coordinates of the point.
    private double x;
    private double y;

    // Constructor.
    public Point(double initX, double initY) {
        setX(initX);
        setY(initY);
    }
    
    @Override
    public int compareTo(Point p) {
    	double distance1 = Math.sqrt(x * x + y * y);
    	double distance2 = Math.sqrt(p.x * p.x + p.y * p.y);
    	
    	if(distance1 < distance2) {
    		return -1;
    	}
    	else if (distance1 > distance2) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
    }

    // Accessor method for x.
    public double getX() {
        return x;
    }

    // Accessor method for y.
    public double getY() {
        return y;
    }

    // Mutator method for x.
    public void setX(double newX) {
        x = newX;
    }

    // Mutator method for y.
    public void setY(double newY) {
        y = newY;
    }
}
