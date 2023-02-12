class Car {
 private float x;
 private float y;
 private float speed;
 private int customColor;
 private float length;
 
 Car(float x, float y, float speed, int customColor, float length){
   this.x = x;
   this.y = y;
   this.speed = speed;
   this.customColor = customColor;
   this.length = length;
 }
  
 void move(){
   x = x + speed;
   if (x == width-length *(70)) {
    save("photo-finish.png");
    exit();
   }
   // HINT 1 - you should check whether the car has reached the edge of the screen in this method
   // HINT 2 - when the car does reach the end, call the save function and then call exit() to end the program
   //          otherwise, each car will overwrite the image when it reaches the end of the screen

 }
 
 void drawCar(){
    fill(0);
    rect(x + 5, y + 0,length *(15),10);
    rect(x + length *(45), y+ 0,length *(15),10);
    rect(x + 5, y+ 30,length *(15),10);
    rect(x + length *(45),y + 30,length *(15),10);

    fill(customColor);
    rect(x+0,y+5, length *(70), 30);

    fill(216, 216, 243);
    rect(x+50, y+7, length *(10), 26);
 }
}
