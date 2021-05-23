# Topological Sorting
[![CMake](https://github.com/MaratGin/semester-work-topological-sorting/actions/workflows/cmake.yml/badge.svg)](https://github.com/MaratGin/semester-work-topological-sorting/actions/workflows/cmake.yml)



🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺🐺

[Наша папка на гугл диске](https://drive.google.com/drive/folders/1sHAlPq_tZUuv0cQ1u_QsZKdvk7i4IR5r)


_Краткое описание семестрового проекта. Следует отразить информацию по следующим пунктам:_

- _Какой алгоритм сортировки реализуется?_
<br/>***Алгоритм сортировки - Topological Sorting (Топологическая сортировка).***
- _Что он из себя представляет (сбалансированное дерево, линейный список и пр.)?_
<br/>***Топологическая сортировка — упорядочивание вершин бесконтурного ориентированного графа согласно частичному порядку, заданному ребрами орграфа на множестве его вершин.***
- _Где и как она используется (приложения)?_
<br/>***в основном используется для составления графика работ из заданных зависимостей между ними. В компьютерных науках применяется для планирования команд, упорядочения ячеек для вычисления формулы при повторном вычислении значений формул в электронных таблицах, логического синтеза, определения порядка задач компиляции для выполнения в make-файлах, сериализации данных и разрешения символьных зависимостей в компоновщиках ***
- _Какова теоретическая сложность операций?_
<br/>***O(V + E), где v- количество вершин, а E - количество ребер***

[- _Какая-то другая справочная информация о проекте._](https://ru.wikipedia.org/wiki/Топологическая_сортировка#:~:text=Топологическая%20сортировка%20—%20упорядочивание%20вершин,орграфа%20на%20множестве%20его%20вершин)
## Команда "В цирке не выступаем"

_Заполните таблицу с указанием вклада каждого из участников в проект._

**Примечание**. Преподаватель может определить вклад любого из участников команды по истории коммитов.

| Фамилия Имя        | Вклад (%) | Прозвище              |
| :---               |   ---:    |  ---:                 |
| Гиниятов Марат     | 40        |  Бүре                 |
| Зиянгиров Руслан   | 30        |  Волк                 |
| Гатин Рамиль       | 30        |  Wolf                 |

**Девиз команды**
> Каждый думает, что знает меня, но не каждый знает, что не знает, кто думает.........._

## Структура проекта

_Описание основных частей семестрового проекта._

**Пример**. Проект состоит из следующих частей:

- [`src`](src)/[`include`](include) - реализация структуры данных (исходный код и заголовочные файлы);
- [`benchmark`](benchmark) - контрольные тесты производительности структуры данных (операции добавления, удаления,
  поиска и пр.);
- [`examples`](examples) - примеры работы со структурой данных;
- [`dataset`](dataset) - наборы данных для запуска контрольных тестов и их генерация;

## Требования (Prerequisites)

_В этом разделе задаются основые требования к программному и аппаратному обеспечению для успешной работы с проектом._

**Пример**. Рекомендуемые требования:

1. С++ компилятор c поддержкой стандарта C++17 (например, _GNU GCC 8.1.x_ и выше).
2. Система автоматизации сборки _CMake_ (версия _3.12.x_ и выше).
3. Интерпретатор _Python_ (версия _3.7.x_ и выше).
4. Рекомендуемый объем оперативной памяти - не менее 4 ГБ.
5. Свободное дисковое пространство объемом ~ 3 ГБ (набор данных для контрольных тестов).
6. Наличие виртуальная машина Java(JVM), наличие JDK версии 1.8.0. Для запуска генератора наборов данных для тестов.

## Сборка и запуск

_Инструкция по сборке проекта, генерации тестовых данных, запуска контрольных тестов и примеров работы._

_Постарайтесь написать инструкцию так, чтобы незнакомый с проектом человек смог самостоятельно всё запустить._

### Пример (Windows)

#### Сборка проекта

_Опишите процесс сборки проекта._

Склонируйте проект к себе на устройство через [Git for Windows](https://gitforwindows.org/) (либо используйте
возможности IDE):

```shell
git clone https://github.com/MaratGin/semester-work-topological-sorting.git
```

Для ручной сборки проекта в терминале введите:

```shell
# переход в папку с проектом
cd C:\Users\username\asd-projects\semester-topological-sorting

# создание папки для файлов сборки (чтобы не засорять папку с проектом) 
mkdir -p build && cd build 

# сборка проекта
cmake .. -DCMAKE_BUILD_TYPE=RelWithDebInfo && cmake --config RelWithDebInfo --build . 
```

#### Генерация тестовых данных

Генерация тестового набора данных в
формате [comma-seperated values (CSV)](https://en.wikipedia.org/wiki/Comma-separated_values):

Тестовые данные представлены в CSV формате (см.
[`dataset/data/dataset-example.csv`](dataset/data/dataset-example.csv)):

```csv
0,2,0,1,1,2,2,1,1,1,1,1,1,2,1,1,1,1,1,1,0,2,2,0,1,0,1,1,1,1,2,
...
```

**Расположение файлов в папке data:**

```shell
dataset/data/
      01.csv
      ...
      11.csv
```

файлы 01.csv - 11.csv содержат в себе случайны набор чисел **01.csv-40 элементов, 11.csv-9 000 элементов**. 

#### Контрольные тесты (benchmarks)

При тестировании измерялось только **время** выполнения на 11 наборах данных   (40, 100, 200, 400, 800, 1 600, 2 800,4 000, 4 800, 6 000, 9 000 чисел).


Для запуска контрольных тестов необходимо предварительно сгенерировать или скачать готовый набор тестовых данных.

Наборы данных должны находиться в папке семестровой работы на [Google Drive](https://drive.google.com/drive/folders/1sHAlPq_tZUuv0cQ1u_QsZKdvk7i4IR5r). (Вес файла-  300 МБ)

##### Список контрольных тестов

| Название                  | Описание                                | Метрики         |
| :---                      | ---                                     | :---            |
| Топологическая сортировка | Проход по сортировке                    | _время_         |

##### Примеры запуска

Чтобы замерить время выполнения операции необходимо сделать несколько шагов:
* Найдите .cpp файл `demo_benchmark.cpp` в папке `benchmark`.
* Измените путь в поле path(путь должен вести к одному из .csv файлов (01.csv,02...11.сsv):
![Картинка](https://i.gyazo.com/7fd10ea36f375bdfdbfbc8205ebf1ac2.png)  

* В самом коде достаточго убрать комментирование с методов, чтобы замерить операцию 

* Результат замера будет выведен в консоли
![Картинка](https://i.gyazo.com/d91e85032c4a2ccc019a95fa2b04cc23.png)

## Источники

_Список использованных при реализации структуры данных источников._
*[https://habr.com/ru](https://habr.com/ru/company/otus/blog/499138/)*
*[https://e-maxx.ru](https://e-maxx.ru/algo/topological_sort)*
*[https://ru.wikipedia.org](https://ru.wikipedia.org/wiki/Топологическая_сортировка)*

_**Это не плагиат, это уважение чужого труда и помощь своим сокурсникам более подробно разобраться в теме.**_
