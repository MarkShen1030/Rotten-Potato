class RottenP3 {

    

public static void main (String [] args) {  

    

int[][] ratings = {{4,6,2,5},{7,9,4,8},{6,9,3,7}};

reviewerAvgRatings(ratings);

    }  

    

public static int reviewerAvgRatings (int [] [] ratings) {  

int sum = 0;
int grids = ratings[0].length * ratings.length;  
int average = 0;
    
    
    
for (int r = 0; r < ratings.length; r++) {
    
   
for (int c = 0; c < ratings[0].length; c++) {
 sum += ratings[r] [c];
    }

    
  }
  
average = sum/grids;  
 System.out.println(average);
 return average;
 }
}