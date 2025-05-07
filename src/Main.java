import models.Mera;

public class Main {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int result = Main.add(a,b);

    System.out.printf("result = %d",result);

    
  }

  public static int add(int a,int b) {
    Mera meraAdd = new Mera(a,b);
    meraAdd.greetings("Anjali");
    return meraAdd.meraAddMethod();
  }
}