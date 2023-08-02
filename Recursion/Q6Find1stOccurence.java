public class Q6Find1stOccurence {
    public static int firstoccurance(int arr[],int n,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return firstoccurance(arr,n,i+1);
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(firstoccurance(arr,6, 0));
    }
}
