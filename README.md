
1. **Установка и настройка Gradle**:
    - Установлен Gradle для сборки проекта.

2. **Создание библиотеки .jar**:
    - В рамках одного модуля создана библиотека с классом `StringUtils`, включая метод `isPositiveNumber`.
    - Создан .jar файл, в котором был добавлен манифест с информацией о версии.

3. **Создание unit test**:
    - Написан unit test для метода `isPositiveNumber` в классе `StringUtils`
    -  Написан unit test для метода `isAllPositiveNumbers(String… str)` 

4. **Создание Gradle плагина** 
    - Разработан Gradle плагин для формирования отчёта 

5. **Создание мульти-модульного проекта** 
    - Создан мульти-модульный проект с двумя модулями: `core` и `api`.

6. **Модуль `core`** 
    - Создан класс `Utils` с методом `isAllPositiveNumbers`.
    - Использовал`utils-1.3.5.jar` для переиспользования метода `isPositiveNumber`.

7. **Модуль `api`** 
    - Создан класс `App` с методом `main`, который вызывает `Utils.isAllPositiveNumbers`.
    - Написан unit test для метода `isAllPositiveNumbers` в классе `Utils`.
