package array_2d;

public class WavePrint {
    public static void main(String[] args) {
        int[][] arr={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        transposeOfArray(arr);
    }

    private static void transposeOfArray(int[][] arr) {
        int rows= arr.length;
        int cols=arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
