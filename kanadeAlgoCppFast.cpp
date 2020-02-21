#include <iostream>
using namespace std;

void findMaxContSum(int* arr, int n) {
    int c_sum =0;
    int max_sum = 0;
    int min_sum =-9999;
    bool check = false;
    for(int i=0;i<n;i++){
        if(arr[i]>0){
            check =true;
            c_sum+=arr[i];
            max_sum = (c_sum>max_sum)?c_sum:max_sum;
        }
        else{
            if(arr[i]>min_sum)
                min_sum = arr[i];
            if(c_sum+arr[i]>0){
                c_sum+=arr[i];
            }
            else{
                c_sum = 0;
            }
        }
    }
    if(check==true)
        cout<<max_sum<<"\n";
    else
        cout<<min_sum<<"\n";
    }
int main() {
	   
        int t;
        cin>>t;
        while(t--!=0){
        int n;
        cin>>n;
        int arr[n];
        for(int i=0;i<n;i++){
            cin>>arr[i]; 
        }   
        findMaxContSum(arr,n);
    }
	return 0;
}