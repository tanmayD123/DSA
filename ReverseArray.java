package com.company;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        
        //2 pointer approach
        int start = 0;
        int end= arr.length - 1;

        while(start<=end)
        {
            int t1 = arr[start];
            arr[start] = arr[end];
            arr[end] = t1;

            start++;
            end--;
        }

        for(int i=0; i< arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
