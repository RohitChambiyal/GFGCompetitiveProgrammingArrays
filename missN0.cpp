#include <iostream>
using namespace std;

int main() {
    
	    int t ;
	    cin>>t;
		while(t--!=0){
		    int n ;
		    cin>>n;
		    int arr[n];
		    for(int i=0;i<n-1;i++){
                cin>>arr[i];
            }
            int x =0;
            int y=0;
            for(int i=0;i<n-1;i++)
                x = x^arr[i];
            for(int i=1;i<=n;i++)
                y=y^i;
            cout<<(x^y)<<"\n";
		
	}
	
	return 0;
}