package ARRAYS;
public class arrays3 {
    public static void main(String[] args) {
        int [][] matrix=new int[4][5];
        matrix[0][0]=13;
        matrix[0][1]=-21;
        matrix[0][2]=44;
        matrix[0][3]=8;        
        matrix[0][4]=-21;    
        
        
        matrix[1][0]=22;
        matrix[1][1]=-88;
        matrix[1][2]=12;
        matrix[1][3]=77;        
        matrix[1][4]=33;
        
        
        matrix[2][0]=21;
        matrix[2][1]=22;
        matrix[2][2]=-33;
        matrix[2][3]=-86;        
        matrix[2][4]=37;    


        matrix[3][0]=-43;
        matrix[3][1]=35;
        matrix[3][2]=93;
        matrix[3][3]=70;        
        matrix[3][4]=26;  
        //   System.out.println("Valor "+ matrix[2][3]);
          for(int i=0; i<4;i++){
            System.out.println();
            for(int j=0;j<5;j++){
                System.out.print(matrix[i][j]+" ");

            }
          }

    }  
}
