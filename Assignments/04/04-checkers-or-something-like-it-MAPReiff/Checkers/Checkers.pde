Button[] buttons;

void setup() {
  buttons = new Button[8*8];
  size(1000, 1000);
  // HINT instead of drawing each button one by one, you can
  //      write a loop and do some math to create your chessboard.
  //      A chessboard has 64 squares - 8 rows and 8 columns

  int colWidth = width / 8;
  int rowHeight = height / 8;
  int count = 0;
  for (int i = 0; i < 8; i++) {
    for (int j = 0; j < 8; j++) {
      if ((i + j) % 2 == 0) { // even vs odd check
        buttons[count] = new Button(j * colWidth, i * rowHeight, colWidth, rowHeight, color(219, 112, 147), color(0, 128, 0));
      } else {
        buttons[count] = new Button(j * colWidth, i * rowHeight, colWidth, rowHeight, color(0, 0, 255), color(255, 127, 80));
      }
      count++;
    }
  }
}

class Button {
  float leftPos;
  float topPos;
  float btnWidth;
  float btnHeight;
  boolean on = false;
  int btnColor;
  int circleColor;

  Button(float leftPos, float topPos, float btnWidth, float btnHeight, int btnColor, int circleColor) {
    this.leftPos = leftPos;
    this.topPos = topPos;
    this.btnWidth = btnWidth;
    this.btnHeight = btnHeight;
    this.btnColor = btnColor;
    this.circleColor = circleColor;
  }

  boolean isClicked() {
    return (mouseX > leftPos && mouseY > topPos && mouseX < leftPos + btnWidth &&
      mouseY < topPos + btnHeight);
  }

  void toggleOnOff() {
    this.on = !this.on;
  }

  void draw() {
    // HINT this is how we changed the color of the button.
    //      For the checkers example, you should use this
    //      if statement to draw or not draw a filled in circle
    // HINT think about how to keep track of the alternating colors
    //      of each square.
    fill(btnColor);
    rect(leftPos, topPos, btnWidth, btnHeight);
    if (on) {
      fill(circleColor);
      ellipse(leftPos + btnWidth / 2, topPos + btnHeight / 2, btnWidth / 2, btnHeight / 2);
    }
  }
}

void mousePressed() {
  for (int i = 0; i < 8*8; i++) {
    if (buttons[i].isClicked()) {
      buttons[i].toggleOnOff();
    }
  }
}

void draw() {
  background(255);
  for (int i = 0; i < 8*8; i++) {
    buttons[i].draw();
  }
  
}
