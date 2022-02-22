public class arrayAssisted {

public static void main(String[] args) {

//single-dimensional array
int r[]= {10,20,30,40,50};
for(int i=0;i<5;i++) {
System.out.println("Elements of array r: "+r[i]);
}


//multidimensional array
int[][] b = {
            {2, 4, 6, 8}, 
            {3, 6, 9} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}

