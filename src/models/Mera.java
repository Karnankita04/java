package models;

public class Mera {
  int num1;
  int num2;

  public Mera(int a,int b){
    this.num1 = a;
    this.num2 = b;
  }

  public int meraAddMethod() {
    return this.num1 + this.num2;
  }

  public void greetings(String name){
    System.out.printf("Hello %s\n",name);
    
  }
}