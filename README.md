# Домашнее задание курса [OTUS Java Developer. Basic](https://otus.ru/lessons/java-basic/)

## ООП в Java. Практика.

---
[![Build](https://github.com/alexey-sidorov-dev/otus-java-oop-practice/workflows/Build/badge.svg)](https://github.com/alexey-sidorov-dev/otus-java-oop-practice/actions)
[![Check](https://github.com/alexey-sidorov-dev/otus-java-oop-practice/workflows/Check/badge.svg)](https://github.com/alexey-sidorov-dev/otus-java-oop-practice/actions)
![Language](https://img.shields.io/github/languages/top/alexey-sidorov-dev/otus-java-oop-practice)
[![License](https://img.shields.io/github/license/alexey-sidorov-dev/otus-java-oop-practice)](https://github.com/alexey-sidorov-dev/otus-java-oop-practice/blob/master/LICENSE)

### Цель

Попрактиковаться во взаимодействиях классов и объектов в Java.

### Задания

1. Реализовать классы Тарелка (максимальное количество еды, текущее количество еды) и Кот (имя,
   аппетит). Количество еды измеряется в условных единицах.
2. При создании тарелки указывается ее объем, и она полностью заполняется едой.
3. В тарелке должен быть метод, позволяющий добавить еду в тарелку. После добавления в тарелке не
   может оказаться еды больше максимума.
4. В тарелке должен быть boolean метод уменьшения количества еды, при этом после такого уменьшения в
   тарелке не может оказаться отрицательное количество еды (если удалось уменьшить еду так, чтобы в
   тарелке осталось >= 0 кусков еды, то возвращается true, в противном случае - false).
5. Каждому коту добавить поле сытость (когда создается кот, то он голоден). Если коту удалось
   покушать (хватило еды), сытость = true.
6. Считается, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
   наполовину сыт (это сделано для упрощения логики программы).
7. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки, вывести
   информацию о сытости котов в консоль.
