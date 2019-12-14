class RottenP2 {

    

public static void main (String [] args) {  

    

int[][] ratings = {{4,6,2,5},{7,9,4,8},{6,9,3,7}};

reviewerAvgRatings(ratings, 1);

    

    }  

    

public static int reviewerAvgRatings (int [] [] ratings, int reviewer) {  

    

int length = ratings[0].length;  

int rating1 = ratings [reviewer] [0];
int rating2 = ratings [reviewer] [1];
int rating3 = ratings [reviewer] [2];
int rating4 = ratings [reviewer] [3];

int average = (rating1 + rating2 + rating3 + rating4)/length;

System.out.println(average);

return average;

    }

}