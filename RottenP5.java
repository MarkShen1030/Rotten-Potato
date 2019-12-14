class RottenP5 {

    

public static void main (String [] args) {  

    

int[][] ratings = {{4,6,2,5},{7,9,4,8},{6,9,3,7}};

worstMovie2018(ratings);

    }  

    

public static int worstMovie2018 (int [] [] ratings) {  

int sum1 = 0;
int sum2 = 0;
int sum3 = 0;
int sum4 = 0;

int grids = ratings.length;  

int average1 = 0;
int average2 = 0;
int average3 = 0;
int average4 = 0;

    
    

for (int r = 0; r < ratings.length; r++) {
 sum1 += ratings[r] [0];
 sum2 += ratings[r] [1];
 sum3 += ratings[r] [2];
 sum4 += ratings[r] [3];
    }

average1 = sum1/grids;
average2 = sum2/grids;
average3 = sum3/grids;
average4 = sum4/grids;

if (average1 < average2 && average1 < average3 && average1 < average4) {
  System.out.println("movie 0");
  } else if (average2 < average1 && average2 < average3 && average2 < average4)  {
   System.out.println("movie 1");
  } else if (average3 < average1 && average3 < average2 && average3 < average4) {
    System.out.println("movie 2");   
  } else if (average4 < average1 && average4 < average2 && average4 < average3) {
  System.out.println("movie 3");
    }
  return sum1;
}

}
