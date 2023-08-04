public class Q7Findlastoccurance {
    public static int lastoccurance(int arr[],int key,int i){

        if(arr[i]==key){
            return i;
        }
        if(i==0){
            return -1;
        }
        return lastoccurance(arr, key, i-1);
    }
    public static void main(String[] args){
        int arr[]={5,5,5,5};
        int i=arr.length-1;
        System.out.println(lastoccurance(arr, 5, i));
    }
}
