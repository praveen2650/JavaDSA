public class swapfunction {
   public static void Swap(int a , int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a="+a);
    System.out.println("b="+b);
   }
   public static void main(String[] args) {
       int a = 10;
       int b = 5;
       Swap(a,b);
   }
    
}
