public class Multidimensional_Array {
    public static void main(String[] args) {

        int matrix[][] = new int[3][3];  
        
        int anotherMatrix[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };
        
        int element = anotherMatrix[1][2];
        int c = anotherMatrix[0].length;
        int r = anotherMatrix.length;

        

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                System.out.print(anotherMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // for(int i[] : anotherMatrix){
        //     for(int j : i){
        //         System.out.println(j);
        //     }
        // }

    }
}
