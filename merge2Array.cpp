#include <iostream>
using namespace std;

int main() {
	
       int t;
       cin>>t;
       while(t-- != 0){
        int n1;
        cin>>n1;
        int n2 ;
        cin>>n2;
        int arr1[n1] ;
        int arr2[n2] ;
        for(int i=0;i<n1;i++){
            cin>>arr1[i];
        };
        for(int i=0;i<n2;i++){
            cin>>arr2[i];
        }
        int i=0;int j=0;
        for(int x=0;x<n1+n2;x++){
            
            if(i>=n1){
                cout<<arr2[j]<<" ";
                //System.out.println(arr2[j]);
                j++;
            }
            else if(j>=n2){
                cout<<arr1[i]<<" ";
                //System.out.println(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                //System.out.println(arr2[j]);
                cout<<arr2[j]<<" ";
                j++;
            }
            else{
                //System.out.println(arr1[i]);
                cout<<arr1[i]<<" ";
                i++;
            }
       }
       cout<<"\n";
        
        

       }
	return 0;
}