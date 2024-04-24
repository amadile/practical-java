public class ForEachLoop {
    
    public static void main(String[] args){
        int arr[]=new int[5];
        arr[0]=19;
        arr[1]=28;
        arr[2]=73;
        arr[3]=43;
        arr[4]=12;
        /*for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }*/
        for(int k:arr){
            System.out.println(k);
        }
    }
}
