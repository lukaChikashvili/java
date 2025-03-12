package patterns;

public class Patterns {
    public static void main(String[] args) {
        //pattern1(4);
        //pattern2(4);
        //pattern3(5);
        //pattern4(4);
        // pattern5(5);
        
    }

  // pattern 1
   /*
            *
            * *
            * * *
            * * * *
   */
    static void pattern1(int n) {
      for(int row = 1; row <= n; row++) {
        for(int col = 1; col <= row; col++) {
            System.out.print("* ");

        }

        System.out.println();

      }
    }

    // pattern 2
    /*      * * * * 
            * * * * 
            * * * * 
            * * * *         */
    static void pattern2(int n) {
      for(int row = 1; row <= n; row++) {
        for(int col = 1; col <= n; col++) {
            System.out.print("* ");
        }

        System.out.println();
       }
    }


    // pattern 3
    /*    * * * * * 
          * * * * 
          * * *
          * *
          *                */

    static void pattern3(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    // pattern 4
    /*   1
         12
         123
         1234     */

    static void pattern4(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            System.out.println();

        }
    }

    // pattern 5
    static void pattern5(int n) {
      for(int i = 0; i < 2 * n; i++) {
         int c = 0;
         for(int col = 0; col < c; col++) {
            System.out.print("* ");
         }
         System.out.println();
      }
    }

}
