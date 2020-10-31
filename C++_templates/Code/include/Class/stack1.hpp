#pragma once
#include <cassert>
#include <ostream>
#include <vector>

template<typename T>
class Stack {
private:
	std::vector<T> elems; // elements
public:
	void push(T const& elem); // push element
	void pop(); // pop element
	T const& top() const; // return top element
	bool empty() const
	{
		// return whether the stack is empty
		return elems.empty();
	}

	void printOn(std::ostream& strm) const
	{
		for (T const& elem : elems) {
			strm << elem << ' '; // call << for each element
		}
	}

	template<typename U>
	friend std::ostream& operator<< (std::ostream& strm, Stack<U> const& s);
};
template<typename T>
void Stack<T>::push(T const& elem)
{
	elems.push_back(elem); // append copy of passed elem
}
template<typename T>
void Stack<T>::pop()
{
	assert(!elems.empty());
	elems.pop_back(); // remove last element
}
template<typename T>
T const& Stack<T>::top() const
{
	assert(!elems.empty());
	return elems.back(); // return copy of last element
}

template<typename U>
std::ostream& operator<< (std::ostream& strm, Stack<U> const& s) {
	s.printOn(strm);
	return strm;
}