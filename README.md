# Benchmark Tests for Android Application Startup

Этот проект включает в себя набор тестов для измерения времени запуска различных активностей в Android приложении `com.ato.fragmentscheck`. Бенчмарк тесты написаны с использованием библиотеки [Macrobenchmark](https://developer.android.com/studio/profile/macrobenchmark).

## Описание Тестов

В файле `ExampleStartupBenchmark.kt` реализованы четыре теста для измерения времени холодного запуска различных активностей:

1. **Simple Activity** (`SimpleActivity`):
   - Проверяет время запуска простой активности.
2. **3x30 Activity** (`Activity3x30`):
   - Проверяет время запуска активности с тремя view pager, в каждом из которых 30 фрагментов
   - итого 90 фрагментов.
3. **3x30x4 Activity** (`Activity3x30x4`):
   - Проверяет время запуска активности с тремя view pager, в каждом из которых 30 фрагментов и в каждом фрагменте еще 4 фрагмента
   - итого 360 фрагментов.
4. **3x30x4 No Fragments Activity** (`Activity3x30x4NoFragments`):
   - Проверяет время запуска активности с тремя view pager, в каждом из которых 30 фрагментов, и внутри которых 4 textview.
   - итого 90 фрагментов.
   - позволяет в сравнении с Activity3x30x4 понять, как повлияет уменьшение 360 -> 90 фрагментов на перформанс.

## Результаты Замеров

Результаты замеров представлены в таблице ниже, где для каждой активности приведено минимальное, медианное и максимальное время запуска по пяти итерациям:

| Activity                     | min (ms) | median (ms) | max (ms) | Скриншот                                  |
|------------------------------|----------|-------------|----------|-------------------------------------------|
| Simple Activity              | 877.5    | 929.8       | 968.3    | <img src="images/demo0.png" width="100"/> |
| 3x30 Activity                | 1,324.1  | 1,353.1     | 1,698.4  | <img src="images/demo1.png" width="100"/> |
| 3x30x4 Activity              | 1,734.6  | 1,751.4     | 2,164.0  | <img src="images/demo2.png" width="100"/> |
| 3x30x4 No Fragments Activity | 1,823.1  | 1,859.1     | 2,528.7  | <img src="images/demo3.png" width="100"/> |

## Скриншоты

Ниже можно насладиться экранами соответствующих активностей:

### Simple Activity
<img src="images/demo0.png" width="200"/>

### 3x30 Activity
<img src="images/demo1.png" width="200"/>

### 3x30x4 Activity
<img src="images/demo2.png" width="200"/>

### 3x30x4 No Fragments Activity
<img src="images/demo3.png" width="200"/>

## Заключение

Эти бенчмарк тесты показывают, что отказ от фрагментов ухудшает перформанс. Разница составляет около 100 мс при уменьшении количества фрагментов с 360 до 90.
