# Sort Manager

## Installation:
- Clone repo and install Mavern dependencies

## Usage:
#### This is a sort manager which contains four sorting algorithms. 
#### The model view controller (MVC) concept has been used to create the structure of the application.
##### You can choose to sort random arrays using binary sort, bubble sort, or merge sort.
##### You can also merge two randomly generated sorted arrays if you select 2 in the main menu.
An adapter class was used to create methods for converting arrays into binary trees and binary trees to arrays, 
there is also an option to sort a given array which automatically generates a new binary tree.

You should be greeted by a user interface like this:
![img.png](img.png)
- Choose sorting method: ![img_2.png](img_2.png)****
- Chose number of elements to include in the unsorted array: ![img_3.png](img_3.png)
- Choose to compare with another algorithm: ![img_4.png](img_4.png)
- View the result: ![img_6.png](img_6.png)

Sorting algorithm example test cases:
![img_1.png](img_1.png)
Binary node tests:
![img_5.png](img_5.png)
There are also tests available for other sorting algorithms and the binary tree.

Some custom exceptions are also thrown such as NotNaturalException