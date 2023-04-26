package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {



	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public void loadFile(){
		X = loadStrings("small.txt");// Load a text file into a String array
		
		for (int i = 0 ; i < lines.length; i++) {

			split(X[i], ' '); // Split a string into an array of words
			X[i].replaceAll("[^\\w\\s]",""); // Remove punction characters
			X[i].toLowerCase(); // Convert a string to lower case
		}

 		
	}

	public void printModel(){
		for (int x = 0 ; x < line.length; x++) {

			System.out.println(line + "\n");

		}
	}
}
