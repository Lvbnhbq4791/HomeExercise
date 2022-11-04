public class SalesManager {
    protected long[] sales;
    protected long max;
    protected long min;
    protected long average;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        this.max = max;
        return max;
    }
    public long min(){
        long min = max;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        this.min = min;
        return min;
    }
    public  long average(){
        long aver = 0;
        for(long sale : sales){
            aver = aver+sale;
        }
        long average = (aver-max-min)/(sales.length -2);
        this.average = average;
        return average;
    }
}
