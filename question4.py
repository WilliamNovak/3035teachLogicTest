# Faça uma função que receba uma data no formato MM/DD/YYYY, exemplo: 03/01/2002. Você deverá informar a qual dia da semana essa data se refere.

from datetime import date

def weekDay():
    days = ['Segunda-feira','Terça-feira','Quarta-feira','Quinta-feira','Sexta-feira','Sábado','Domingo']

    data = date(year = year, month = mon, day = day)
    index = data.weekday()
    weekday = days[index]
    print(weekday)

d = input('Digite uma data(MM/DD/YYYY): ')
arrDate = d.split('/')

if len(arrDate) != 3:
    print('Data inválida!')
else:
    day = int(arrDate[0])
    mon = int(arrDate[1])
    year = int(arrDate[2])

    if year < 1:
        print('Ano inválido!')
    elif mon < 1 or mon > 12:
        print('Mês inválido!')
    elif day < 1 or (mon in [4,6,9,11] and day > 30) or (mon == 2 and day > 28) or day > 31:
        print('Dia inválido!')
    else:
        weekDay()