#include <iostream>
using namespace std;

int main() {
	
		
		int t;
		cin>>t;
		while(t--!=0){
		    int n;
		    cin>>n;
		    int k;
		    cin>>k;
		    int arr[n];
		    for(int i=0;i<n;i++)
		        cin>>arr[i];
		    
		    for(int i=0;i<n;i=i+k){
		        int left = i;
		        int right; 
		        if((i+k-1)<n-1)
		        right = i+k-1;
		        else
		        right = n-1;
		        while(left<right){
		            int temp = arr[left];
		            arr[left] = arr[right];
		            arr[right] = temp;
		            left++;
		            right--;
		        }
		    }
            for(int i=0;i<n;i++){
		        cout<<arr[i]<<" ";
		    }
		    cout<<"\n";
		}
	
	return 0;
}