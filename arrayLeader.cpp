#include <iostream>
using namespace std;

int main() {
		
		int t;
		cin>>t;
		while(t--!=0){
		    int n;
		    cin>>n;
		    int arr[n];
		    for(int i=0;i<n;i++)
		        cin>>arr[i];
		    int max = arr[n-1];
		    int count=1;
		    int sol[n];
		    sol[0]= max;
		    for(int i=n-2;i>=0;i--){
		        if(arr[i]>=max){
		            max = arr[i];
		            sol[count]=max;
		            count++;
		            
		        }
		    }
		    for(int i=count-1;i>=0;i--){
		            cout<<sol[i]<<" ";
		        
		    }
		    cout<<"\n";
		}
	
	return 0;

}