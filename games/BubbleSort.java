public class BubbleSort
{
    static int i,j,k,tmp;
    public static void iterbubblesort(int ar[], int n){
        for(i = 0; i < n; i++){
            for(j = 0; j < n - 1 - i; j++){
                if(ar[j] > ar[j+1]){
                    tmp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = tmp;
                }
            }
        }
        System.out.println("Array in ascending sorted order using iterbs: ");
        for(i = 0; i < n; i++){
            while(i<n-1){
                System.out.print(ar[i]+","); 
                i++;
            }
            System.out.print(ar[i]);
        }
    }
    
    public static void recurbs(int ar[],int n){
        if(n == 1){
            return;
        }
        else
        {
            for (i = 0; i < n - 1; i++) 
            {
                if (ar[i] > ar[i + 1]) {
                    tmp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = tmp;
                }
           }
           recurbs(ar,n-1);
        }
    }
    
    public static void main(String[] args){
        int A[] = {5,4,3,2,1,17,19,12};
        int size = A.length;
        iterbubblesort(A,size);
        System.out.println();
        recurbs(A,size);
        System.out.println("Array in ascending sorted order using recurbs: ");
        for(i = 0; i < size; i++){
            while(i<size-1){
                System.out.print(A[i]+","); 
                i++;
            }
            System.out.print(A[i]);
        }
        System.out.println();
        System.out.println("Fun Coding!");
    }
}