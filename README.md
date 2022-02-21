# MultiThreading-CreditCard
****Comparing single threading and multithreading***

-Allows the user to input a credit card number to validate.
-The project has both a single threading and multithreading feature in order to compare.  

To validate each credit card number:
  Credit card numbers follow a certain pattern. The number must have between 13 and 16 digits. The 
  number must start with:
    • 4 for Visa Cards
    • 5 for Master Cards
    • 3 for American Express cards
    • 6 for Discover Card cards
    
Using Luhn's Algorithm:
  1. Double every second digit from right to left. If doubling of a digit results in a two-digit 
     number, add up the two digits to get a single-digit number.

     4388576018402626
     -2 * 2 = 4
     -2 * 2 = 4
     -4 * 2 = 8
     -1 * 2 = 2
     -6 * 2 = 12 (1 + 2 = 3)
     -5 * 2 = 10 (1 + 0 = 1)
     -8 * 2 = 16 (1 + 6 = 7)
     -4 * 2 = 8
  
  2. Now add all single-digit numbers from Step 1. 4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37

  3. Add all digits in the odd places from right to left in the card number. 4388576018402626
     6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38

  4. Sum the results from Step 2 and Step 3. 37 + 38 = 75

  5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is 
     invalid. (75 % 10 == 0) //this is false so the card is not valid.

Results: Multithreading was significantly faster than single threading.
  




   
