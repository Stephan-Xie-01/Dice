import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(400, 500);
	noLoop();
}

//store total value
int totalValue = 0;

public void draw()
{
	//your code here
	background(0, 0, 0);
	for (int i = 25; i < 400; i += 100) {
		for(int j = 25; j < 400; j += 100){
		Die dieOne = new Die(i, j);
		dieOne.show();
		dieOne.roll();
		}
	}
	fill(255, 255, 255);
	textSize(30);
	text("Total: " + totalValue, 150, 450);
	
}

public void mousePressed()
{
	redraw();
	totalValue = 0;
}
class Die //models one single dice cube
{

	int diceX, diceY, numDots;//variable declarations here
	Die(int x, int y) //constructor
	{
		diceX = x;
		diceY = y;
		numDots = (int)(Math.random()* 7) + 1;//variable initializations here

	}
	public void roll()
	{
		
		//your code here
	}
	public void show()
	{
		//your code here
		fill(255, 255, 255);
		rect(diceX, diceY, 50, 50);
		
		if(numDots == 1){
			noStroke();
			fill(0, 0, 0);
			ellipse(diceX + 25, diceY + 25, 10,10);
			totalValue++;
		}
		else if(numDots == 2)
		{
			noStroke();
			fill(0, 0, 0);
			ellipse(diceX + 10, diceY + 10, 10, 10);
			ellipse(diceX + 40, diceY + 40, 10, 10);
			totalValue += 2;
		}
		else if (numDots == 3)
		{
			noStroke();
			fill(0, 0, 0);
			ellipse(diceX + 25, diceY + 25, 10,10);
			ellipse(diceX + 10, diceY + 10, 10, 10);
			ellipse(diceX + 40, diceY + 40, 10, 10);
			totalValue += 3;
		}
		else if(numDots == 4)
		{
			noStroke();
			fill(0, 0, 0);
			ellipse(diceX + 40, diceY + 10, 10, 10);
			ellipse(diceX + 40, diceY + 40, 10, 10);
			ellipse(diceX + 10, diceY + 40, 10, 10);
			ellipse(diceX + 10, diceY + 10, 10, 10);
			totalValue += 4;
		}
		else if(numDots == 5)
		{
			noStroke();
			fill(0, 0, 0);
			ellipse(diceX + 25, diceY + 25, 10,10);
			ellipse(diceX + 40, diceY + 10, 10, 10);
			ellipse(diceX + 40, diceY + 40, 10, 10);
			ellipse(diceX + 10, diceY + 40, 10, 10);
			ellipse(diceX + 10, diceY + 10, 10, 10);
			totalValue += 5;
		}
		else
		{
			noStroke();
			fill(156, 0, 76);
			ellipse(diceX + 40, diceY + 10, 10, 10);
			ellipse(diceX + 40, diceY + 40, 10, 10);
			ellipse(diceX + 10, diceY + 40, 10, 10);
			ellipse(diceX + 10, diceY + 10, 10, 10);
			ellipse(diceX + 10, diceY + 25, 10, 10);
			ellipse(diceX + 40, diceY + 25, 10, 10);	
			totalValue += 6;
			
		}


	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
