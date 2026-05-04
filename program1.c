#include<stdio.h>
void bubbleSort(int arr[], int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] =  arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    }
    int main(){
        int arr[100],n;
        printf("Enter the numer of elements in the array: ");
        scanf("%d", &n);
        printf("Enter the array elements: ");
        for(int i=0;i<n;i++){
            scanf("%d", &arr[i]);
        }
        bubbleSort(arr,n);
        printf(" The sorted Array is: ");
        for(int i=0; i<n; i++){
            printf("%d ", arr[i]);
        }
        return 0;
    }
    
