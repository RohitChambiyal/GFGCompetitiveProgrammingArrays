#include <iostream>
using namespace std;
int equilibrium(int arr[], int n)  
{  
    int sum = 0; 
    int leftsum = 0; 
  
    
    for (int i = 0; i < n; ++i)  
        sum += arr[i];  
  
    for (int i = 0; i < n; ++i)  
    {  
        sum -= arr[i]; 
  
        if (leftsum == sum)  
            return i+1;  
  
        leftsum += arr[i];  
    }  
  
    
    return -1;  
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
	    cout<<equilibrium(arr,n)<<"\n";
	}
	return 0;
}