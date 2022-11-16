public class Array {
    public static void main(String args[]){
        int[] marks=new int[3];
        marks[0]=93;
        marks[1]=97;
        marks[2]=98;
        int[] mark={87,89,76};//1-D array
        int[][] finalmark={{90,87,76},{98,97,56}};//2-D array
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(finalmark[0][0]);/*2-d array output*/
        System.out.println(finalmark[0][1]);
        System.out.println(finalmark[0][2]);
        System.out.println(finalmark[1][0]);
        System.out.println(finalmark[1][1]);
        System.out.println(finalmark[1][2]);
    }
    
}
