public class SalesManager {
    protected int[] sales;
    protected int max;
    protected int min;
    protected int average;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        this.max = max;
        return max;
    }
    public int min(){
        int min = max;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        this.min = min;
        return min;
    }
    public  int average(){
        int aver = 0;
        for(int sale : sales){
            aver = aver+sale;
        }
        int average = (aver-max-min)/(sales.length -2);
        this.average = average;
        return average;
    }
}
