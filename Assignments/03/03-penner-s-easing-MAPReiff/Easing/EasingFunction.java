class EasingFunction {
  float start1;
  float stop1;

  float start2;
  float stop2;

  EasingFunction(float start1, float stop1, float start2, float stop2) {
    this.start1 = start1;
    this.start2 = start2;

    this.stop1 = stop1;
    this.stop2 = stop2;
  }

  public float tween(float value) {
    float b = start2;
    float c = stop2 - start2;
    float t = value - start1;
    float d = stop1 - start1;

    return tween(b, c, t, d);
  }

  float tween(float begin, float change, float time, float duration) {
    return 0;
  }
}

class LinearEasing extends EasingFunction {
  LinearEasing(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }

  float tween(float begin, float change, float time, float duration) {
    return change * time / duration + begin;
  }
}

class QuadraticEaseIn extends EasingFunction {
  QuadraticEaseIn(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }

  float tween(float begin, float change, float time, float duration) {
    time /= duration;
    return change * time * time + begin;
  }
}

class QuadraticEaseInOut extends EasingFunction {
  QuadraticEaseInOut(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }

  float tween(float begin, float change, float time, float duration) {
    time /= duration / 2;
    if (time < 1)
      return change / 2 * time * time + begin;
    time--;
    return -change / 2 * (time * (time - 2) - 1) + begin;
  }
}

// circular easing in - accelerating from zero velocity
class CircularEasingIn extends EasingFunction {
  CircularEasingIn(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }

  float tween(float begin, float change, float time, float duration) {
    time /= duration;
    return (float)(-(change) * (Math.sqrt(1 - time * time) - 1) + begin);
  }
}

// circular easing out - decelerating to zero velocity
class CircularEasingOut extends EasingFunction {
  CircularEasingOut(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }

  float tween(float begin, float change, float time, float duration) {
    time /= duration;
    time--;
    return (float)(change * Math.sqrt(1 - time * time) + begin);
  }
}

// circular easing in/out - acceleration until halfway, then deceleration
class CircularEasingInOut extends EasingFunction {
  CircularEasingInOut(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }

  float tween(float begin, float change, float time, float duration) {
    time /= duration / 2;
    if (begin < 1)
      return (float)(-change / 2 * (Math.sqrt(1 - time * time) - 1) + begin);
    begin = -2;
    return (float)(change / 2 * (Math.sqrt(1 - time * time) - 1) + begin);
  }
}

// exponential easing in - accelerating from zero velocity
class ExponentialEasingIn extends EasingFunction {
  ExponentialEasingIn(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }
  float tween(float begin, float change, float time, float duration) {
    return (float)(change * Math.pow(2, 10 * (time / duration - 1)) + begin);
  }
}

// exponential easing out - decelerating to zero velocity
class ExponentialEasingOut extends EasingFunction {
  ExponentialEasingOut(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }
  float tween(float begin, float change, float time, float duration) {
    return (float)(change * (-Math.pow(2, -10 * (time / duration)) + 1) +
                   begin);
  }
}

// exponential easing in/out - accelerating until halfway, then decelerating
class ExponentialEasingInOut extends EasingFunction {
  ExponentialEasingInOut(float start1, float stop1, float start2, float stop2) {
    super(start1, stop1, start2, stop2);
  }
  float tween(float begin, float change, float time, float duration) {
    time /= duration / 2;
    if (time < 1)
      return (float)(change / 2 * Math.pow(2, 10 * (time - 1)) + begin);
    time--;
    return (float)(change / 2 * (-Math.pow(2, -10 * time) + 2) + begin);
  }
}

// quintic easing in/out - acceleration until halfway, then deceleration
class QuinticEasingInOut extends EasingFunction {
  QuinticEasingInOut(float start1, float stop1, float start2, float stop2) {
    super(start1, stop2, start2, stop2);
  }
  float tween(float begin, float change, float time, float duration) {
    time /= duration / 2;
    if (time < 1)
      return (float)(change / 2 * time * time * time * time * time + begin);
    time -= 2;
    return (float)(change / 2 * (time * time * time * time * time + 2) + begin);
  }
}