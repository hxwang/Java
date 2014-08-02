Exception
=========


- Why
	- A procedure often makes sense only for arguments in a subset of its domain
	- Partial procedure: is one way of coping with such situation
		- The caller of the partial procedure must ensure that the arguments are in the permitted subset of the domain, and the implementor can ignore arguments outside this subset.
		- Cons: the procedure may be called with arguments outside the subset, in this case, the procedure is allowed to do anything
		
- Robust program: one that continues to behave reasonably even in the presence of errors. 
	- It should behave in a well-defined way 
	- At least, it should halt with a meaningful error message and without causing damage to permanent data
	
- Exception Mechanism
	- It allows a procedure to either terminate normally, by returning a result, or exceptionally.
	- In Java, each exceptional termination corresponds to a different exception type. 
		- e.g. The get method of Vector has IndexOutOfBoundsException
		