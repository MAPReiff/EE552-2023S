EasingFunction easingLinear;
EasingFunction easingQuadraticIn;
EasingFunction easingQuadraticInOut;
EasingFunction easingCircularEasingIn;
EasingFunction easingCircularEasingOut;
EasingFunction easingCircularEasingInOut;
EasingFunction easingExponentialEasingIn;
EasingFunction easingExponentialEasingOut;
EasingFunction easingExponentialEasingInOut;
EasingFunction easingQuinticEasingInOut;




void setup(){
  size(600,400);
  easingLinear = new LinearEasing(0,height,0,255);
  easingQuadraticIn = new QuadraticEaseIn(0,height,0,255);
  easingQuadraticInOut = new QuadraticEaseInOut(0,height,0,255);
  easingCircularEasingIn = new CircularEasingIn(0, height, 0, 255);
  easingCircularEasingOut = new CircularEasingOut(0, height, 0, 255);
  easingCircularEasingInOut = new CircularEasingInOut(0, height, 0, 255);
  easingExponentialEasingIn = new ExponentialEasingIn(0, height, 0, 255);
  easingExponentialEasingOut = new ExponentialEasingOut(0, height, 0, 255);
  easingExponentialEasingInOut = new ExponentialEasingInOut(0, height, 0, 255);
  easingQuinticEasingInOut = new QuinticEasingInOut(0, height, 0, 255);



}

void draw(){
  for(float i = 0; i < height; i++){
    stroke(easingLinear.tween(i));
    line(0,i, width/10, i);
  
    stroke(easingQuadraticIn.tween(i));
    line(width/10,i, 2*width/10, i);
  
    stroke(easingQuadraticInOut.tween(i));
    line(2*width/10,i, 3*width/10, i);
    
    stroke(easingCircularEasingIn.tween(i));
    line(3*width/10,i,4*width/10,i);
    
    stroke(easingCircularEasingOut.tween(i));
    line(4*width/10,i,5*width/10,i);
    
    stroke(easingCircularEasingInOut.tween(i));
    line(5*width/10,i,6*width/10,i);

    stroke(easingExponentialEasingIn.tween(i));
    line(6*width/10,i,7*width/10,i);

    stroke(easingExponentialEasingOut.tween(i));
    line(7*width/10,i,8*width/10,i);

    stroke(easingExponentialEasingInOut.tween(i));
    line(8*width/10,i,9*width/10,i);

    stroke(easingQuinticEasingInOut.tween(i));
    line(9*width/10,i,width,i);
    
  }
  save("easing.tif");
}
  
