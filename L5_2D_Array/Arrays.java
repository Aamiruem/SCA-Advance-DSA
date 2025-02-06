// package L52D_Array;

// public class Arrays {
    
// }



// A 2D array, also known as a matrix, is an array of arrays. Here's an example of how to create and manipulate a 2D array in Python:

// Example: Creating and Accessing a 2D Array
// python
// Copy
// # Creating a 2D array (matrix)
// matrix = [
//     [1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]
// ]

// # Accessing elements in the 2D array
// print("Element at row 1, column 2:", matrix[0][1])  # Output: 2
// print("Element at row 2, column 3:", matrix[1][2])  # Output: 6

// # Printing the entire matrix
// print("Matrix:")
// for row in matrix:
//     print(row)
// Example: Modifying a 2D Array
// python
// Copy
// # Modifying an element in the 2D array
// matrix[1][1] = 10

// # Printing the modified matrix
// print("Modified Matrix:")
// for row in matrix:
//     print(row)
// Example: Creating a 2D Array with List Comprehension
// python
// Copy
// # Creating a 2D array with list comprehension
// rows = 3
// cols = 4
// matrix = [[0 for _ in range(cols)] for _ in range(rows)]

// # Printing the matrix
// print("Matrix with list comprehension:")
// for row in matrix:
//     print(row)
// Example: Summing All Elements in a 2D Array
// python
// Copy
// # Summing all elements in the 2D array
// total_sum = sum(sum(row) for row in matrix)
// print("Total sum of all elements:", total_sum)
// Example: Transposing a 2D Array
// python
// Copy
// # Transposing the matrix (swapping rows and columns)
// transposed_matrix = [[matrix[j][i] for j in range(len(matrix))] for i in range(len(matrix[0]))]

// # Printing the transposed matrix
// print("Transposed Matrix:")
// for row in transposed_matrix:
//     print(row)
// Example: Multiplying Two 2D Arrays (Matrices)
// python
// Copy
// # Function to multiply two matrices
// def multiply_matrices(a, b):
//     result = [[0 for _ in range(len(b[0]))] for _ in range(len(a))]
//     for i in range(len(a)):
//         for j in range(len(b[0])):
//             for k in range(len(b)):
//                 result[i][j] += a[i][k] * b[k][j]
//     return result

// # Example matrices
// matrix_a = [
//     [1, 2, 3],
//     [4, 5, 6]
// ]

// matrix_b = [
//     [7, 8],
//     [9, 10],
//     [11, 12]
// ]

// # Multiplying matrices
// result_matrix = multiply_matrices(matrix_a, matrix_b)

// # Printing the result
// print("Result of matrix multiplication:")
// for row in result_matrix:
//     print(row)
// These examples cover basic operations on 2D arrays in Python. You can expand on these to perform more complex operations depending on your needs.
