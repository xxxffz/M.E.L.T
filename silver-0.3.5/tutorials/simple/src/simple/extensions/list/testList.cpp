#include <iostream>
#include "List.h"

using namespace std;

int square(int x) { return x * x; }
bool odd(int x) { return x & 1; }
int max(int x, int y) { return std::max(x, y); }
int add(int x, int y) { return x + y; }

int main() {
    // Decl::List<T> name
    List<int> a;
    // test empty
    cout << a.empty() << endl; // expects 1
    // test cons
    a = cons(1, a);
    a = cons(2, a);
    a = cons(3, a);
    cout << a << endl; // expects 3 2 1
    // test empty
    cout << a.empty() << endl; // expects 0

    List<int> b = cons(4, a); // cons doesn't change a
    cout << b << endl; // expects 4 3 2 1

    // Decl::List<T> name(head, lst)
    List<int> c(5, b);
    cout << c << endl; // expects 5 4 3 2 1

    // Decl::List<T> name(lst)
    List<int> d(c);
    cout << d << endl; // expects 5 4 3 2 1

    // Decl::List<T> name(lst1, lst2)
    List<int> e(a, b);
    cout << e << endl; // expects 3 2 1 4 3 2 1

    // test maps
    List<int> f = maps(e, square);
    cout << f << endl; // expects 9 4 1 16 9 4 1

    // test fold
    cout << fold(max, 0, f) << endl; // expects 16
    cout << fold(add, 0, f) << endl; // expects 44

    // test filter
    List<int> g = filter(f, odd);
    cout << g << endl; // expects 9 1 9 1

    // test head
    cout << g.head() << endl; // expects 9

    // test tail
    cout << g.tail() << endl; // expects 1 9 1

    // test []
    cout << g[1] << endl; // expects 1

    // Decl::List<T> name(n, e)
    List<double> h(3, 22.2);
    cout << h << endl; // expects 22.2 22.2 22.2

    // test size
    cout << h.length() << endl; // expects 3

    List<double> i(3, 33.3);
    // test append
    cout << append(h, i) << endl; // expects 22.2 22.2 22.2 33.3 33.3 33.3

    return 0;
}
