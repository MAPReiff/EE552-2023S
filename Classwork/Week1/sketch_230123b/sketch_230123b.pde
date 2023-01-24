//size(600, 400);

////circle(25, 25, 50);
////circle(25, 75, 50);
////circle(25, 125, 50);
////circle(25, 175, 50);

////circle(25, 25, 50);
////circle(25, 25+50, 50);
////circle(25, 25+50+50, 50);
////circle(25, 25+50+50+50, 50);

//// loop - repeats something
//// branches - do something different based on condition

//int y = 25;  //var type is an int
//while(y < height) {  // run loop as long as condition is true
// circle(25, y, 25); 
//  y = y + 25;
//  println("In the loop"); // print to console
//}

//println("finished");


//for(int y2 = 25; y2 < height; y2 += 25) {
// circle(75, y2, 25); 
//}

//for(int i = 0; i <= 14; i++) {
//  if (i % 2 == 0) { // if i is even 
//    fill(0, 0, 255); //blue
//  } else {
//   fill(255, 255, 255); // white 
//  }
//  circle(125, i*25 + 25, 25);
//  //rect((i-1)*25, (i-1)*24, i*25, i*25);
//}

int x = 0;
void setup () { // in processing, setup runs once
 size(600, 400); 
 frameRate(144); // override fps
}

void draw() { // in processing, draw is called once per fps, default is 60
  background(255, 255, 255); // white background each frame
  circle(x, height/2, 50);
  x = (x + 1) % width;
  
}
