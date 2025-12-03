package SOLID.Dependency_Inversion_Principle.Good_Example;

public class GoodEngine implements Engine {

  @Override
  public void start() {
    System.out.println("Engine starting...");
  }
}
