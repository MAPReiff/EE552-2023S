import java.lang.reflect.*;
public class Main {
  public static void main(String[] args) {
    Class<?> aClass = Cat.class;

    System.out.println("Fields:");
    // TODO print out all the fields on the Cat class
    Field[] fields = aClass.getDeclaredFields();
    for (Field field : fields) {
      System.out.println(field);
    }

    System.out.println("Constructor:");
    // TODO print out all the constructors on the Cat class
    Constructor<?>[] constructors = aClass.getDeclaredConstructors();
    for (Constructor<?> constructor : constructors) {
      System.out.println(constructor);
    }

    System.out.println("Methods:");
    // TODO print out all the methodss on the Cat class
    Method[] methods = aClass.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println(method);
    }
  }
}
