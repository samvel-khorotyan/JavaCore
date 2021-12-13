package homework.figurePainter;

public class FigurePainter1 {

   void figureOne(int n,char c){
       for (int i = 0; i < n; i++) {
           for (int j = 0; j <= i; j++) {
               System.out.print(c + " ");
           }
           System.out.println();
       }
       System.out.println();
   }

   void figureTwo(int f,char s){
       for (int i = 0; i < f; i++) {
           for (int j = i; j < f; j++) {
               System.out.print(s + " ");
           }
           System.out.println();
       }
       System.out.println();
   }

   void figureThree(int q,int w,char r){
       for (int i = 0; i < q; i++) {
           for (int j = i; j < w; j++) {
               System.out.print("  ");
           }
           for (int j = 0; j <= i; j++) {
               System.out.print(r + " ");
           }
           System.out.println();
       }
       System.out.println();
   }

   void figurefour(int t,char u){
       for (int i = 0; i < t; i++) {
           for (int j = 0; j < i; j++) {
               System.out.print("  ");
           }
           for (int j = i; j < t; j++) {
               System.out.print(u + " ");
           }
           System.out.println();
       }
       System.out.println();
   }

   void figureFive(int g,int h,char k,int l){
       for (int i = 0; i < g; i++) {
           for (int j = i; j < h; j++) {
               System.out.print(" ");
           }
           for (int j = 0; j <= i; j++) {
               System.out.print(k + " ");
           }
           System.out.println();
       }
       for (int i = 0; i < l; i++) {
           for (int j = 0; j <= i; j++) {
               System.out.print(" ");
           }
           for (int j = i; j < l; j++) {
               System.out.print(k + " ");
           }
           System.out.println();
       }
       System.out.println();
   }
}
