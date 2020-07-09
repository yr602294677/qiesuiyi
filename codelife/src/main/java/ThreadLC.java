public class ThreadLC {

  class Foo {

    public void one() {
      System.out.println("one");
    }

    public void two() {
      System.out.println("two");
    }

    public void three() {
      System.out.println("three");
    }
  }
  private boolean lockFirst = false;
  private boolean lockSecond = false;
  public void first(Runnable printFirst) throws InterruptedException {
    printFirst.run();
  }

  public void second(Runnable printSecond) throws InterruptedException {
    printSecond.run();
  }

  public void third(Runnable printThird) throws InterruptedException {
    printThird.run();
  }
}
