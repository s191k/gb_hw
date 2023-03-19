from os import path

file_base = "base.txt"
last_id = 0
all_data = []

if not path.exists(file_base):
    with open(file_base, "w", encoding="utf-8") as _:
        pass

def read_records():
    global last_id, all_data

    with open(file_base, encoding="utf-8") as f:
        all_data = [i.strip() for i in f]
        if all_data:
            last_id = int(all_data[-1].split()[0])
            return all_data
    return []

def show_all():
    if all_data:
        print(*all_data, sep="\n")
    else:
        print("Empty data")

def add_new_contact():
    global last_id
    array = ["surname", "name", "patronymic", "phone_number"]
    string = ""
    for i in array:
        string += input(f"Enter {i} ") + " "
    last_id += 1

    with open(file_base, "a", encoding="utf-8") as f:
        f.write(f"{last_id} {string}\n")


def change_contact():
    array_of_fields = ["surname", "name", "patronymic", "phone_number"]
    if not _check_exists_of_data(): return
    show_all()
    answer = int(input("Введите номер записи, которую хотите изменить"))
    cur_data = all_data[answer-1].split(" ")
    field_name = input("Введите название поля которое хотите обновить")
    new_value = input("Введите новое значение")
    cur_data[array_of_fields.index(field_name) + 1] = new_value
    all_data[answer-1] = " ".join(cur_data)
    _write_data_in_file(all_data)

def delete_contact():
    global last_id
    if not _check_exists_of_data(): return
    show_all()
    answer = int(input("Введите номер записи, которую хотите удалить"))
    all_data.pop(answer-1)
    _rewrite_indexes()
    _write_data_in_file(all_data)

def search_record():
    if not _check_exists_of_data(): return
    search_type, search_info = input("Введите имя или фамилию :: name <искомое значение> или surname <искомое значение>").split(" ")
    array_of_fields = ["surname", "name", "patronymic", "phone_number"]
    for x in all_data:
        if x.split(" ")[array_of_fields.index(search_type) + 1] == search_info:
            print(x)

def import_in_file(file_path):
    global last_id, all_data
    with open(file_path, encoding="utf-8") as f:
        all_data_new = [i.strip() for i in f]
        if all_data_new:
            for x in all_data_new:
                all_data.append(x)
            _rewrite_indexes()
            _write_data_in_file(all_data)

def _write_data_in_file(new_all_data):
    with open(file_base, "w", encoding="utf-8") as f:
        for x in new_all_data:
            f.write(f"{x}\n")

def _rewrite_indexes():
    global last_id,all_data
    index = 1
    new_all_data = []
    for x in all_data:
        cur_contact = x.split(" ")
        cur_contact[0] = str(index)
        index += 1
        new_all_data.append(" ".join(cur_contact))
    all_data = new_all_data
    last_id = index

def _check_exists_of_data():
    read_records()
    if not all_data:
        print("нет записей")
        return False
    return True

def main_menu():
    play = True
    while play:
        read_records()
        answer = input("Phone book:\n"
                       "1. Show all records\n"
                       "2. Add a record\n"
                       "3. Search a record\n"
                       "4. Change\n"
                       "5. Delete\n"
                       "6. Exp/Imp\n"
                       "7. Exit\n")
        match answer:
            case "1":
                show_all()
            case "2":
                add_new_contact()
            case "3":
                search_record()
            case "4":
                change_contact()
            case "5":
                delete_contact()
            case "6":
                # экспорт вроде итак есть?
                import_in_file(input("Введите имя файла"))
            case "7":
                play = False
            case _:
                print("Try again!\n")


main_menu()