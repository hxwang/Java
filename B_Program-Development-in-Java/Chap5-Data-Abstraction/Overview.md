Data Abstraction
===

### Overview
- Why?
	- Data abstraction allow us to abstract from the details of how data objects are implemented to how the objects behave
	- Pros:
		- avoid defining the structure immediately when its uses are not well understand
		- make modification and maintenance easier: data abstraction limits the changes to just the implementation of the type; none of the using modules need be changed.
- How?
	- the new data types should incorporate abstraction both by parameterization and by specification
		- parameterization
		- specification: by making the operations part of the type
		``` java
		data abstraction = <objects, operations>
		```
	
