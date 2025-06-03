
---

# Partial Sorting of Array Elements Below a Threshold

## Description

This Java program partially sorts elements of an array that are below a certain threshold (in this case, 100). It extracts all values less than 100 into a separate list, sorts this list, and then places the sorted values back into their original positions in the array, while leaving other elements untouched.

## Features

* Selectively sorts elements below 100.
* Preserves the relative positions of elements ≥ 100.
* Uses `ArrayList` and `Collections.sort()` for sorting the subset.
* Prints the updated array after partial sorting.

## Code Structure

* `Question3` class: Contains the main method performing partial sorting and output.

## How to Run

1. Compile the program:

   ```bash
   javac Question3.java
   ```

2. Run the program:

   ```bash
   java Question3
   ```

## Sample Output

```
300 220 40 50 60 200 
```

## Explanation

* The program iterates through the original array, extracting elements less than 100 into an `ArrayList`.
* The subset list is sorted using `Collections.sort()`.
* Sorted values are then placed back into the original array at the positions where elements were less than 100.
* Elements greater than or equal to 100 remain unchanged in their original positions.
* Finally, the modified array is printed.

## Requirements

* Java JDK 8 or above
* Basic knowledge of arrays, lists, and sorting in Java
