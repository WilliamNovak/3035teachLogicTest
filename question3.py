arrVowels = ['a','A','e','E','i','I','o','O','u','U']
s = input('Digite uma string: ')

vowels = []

for x in s:
    if x in arrVowels:
        vowels.append(x)

vowelsString = ''.join(vowels)

print(f'Vogais: {vowelsString}')