List declarations: 
List<T> lst;                                // an empty list
List<T> lst(T hd, List<T> tl);              // a list where its head is hd and the tail list is tl
List<T> lst(List<T> other);                 // a copy of another list
List<T> lst(List<T> lst_a, List<T> lst_b);  // a list which is the concatenation of lst_a and lst_b
List<T> lst(int n, T e);                    // a list has n copies of the element e

List operations:
List<T> cons(T, List<T>);
List<T> maps(List<T>, T func(T));
List<T> filter(List<T>, bool pred(T));
List<T> fold(T func(T), T init, List<T>);
List<T> append(List<T>, List<T>);

Member functions that might be useful:
T head();
List<T> tail();
size_t length();
bool empty();

Get an element by its index:
lst[n];

Print a List:
out << lst;