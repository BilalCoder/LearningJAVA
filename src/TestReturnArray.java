
class TestReturnArray{
    //creating method which returns an array
    static int[] get(){
        int []arr = {10,30,50,90,60};
        return arr;
    }

    public static void main(String args[]) {
        //calling method which returns an array
        int arr[] = get();
        //printing the values of an array
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println("________________________________________");
        int arr1[] = {50, 60, 70, 80};
        for (int i = 0; i <= arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

}
