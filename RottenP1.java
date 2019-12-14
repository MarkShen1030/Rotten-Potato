class RottenP1 {

    

public static void main (String [] args) {  

    

int[][] ratings = {{4,6,2,5},{7,9,4,8},{6,9,3,7}};

movieAvgReview(ratings, 1);

    

    }  

    

public static int movieAvgReview (int [] [] ratings, int movie) {  

    

int length = ratings[0].length-1;  

int rating1 = ratings [0] [movie];
int rating2 = ratings [1] [movie];
int rating3 = ratings [2] [movie];

int average = (rating1 + rating2 + rating3)/length;

System.out.println(average);

return average;

    }

}