public class Main {
    public static void main(String[] args){
        //Создаем массив где значениями ячеек являются
        //месячные продажи отдельно взятых менеджеров
        long[] salesManagers = {100,200,150,365,480,196,254};
        //Создаем объект класса SalesManager
        SalesManager managers = new SalesManager(salesManagers);
        //Создаем интовую переменную saleMonths которая ссылается
        //на метод max класса SalesManager
        long saleMonths = managers.max();
        long saleMonthsMin = managers.min();
        long saleMonthsAverage = managers.average();
        // выводим результат метода max класса SalesManager
        System.out.println("Максималные продажи-"+saleMonths+" руб.");
        System.out.println("Средние продажи-"+saleMonthsAverage+" руб.");
    }
}
