import java.util.*;
class Main {
  private int x;
  public void findPerfectNo(int x){
    int s=0;
    for(int i=0;i<x;i++){
      s=s+i; 
    }
      if(s==x)
        System.out.println(x+" is a Perect No");
      else
        System.out.println(x+" is a not a Perect No");
  }  
  //////////////////////////
  public void armstrongNo(int x){
    int s=0;
    int t=0;
    while(x>0){
      t=x%10;
      s=s+t*t*t;
      x=x/10;
      }
      if(s==x)
        System.out.println("Is a armstrong No");
      else
        System.out.println("Is not a armstrong No");

  }
  ///////////////////////////
  public void primeNo(int x){
        boolean check = false;
        for(int i = 2; i <= x/2; ++i)
        {
            // condition for nonprime number
            if(x % i == 0)
            {
                check = true;
                break;
            }
        }

        if (!check)
            System.out.println("Is a prime number.");
        else
            System.out.println("Is not a prime number.");
  }
  ///////////////////////////
  public void fibNo(int x){
    int f=0;
    int se=1;
    while (f <= x)
        {
            System.out.print(f + " + ");

            int s = f + se;
            f = se;
            se = s;
        }
  }
  //////////////////////////
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Main obj=new Main();
    int n=Integer.parseInt(sc.next());
    if(n<0)
      System.out.println("Negative No");
    else {
      System.out.println("Hello World");
      obj.findPerfectNo(n);
      obj.armstrongNo(n);
      obj.primeNo(n);
      obj.fibNo(n);

    }
  }
}