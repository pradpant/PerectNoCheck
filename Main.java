import java.util.*;
class Main {
  private int x;
  static public void findPerfectNo(int x){
    int s=0;
    boolean check=false;
    for(int i=0;i<x;i++){
      s=s+i;
      if(s==x)
        {
        System.out.println(x+" is a Perect No");
        check=true;
        }
    }
    if(check==false)
      System.out.println(x+" is a not a Perect No");
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Main obj=new Main();
    int n=Integer.parseInt(sc.next());
    if(n<0)
      System.out.println("Negative No");
    else  
      obj.findPerfectNo(n);
  }
}