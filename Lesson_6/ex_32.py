"""
Задача 32: Определить индексы элементов массива (списка), значения которых принадлежат заданному диапазону
(т.е. не меньше заданного минимума и не больше заданного максимума)
"""

import random
def indexes(arr,min_ind,max_ind):
    return [x for x in arr if min_ind < x < max_ind]

print(indexes([random.randint(0,10) for x in range(10)],3,7))

