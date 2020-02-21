#include <iostream>
#include<cmath>
using namespace std;

void countPairsBruteForce(int X[], int Y[], int m, int n) 
{ 
    int ans = 0; 
    for (int i = 0; i < m; i++) 
       for (int j = 0; j < n; j++) 
          if (pow(X[i], Y[j]) > pow(Y[j], X[i])) 
              ans++; 
    cout<<ans; 
} 

int main() {

		int t;
		cin>>t;
		while(t--!=0){
		    int n1;
		    cin>>n1;
		    int n2 ;
		    cin>>n2;
		    int arr1[n1];
		    int arr2[n2];
		    for(int i=0;i<n1;i++){
		        cin>>arr1[i]; 
            }
		    for(int i=0;i<n2;i++){
		        cin>>arr2[i]; 
            }
		        

		countPairsBruteForce(arr1,arr2,n1,n2);
        }
	return 0;
}