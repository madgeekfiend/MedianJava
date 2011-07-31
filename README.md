Meidan(JAVA)
============

---
Given an array of Y elements in an unsorted order. Give the median of the array. For example, the array is [2,4,3,1,5] it 
should return the median of 3. Of an array that is [6,3,7,4,2,5] should return 4.5 and array with an even sized length
should return the middle 2 most elements so an array of size 6 should return the average of elements 3 & 4 of a 1 based
size array.

This uses no native library or 3rd party functions to sort or calculate the median. The sort method used is bubble sort a very
naive approach of comparing two elements and if you want to sort in an ascending order swap the greater value if it is to 
the left. This algorithm completes in O(n^2) time.

You can view the RUBY version at https://github.com/madgeekfiend/MedianRuby

Author: Sam Contapay
Created: 7/30/2011