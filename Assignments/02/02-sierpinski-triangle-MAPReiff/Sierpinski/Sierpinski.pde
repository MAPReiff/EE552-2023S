// I pledge my honor that I have abided by the Stevens Honor System.

void sierpinski(float x1, float y1, float x2, float y2, float x3, float y3, int iterations){
  // The variable iterations should be used to know when to stop
  if(iterations >  0) {
    triangle(x1, y1, x2, y2, x3, y3);
    
    // HINT how do you calculate the midpoint of a line?
    float midX1 = (x1 + x2) / 2;
    float midY1 = (y1 + y2) / 2;
    
    float midX2 = (x2 + x3) / 2;
    float midY2 = (y2 + y3) / 2;
    
    float midX3 = (x3 + x1) / 2;
    float midY3 = (y3 + y1) / 2;
    
    // HINT for each iteration, you need to draw three smaller triangles
    
    sierpinski(midX1, midY1, x1, y1, midX3, midY3, iterations-1);  // bottom left
    
    sierpinski(midX1, midY1, x2, y2,  midX2, midY2, iterations-1);  // top
    
    sierpinski(midX2, midY2, x3, y3, midX3, midY3, iterations-1);  // bottom right
}
  //
}

void setup(){
  // Do all your drawing here OR if the drawing is complex, in new methods
  // called from here.
  
  size(800,800);
  sierpinski(0, 700, 400, 0, 800, 700, 10);
  // This line will save your drawing to a file.  Please include the file with
  // your submission.
  save("sierpinski.png");
}
