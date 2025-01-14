1. Square area and perimeter

public class Square {

    private int side;

    public Square(int side) {
        this.side=side;
        // TODO: Initialize side with the passed value
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        return side>0?side*side:-1;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        return side>0?side*4:-1;
    }

}

2. Feet and Inches

public class Dimension {
    private int feet;
    private int inches;
    
    public Dimension(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
        if(inches == -1)
        {
            this.feet=-1;
            this.inches=-1;
        }
        else{
        this.feet=inches/12;
        this.inches=inches%12;
        }
    }
    
    public int getFeet() {
        // TODO: Return the value of feet.
        return feet;
    }
    
    public int getInches() {
        // TODO: Return the value of inches.
        return inches;
    }    
}

3.Distance ( Euclidean distance)


public class Point {
    
   
    private int x;

   
    private int y;

   
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

   
    public int getX() {
        return x;
    }

  
    public int getY() {
        return y;
    }


    public void move(int dx, int dy) {
        // Your code here
        this.x+=dx;
        this.y+=dy;
    }


    public double distanceTo(Point other) {
        double d=Math.sqrt((Math.pow((this.x-other.x),2))+(Math.pow((this.y-other.y),2)));
        return d;
        
    }
}

4. RGB Color

// RGBColor class representing a color using Red Green Blue (RGB) model.
public class RGBColor {
    
    // The Red, Green, Blue color values range from 0 to 255.
    private int red;
    private int green;
    private int blue;

    // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
    public RGBColor(int red, int green, int blue) {
        // write your code here
        this.red=red;
        this.green=green;
        this.blue=blue;
    }

    // Getter method to get the red value of the color.
    public int getRed() {
        // write your code here
        return red;
    }

    // Getter method to get the green value of the color.
    public int getGreen() {
        // write your code here
        return green;
    }

    // Getter method to get the blue value of the color.
    public int getBlue() {
        // write your code here
        return blue;
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
        this.red=255-this.red;
        this.green=255-this.green;
        this.blue=255-this.blue;
        // write your code here
    }
}