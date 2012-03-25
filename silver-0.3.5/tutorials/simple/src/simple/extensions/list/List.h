#ifndef _LIST_H_
#define _LIST_H_

#include <algorithm>
#include <iostream>
#include <iterator>
#include <list>

#define FOREACH(it, c) for ( typeof((c).begin()) it = (c).begin(); it != (c).end(); ++it)

template <class T> class List {
    template<class S> friend std::ostream& operator<<(std::ostream&, const List<S>&);
 public:
    // constructors
    List() { }

    List(std::list<T> _data): data(_data.begin(), _data.end()) { }

    List(int n, T e): data(n, e) { }

    List(T hd, List<T> tail) {
	tail.push_front(hd);
	*this = tail;
    }

    List(const List<T>& lst): data(lst.data.begin(), lst.data.end()) { }

    List(const List<T>& a, const List<T>& b) {
	data = a.data;
	FOREACH(it, b.data) {
	    data.push_back(*it);
	}
    }

    // overload operators
    T operator[] (size_t n) {
	if ( n >= length() ) {
	    std::cerr << "Out of boundry!" << std::endl;
	    exit(1);
	}
	typeof(data.begin()) it = data.begin();
	for (size_t i = 0; i != n; ++i, ++it)
	    ;
	return *it;
    }

    // apply func to all the element of data
    void apply( T func(T) ) {
	FOREACH(it, data) {
	    *it = func(*it);
	}
    }

    // filter
    void filt( bool pred(T) ) {
	data.erase( stable_partition(data.begin(), data.end(), pred), data.end() );
    }

    // push_front
    void push_front(T e) {
	data.push_front(e);
    }
    // push_back
    void push_back(T e) {
	data.push_back(e);
    }

    // head
    T head() {
	if ( length() ) {
	    return data.front();
	}
	else {
	    std::cerr << "No head for empty List!" << std::endl;
	    exit(1);
	}
    }

    // tail
    List<T> tail() {
	if ( length() ) {
	    return List<T>( std::list<T>(++data.begin(), data.end()) );
	}
	else {
	    std::cerr << "No tail for empty List!" << std::endl;
	    exit(1);
	}
    }

    size_t length() { return data.size(); }
    bool empty() { return data.empty(); }

 private:
    std::list<T> data;
};

template <class T>
std::ostream& operator<<(std::ostream& out, const List<T>& lst) {
    std::copy(lst.data.begin(), lst.data.end(), std::ostream_iterator<T>(out, " "));
    return out;
}

template <class T>
List<T> cons(T e, List<T> lst) {
    lst.push_front(e);
    return lst;
}

template <class T>
List<T> maps( List<T> lst, T func(T) ) {
    lst.apply(func);
    return lst;
}

template <class T>
List<T> filter( List<T> lst, bool pred(T) ) {
    lst.filt(pred);
    return lst;
}

template <class T>
List<T> append( List<T> a, List<T> b) {
    return List<T>(a, b);
}

template <class T>
T fold(T func(T, T), T init, List<T> lst) {
    T res = init;
    while ( !lst.empty() ) {
	res = func(res, lst.head());
	lst = lst.tail();
    }
    return res;
}

#endif
