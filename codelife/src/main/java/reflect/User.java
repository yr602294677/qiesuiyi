package reflect;

public class User {

  private String xm;

  private String jtzz;

  public String getXm() {
    return xm;
  }

  public void setXm(String xm) {
    this.xm = xm;
  }

  public String getJtzz() {
    return jtzz;
  }

  public void setJtzz(String jtzz) {
    this.jtzz = jtzz;
  }

  public User(String xm, String jtzz) {
    this.xm = xm;
    this.jtzz = jtzz;
  }

  public static void main(String[] args) {
    System.out.println("我是 user里的main方法");
  }
}
