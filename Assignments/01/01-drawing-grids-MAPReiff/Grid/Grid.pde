
int n = 50; // Changing this number should upadate the grid

void setup() {
  // Do all your drawing here OR if the drawing is complex, in new methods
  // called from here.

  // This line will save your drawing to a file.  Please include the file with
  // your submission.

  size(600, 400);

  // horizontal and vertical line gap
  float horizontalGap = (float)width/n;
  float verticalGap = (float)height/n;

  fill(000); // black fill

  // floats to track new positions
  float x = 0.0f;
  float y = 0.0f;

  for (int i = 0; i < n; i++) {
    x += horizontalGap;
    y += verticalGap;
    line(x, 0, x, height);
    line(0, y, width, y);
  }

  save("grid-"+n+".png");
}
