"""
Задача 22: Даны два неупорядоченных набора целых чисел (может быть, с повторениями).
 Выдать без повторений в порядке возрастания все те числа, которые встречаются в обоих наборах.
Пользователь вводит 2 числа. n - кол-во элементов первого множества. m - кол-во элементов второго множества.
 Затем пользователь вводит сами элементы множеств.
"""

import random

def get_unique_nums_in_both_arr(n,m):
    n_arr = list(set([random.randint(1,100) for _ in range(n)]))
    m_arr = list(set([random.randint(1,100) for _ in range(m)]))
    res = list(set([x for x in n_arr if x in m_arr]))
    # print(n_arr)
    # print(m_arr)
    print(res)

get_unique_nums_in_both_arr(20,20)