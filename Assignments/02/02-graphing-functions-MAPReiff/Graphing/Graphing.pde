//I pledge my honor that I have abided by the Stevens Honor System.

/**
* Remember that in Processing, the origin is usually in the top left of the screen
* and the positive Y direction points down. This method will actually rotate the 
* drawing canvas 180 degrees and move the origin to the center of the screen.
*/
void beginGraph(){
  pushMatrix();
  background(255);
  stroke(150);
  line(0,height/2, width, height/2);
  line(width/2,0, width/2, height);
  stroke(0);
  translate(width/2, height/2);
  scale(1.0,-1.0);
}

void endGraph(){
  popMatrix();
}

// TODO Declare your functions here - try to give them meaningful names.  They should take a float
// as input and return a float.

void setup() {
  size(400, 400);
  beginGraph();
  float prevY = 0; // HINT to draw the lines to make your graph
                   // you will need to keep track of the previous
                   // point coordinates and the next ones. You should
                   // set this based the functions you declare
  float prevX = -width;
  for (float x = -width; x < width; x++) {
     // Graph the sin function here. HINT sin is a
     // built in function in Processing
     float y = 100 * sin(x/10);
     line(prevX, prevY, x, y);
     prevX = x;
     prevY = y;
  }
  // This line will save your drawing to a file.  Please include the file with
  // your submission.
  save("sin.png");
  endGraph();
  
  
  beginGraph();
  prevY = 0;
  prevX = -width;
  for (float x = -width; x < width; x++) {
    // Graph y = x^2 here
    float y = x*x;
    line(prevX, prevY, x, y);
     prevX = x;
     prevY = y;
  }
  // This line will save your drawing to a file.  Please include the file with
  // your submission.
  save("parabola.png");
  endGraph();
  
  
  beginGraph();
  prevY = 0;
  prevX = -width;
  for (float x = -width; x < width; x++) {
  //  // Graph y = (1/2) x + 40 here
    float y = (0.5 * x) + 40;
    line(prevX, prevY, x, y);
     prevX = x;
     prevY = y;
  }
  //// This line will save your drawing to a file.  Please include the file with
  //// your submission.
  save("line.png");
  endGraph();
  
  beginGraph();
  prevY = 0;
  prevX = -width;
  for (float x = -width; x < width; x++) {
  //  // Graph whatever you want here
    // y = 2x^3 + 7x^2 - 4x + 7/2
    float y = (2 * pow(x, 3)) + (7 * pow(x, 2)) - (4 * x) + (7/2);
    line(prevX, prevY, x, y);
     prevX = x;
     prevY = y;
    
  }
  // This line will save your drawing to a file.  Please include the file with
  // your submission.
  save("mine.png");
  endGraph();
}
