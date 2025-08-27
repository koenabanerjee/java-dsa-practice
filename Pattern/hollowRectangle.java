package Pattern;

public class hollowRectangle {
    
    public static void hollowRec(int totalRows, int totalCols){
        //OUTER LOOP
        for(int i = 1;i<=totalRows;i++){
            //INNER LOOP
            for(int j = 1;j<=totalCols;j++){
                if( i == 1 || i == totalRows || j ==1 || j==totalCols){ //BOUNDARY CONDITIONS;
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRec(4,5);
    }
}
