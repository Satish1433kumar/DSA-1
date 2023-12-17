def reverse_number(n):
    rev=0

    while(n!=0):
        r=n%10
        rev=(rev*10)+r
        n//=10
    return rev
n=int(input("Enter a number : "))
print("reverse of a number is : ",reverse_number(n))