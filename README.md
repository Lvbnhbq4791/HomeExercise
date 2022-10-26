# Описание работы менеджера продаж
1.В классе `Main` прописываем код для демонстрации работы класса `SalesManager`:
```java
        //Создаем массив где значениями ячеек являются
        //месячные продажи отдельно взятых менеджеров
        int[] salesManagers = {100,200,150,365,480,196,254};
        //Создаем объект класса SalesManager
        SalesManager managers = new SalesManager(salesManagers);
        //Создаем интовую переменную saleMonths которая ссылается
        //на метод max класса SalesManager
        int saleMonths = managers.max();
        // выводим результат метода max класса SalesManager 
        System.out.println("Max продажи-"+saleMonths+" руб.");
```
2.Передаем параметром массив `salesManagers` в конструктор класса `SalesManager`.                                       
3.Конструктор класса `SalesManager`присваивает значение массива полю `sales` этого же класса.                           
4.Из класса `Main` вызываем метод `max`класса `SalesManager` в котором циклом for-each определяем                       
максимальную продажу основываясь на значениях поля `sales`.                                                             
5.Возращаем результат переменной `saleMonths` класса `Main`.                                                            
6.В консоль выводим результат командой `System.out.println("Max продажи-"+saleMonths+" руб.");`.



