Overview
===


### Definition
- Iterators: are a generalization of the iteration mechanisms available in most programming languages. They permits users to iterate over arbitrary types of data in a convenient way.

- Solution: a general mechanism of iteration that is convenient and efficient and that preservers abstraction. 
	- An iterator is a special kind of procedure that causes the items we want to iterate over to be produced **incrementally**.
	- Note that iterator causes items to be produced **once at a time**, it avoid space and time problem discussed earlier. We need not construct a potentially large data structure to contain the items.
	
### Other not suitable approaches
- members
	``` java
	public int[] members()
		//EFFECTS: Return an array containing the elements of this
		// each exactly once, in some arbitrary order
	```
	- Cons: It is inefficient, especially if the IntSet is large.
- return the representation vector
	- Cons: it destroys abstraction by exposing the rep


