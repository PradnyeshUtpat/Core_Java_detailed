public class Multidimensional_Array {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        
        int[][] anotherMatrix = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };
        
        int element = anotherMatrix[1][2];
        int c = anotherMatrix[0].length;
        int r = anotherMatrix.length;


        for (int[] ints : anotherMatrix) {
            for (int j = 0; j < c; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

         for(int[] i : matrix){
             for(int j : i){
                 j = (int) (Math.random()*10);
                 System.out.print(j + " ");
             }
             System.out.println();
         }

    }
}
