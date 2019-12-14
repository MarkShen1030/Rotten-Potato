class RottenP4 {

    

public static void main (String [] args) {  

    

int[][] ratings = {{4,6,2,5},{7,9,4,8},{6,9,3,7}};

hardestRater2018(ratings);

    }  

    

public static int hardestRater2018 (int [] [] ratings) {  

int sum1 = 0;
int sum2 = 0;
int sum3 = 0;

int grids = ratings[0].length;  

int average1 = 0;
int average2 = 0;
int average3 = 0;

    
    

for (int c = 0; c < ratings[0].length; c++) {
 sum1 += ratings[0] [c];
 sum2 += ratings[1] [c];
 sum3 += ratings[2] [c];
    }

average1 = sum1/grids;


average2 = sum2/grids;
average3 = sum3/grids;

if (average1 < average2 && average1 < average3) {
  System.out.println("reviewer 0");
  } else if (average2 < average1 && average2 < average3)  {
   System.out.println("reviewer 1");
  } else if (average3 < average1 && average3 < average2) {
    System.out.println("reviewer 2");   
  } 
  
  return sum1;
}

}
