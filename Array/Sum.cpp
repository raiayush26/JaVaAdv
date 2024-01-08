#include<iostream>
using namespace std;
int getSum(int *arr ,int n){
    if(n==0){return 0;}
        if(n==1){return arr[0];}
    //    int rp = 
        int sum = arr[0]+ getSum(arr+1, n-1);      
        return sum;
}
 
int main(){
     int arr[5] = {2,4,9,9,9};
     int size= 5;
     int sum = getSum(arr,size);
     cout<< "Sum is "<< sum<<endl;
     return 0;
}