package one.innovation.digital.array;

public class ArrayBidimensional {

    public static void main(String[] args) {
        int[][] meuArray = {{1,2,3,4}, {5,6,7}}; //4 colunas e 3 linhas

        for(int i = 0; i < meuArray.length; i++){
            for(int j = 0; j < meuArray[i].length; j++){
                System.out.println(meuArray[i][j]); //i percorre o índice 0{1,2,3,4} e depois o índice 1{5,6,7}
            }
        }
    }
}
