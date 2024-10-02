/*Two Dimensional array is use for matrix representation*/

public class TwoDimensional{
    public static void main(String[] args){
        
        /* [The coloumn value: i] [The row value: j] */

        int[][] array = { {1, 2, 3,},  {4, 5, 6},  {7, 8, 9},  {10, 11, 12}};

        /*here i < 3 means: {1,2,3} value er number of index */

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(array[2][2]);
    }
}