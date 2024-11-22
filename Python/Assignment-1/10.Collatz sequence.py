# Collatz sequence
# 1. For even numbers, divide by 2;
# 2. For odd numbers, multiply by 3 and add
# 1.
# 3. Repeat above steps, until it becomes 1.
# Input - 7
# Output- 7, 22, 11, 34, 17, 52, 26, 13, 40, 20,
# 10, 5, 16, 8, 4, 2, 1.

n =int(input("Enter Any Number:"))
#print(n)

while n != 1:
    if n % 2 == 0:
        n = n // 2
    else:
        n = 3 * n + 1
    if n != 1:
        print(n)
    else:
        print(n)