public class Main {
    public static void main(String[] args){
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
    }
}
