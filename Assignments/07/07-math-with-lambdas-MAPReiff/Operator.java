enum Operator implements Operatable {
  // TODO add four enum values corresponding to the PLUS, MINUS, MULTIPLY,
  // DIVIDE
  // TODO for each enum value, set op to the right lambda expression

  PLUS {
    @Override
    public double apply(double a, double b) {
      Operatable op = (x, y) -> x + y;
      return op.apply(a, b);
    }
  },
  MINUS {
    @Override
    public double apply(double a, double b) {
      Operatable op = (x, y) -> x - y;
      return op.apply(a, b);
    }
  },
  DIVIDE {
    @Override
    public double apply(double a, double b) {
      Operatable op = (x, y) -> x / y;
      return op.apply(a, b);
    }
  },
  MULTIPLY {
    @Override
    public double apply(double a, double b) {
      Operatable op = (x, y) -> x * y;
      return op.apply(a, b);
    }
  };
}

interface Operatable {
  double apply(double a, double b);
}