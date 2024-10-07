public class Nested{
    public static void main(String[] args){
        int arr[][] = { {1,2,3,6}, {4,5,6,9}, {7,8,9,4}, {10,11,12,6}};

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}