#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;
bool cmp(const string &a,const string &b){
    if(a.length() != b.length()) {
        return a.length() < b.length();
    }
    else if(a.length() == b.length()){
    int sumA = 0, sumB = 0;
    for(char c : a) if(isdigit(c)) sumA += (c - '0');
    for(char c : b) if(isdigit(c)) sumB += (c - '0');
    if(sumA != sumB) {
        return sumA < sumB;
    }

        return a < b;
}
}
int main(){
    int n;
    cin >> n;
    vector<string> v(n);

    for (int i = 0; i < n; i++) {
        cin >> v[i]; 
    }

    sort(v.begin(), v.end(), cmp);

    for(const string &str : v){
        cout << str << '\n';
    }
}