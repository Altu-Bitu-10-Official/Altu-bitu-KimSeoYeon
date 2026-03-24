#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main(){
    int w0, l0, t;
    cin >> w0 >> l0 >> t;

    int d, l, a;
    cin >> d >> l >> a;

    int w = w0;
    int ll = l0;
    bool danger1 = false;

    for(int i=0; i<d; i++){
        w += (l - (l0 + a));
        if(w <= 0 || ll <= 0){
            danger1 = true;
            break;
        }
    }

    if(danger1) cout << "Danger Diet" << '\n';
    else cout << w << " " << l0 << '\n'; 

    w = w0;  
    ll = l0;
    bool danger2 = false;
    
    for(int i=0; i<d; i++){
        w = w + l - (ll + a); 

        if(abs(l - (ll + a)) > t){
            ll += floor((l - (ll + a)) / 2); 
        }

        if(w <= 0 || ll <= 0){
            danger2 = true;
            break;
        }
    }

    if(danger2) {
        cout << "Danger Diet" << '\n';
    } else {
        cout << w << " " << ll << " ";
        if((l0 - ll) > 0) cout << "YOYO" << '\n';
        else cout << "NO" << '\n';
    }

    return 0; 
}