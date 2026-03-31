#include <iostream>
#include <set>
#include <algorithm>

using namespace std;

int main(){
    string s;
    cin >> s;

    set<string> c;

    for (int i = 0; i < s.length(); i++) {
    for (int j = 1; i + j <= s.length(); j++) {
        c.insert(s.substr(i, j));
    }
}
    cout << c.size();
    
    
}