Overview of Type Hierarchy
===

### Idea
- a way to enhance the **utility** of data abstraction by defining **families** of ralted types
- a type family is defined by a type hierarchy.
	- at the top of the hierarchy is a type whose specification defines the behavior common to all family members, including the **signatures** and **behaviors** of this type, which is refer to **supertype**.
	
### Summary
- Type hierarchy is used to **define families** consisting of supertype and its subtypes. The hierarchy can extend through many levels.
- Some type families are used to provide **multiple implementation** of a type, the subtype s provide different implementation of their supertype
- Subtype can extend the behavior of their supertype, by providing extra methods
- The **substitution principle** provides abstraction by specification for type families by requiring that subtypes behave inaccordance with the specification of their supertype.

### Benefits of Hierarchy
- Hierarchy can be used to define the relationship among a group of types, making it easier to understand the group as a whole.
- Hierarchy allows code to be written in terms of a supertype, yet work for many types-- all the subtypes of that supertype.
- Hierarchy provides **extensibility**: code can be written in terms of a supertype, yet continue to work when subtypes are defined later
- All of these benefits can be obtained only if subtypes obey the **substitution principle**

