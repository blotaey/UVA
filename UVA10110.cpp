#include<bits/stdc++.h>

#define int long long int
#define F first
#define S second
#define pb push_back
#define endl "\n"

using namespace std;

int32_t main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	int n;
	
	while(true){
		cin >> n;
		if(n == 0) break;
		
		int root = sqrt(n);
		int z = root * root;
		
		if(z==n) cout << "yes" << endl;
		else cout << "no" << endl;
	}
	
	return 0;
}
