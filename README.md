# Data-Structures

## Summary
This is a personal project that i am going to work because i wanted to remember how the Data Structures like trees, linked-list, Queue and some others work in a real program language. I studied Data Structures in my university a year ago, i know the theory behind this data structures but in the real implementation i am lack of skills to do it from the start

Then now i will start to implement all my knowledge in data structure with java, and to make it a little more difficult, i want to work with a LARGE amount of numbers (The Data Element that i will use on this project), and gonna compare how much time each type o data structure take to find a certain value in average.

## Day 1
For the start of the project i implement the first type of data structure that i leaned in university, the linked-list. It's simple for now, and the script can add, remove and find a certain value in the list.

The list is an object that has the pointer of the first and last data element with it, and it also has the size of itself just to facilitate some verifications.

I tried to create a big list, but above the 1,000,000 values on it, the java can't handle with the memory cost, then next time i will figure out how i gonna resolve it.

## Day 2
Today I added the two more Data Structures, the queue and the stack. It was pretty simple because i used the concept of linked list and just implement the behavior of this specific DS.

I changed the linked list too, because I was using the double linked list and I forgot that it was divided in linked list and double linked list. Then I changed the linked list to double linked list, and I didn't create a linked list because I used it concept in the queue and stack.

At the end I created a simple menu to create all the DS that I already implemented and test them, for now you can create a list, queue and stack, and in all of 3 you can add, remove, find, get and show all the elements, just follow the available options in the main menu.

## Day 3
Today I refactored the code, I learned some useful things in java like lambda expressions, and i thought that it would be improved my actual code.

Basically i create a new class to store some lambda expressions like, isNull, isNotNull, getUserInput and etc. With this i can use this small functions to change and improve things in the code, and combining them i can create more complex functions that can solve more specific problems

I change almost all the codes with this new functions and now the code is more readable, next time i gonna continue with the DS implementation

## Day 4
More refactory time, now i applied my recent knowledge with generics in java to make all the DS support different types of data elements in it. Now the list, queue and stack can store, integers, doubles, strings and etc.

Now i started to implement the Binary Tree, for now it has two methods, add a new element in the tree and show itself. I decided to use recursion with these methods because i thought it's more easy to implement like this, trees in general it's better to implement using recursion my professor said and trying to implement it now i agree with her.