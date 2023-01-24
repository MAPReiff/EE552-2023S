// I pledge my honor that I have abided by the Stevens Honor System

int radius = 50;

int dx = 1;
int dy = 0;
int x;
int y;

int xMin = 0;
int yMin = 0;

int xMax = 400;
int yMax = 400;

int side = 0; // will be used to track current side. 0 top, 1 right, 2 bottom, 3 left

void setup() {
  // Code to setup your scene goes here
  size(400, 400);

  //HINT 1: If we want the circle to be positioned so its edge touches the edge of the window, 
  //        What are the coordinates of the center of the circle?
            // x, y
  //        What is the coordinate of the rightmost position the circle can be in?
            //400
  //        What is the coordinate of the bottommost position the circle can be in?
            //400
}

void draw() {
  //HINT 2: When should the circle change directions?
  background(255);

  fill(255, 0, 0);
  circle(x, y, 2*radius);
  
  if (side == 0 && x != xMax) {
    x = x + dx;
    y = y + dy;
  } else if (side == 0 && x == xMax) {
    side = 1; //set to left
  } else if (side == 1 && y != yMax) {
    x = x + dy;
    y = y + dx; //these are swapped for 0 and 1
  } else if (side == 1 && y == yMax) {
    side = 2;
  } else if (side == 2 && x != xMin) {
    x = x - dx;
    y = y + dy;
  } else if (side == 2 && x == xMin) {
    side = 3;
  } else if (side == 3 && y != yMin) {
    x = x + dy;
    y = y - dx; //these are swapped for 0 and 1
  } else {
    side = 0;
  }

}
