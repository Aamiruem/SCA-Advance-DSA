public class StringSplitting {
    public static void main(String[] args) {
        String str = "apple,banana,cherry";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
// Output:
// apple
// banana
// cherry






// The split function in Java is used to divide a string into an array of substrings based on a specified delimiter. The delimiter is a regular expression that defines where the splits should occur.

// In the provided code:

// Here's what happens step-by-step:

// The string str contains the value "apple,banana,cherry".
// The split method is called on str with the delimiter "," (a comma).
// The split method divides the string into an array of substrings wherever it finds a comma.
// The resulting array fruits contains three elements: ["apple", "banana", "cherry"].
// The for loop iterates over each element in the fruits array and prints it.
// The output is:
