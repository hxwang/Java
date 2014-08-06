Overview
---

#### Idea
- Define the collection type just once and have it work for all types of elements. This goal can be accomplished by using **polymorphic abstractions**.
	- e.g. the `Vector` abstraction is polymorphic with respect to its element type 
- Implementation: In Java, polymorphism is expressed through **hierarchy**. 
	- Certain arguments are declared to belong to some supertype, and then the actual arguments can be objects belonging to subtypes of that type. The supertype is often `Object`.
	
#### Summary
- Polymorphism generalizes abstractions so that they work for many types. It allows us to avoid having to redefine abstractions when we want to use them for more types; instead, a single abstraction becomes much more widely useful.
- A procedure or iterator can be polymorphic with respect to the type of one or more arguments. A data abstraction can be polymorphic with respect to the type of elements its object contain.