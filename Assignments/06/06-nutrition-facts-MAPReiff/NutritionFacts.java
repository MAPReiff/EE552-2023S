public class NutritionFacts {
  final String servingSize;
  final double calories;
  final double totalFat;
  final double saturatedFat;
  final double transFat;
  final double polyunsaturatedFat;
  final double monounsaturatedFat;
  final double cholesterol;
  final double sodium;
  final double totalCarbohydrates;
  final double dietaryFiber;
  final double sugars;
  final double addedSugar;
  final double sugarAlcohol;
  final double protein;
  final double calcium;
  final double iron;
  final double vitaminD;
  final double potassium;

  public NutritionFacts(String servingSize, double calories, double totalFat,
                        double saturatedFat, double transFat,
                        double polyunsaturatedFat, double monounsaturatedFat,
                        double cholesterol, double sodium,
                        double totalCarbohydrates, double dietaryFiber,
                        double sugars, double addedSugar, double sugarAlcohol,
                        double protein, double calcium, double iron,
                        double vitaminD, double potassium) {
    this.servingSize = servingSize;
    this.calories = calories;
    this.totalFat = totalFat;
    this.saturatedFat = saturatedFat;
    this.transFat = transFat;
    this.polyunsaturatedFat = polyunsaturatedFat;
    this.monounsaturatedFat = monounsaturatedFat;
    this.cholesterol = cholesterol;
    this.sodium = sodium;
    this.totalCarbohydrates = totalCarbohydrates;
    this.dietaryFiber = dietaryFiber;
    this.sugars = sugars;
    this.addedSugar = addedSugar;
    this.sugarAlcohol = sugarAlcohol;
    this.protein = protein;
    this.calcium = calcium;
    this.iron = iron;
    this.vitaminD = vitaminD;
    this.potassium = potassium;
  }

  public String toString() {
    return String.format(
        "servingsize: %s, calories: %f, totalFat: %f, saturatedFat: %f, transFat: %f, polyunsaturatedFat: %f, monounsaturatedFat: %f, cholesterol: %f, sodium: %f, totalCarbohydrates: %f, dietaryFiber: %f, sugars: %f, addedSugar: %f, sugarAlcohol: %f, protein: %f, calcium: %f, iron: %f, vitaminD: %f, potassium: %f",
        servingSize, calories, totalFat, saturatedFat, transFat,
        polyunsaturatedFat, monounsaturatedFat, cholesterol, sodium,
        totalCarbohydrates, dietaryFiber, sugars, addedSugar, sugarAlcohol,
        protein, calcium, iron, vitaminD, potassium);
  }

  public static NutritionFactsBuilder builder() {
    return new NutritionFactsBuilder();
  }

  public static class NutritionFactsBuilder {
    // TODO implement this class using the fluent style presented in class.
    String servingSize = "0";
    double calories = 0;
    double totalFat = 0;
    double saturatedFat = 0;
    double transFat = 0;
    double polyunsaturatedFat = 0;
    double monounsaturatedFat = 0;
    double cholesterol = 0;
    double sodium = 0;
    double totalCarbohydrates = 0;
    double dietaryFiber = 0;
    double sugars = 0;
    double addedSugar = 0;
    double sugarAlcohol = 0;
    double protein = 0;
    double calcium = 0;
    double iron = 0;
    double vitaminD = 0;
    double potassium = 0;

    public NutritionFactsBuilder addServingSize(String servingSize) {
      this.servingSize = servingSize;
      return this;
    }

    public NutritionFactsBuilder addCalories(double calories) {
      this.calories = calories;
      return this;
    }

    public NutritionFactsBuilder addTotalFat(double totalFat) {
      this.totalFat = totalFat;
      return this;
    }

    public NutritionFactsBuilder addSaturatedFat(double saturatedFat) {
      this.saturatedFat = saturatedFat;
      return this;
    }

    public NutritionFactsBuilder addTransFat(double transFat) {
      this.transFat = transFat;
      return this;
    }

    public NutritionFactsBuilder
    addPolyunsaturatedFat(double polyunsaturatedFat) {
      this.polyunsaturatedFat = polyunsaturatedFat;
      return this;
    }

    public NutritionFactsBuilder
    addMonounsaturatedFat(double monounsaturatedFat) {
      this.monounsaturatedFat = monounsaturatedFat;
      return this;
    }

    public NutritionFactsBuilder addCholesterol(double cholesterol) {
      this.cholesterol = cholesterol;
      return this;
    }

    public NutritionFactsBuilder addSodium(double sodium) {
      this.sodium = sodium;
      return this;
    }

    public NutritionFactsBuilder
    addTotalCarbohydrates(double totalCarbohydrates) {
      this.totalCarbohydrates = totalCarbohydrates;
      return this;
    }

    public NutritionFactsBuilder addDietaryFiber(double dietaryFiber) {
      this.dietaryFiber = dietaryFiber;
      return this;
    }

    public NutritionFactsBuilder addSugars(double sugars) {
      this.sugars = sugars;
      return this;
    }

    public NutritionFactsBuilder addAddedSugar(double addedSugar) {
      this.addedSugar = addedSugar;
      return this;
    }

    public NutritionFactsBuilder addSugarAlcohol(double sugarAlcohol) {
      this.sugarAlcohol = sugarAlcohol;
      return this;
    }

    public NutritionFactsBuilder addProtein(double protein) {
      this.protein = protein;
      return this;
    }

    public NutritionFactsBuilder addCalcium(double calcium) {
      this.calcium = calcium;
      return this;
    }

    public NutritionFactsBuilder addIron(double iron) {
      this.iron = iron;
      return this;
    }

    public NutritionFactsBuilder addVitaminD(double vitaminD) {
      this.vitaminD = vitaminD;
      return this;
    }

    public NutritionFactsBuilder addPotassium(double potassium) {
      this.potassium = potassium;
      return this;
    }

    public NutritionFacts build() {
      // TODO implement this method to call the NutritionFacts constructor
      return new NutritionFacts(
          servingSize, calories, totalFat, saturatedFat, transFat,
          polyunsaturatedFat, monounsaturatedFat, cholesterol, sodium,
          totalCarbohydrates, dietaryFiber, sugars, addedSugar, sugarAlcohol,
          protein, calcium, iron, vitaminD, potassium);
    }
  }
}