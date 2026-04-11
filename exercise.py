print('Enter and integer to determine whether it is an odd or even number, ')
number = int(input('Enter integer: '))
if number % 2 == 0:
    print(number, 'is an even number')
if number % 2 != 0:
    print(number, 'is an odd number')
