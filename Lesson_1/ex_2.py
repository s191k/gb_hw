"""
Задача 2: Найдите сумму цифр трехзначного числа.

*Пример:*

123 -> 6 (1 + 2 + 3)
100 -> 1 (1 + 0 + 0) |
"""

def sum_of_numbers(number):
    res = 0
    for x in str(number):
        res += int(x)

    return res

