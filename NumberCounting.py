def noOfDigits(n):
    count = 0
    while(n!=0):
        n//=10
        count+=1
    return count
n=int(input("Enter the number : "))
print("Number of digits in",n,"is",noOfDigits(n))