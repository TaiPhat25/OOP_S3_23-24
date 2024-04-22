public class Question1 {
    private long number;
    
    public Question1() {
        
    }
    
    public Question1(long number) {
        this.number = number;
    }
    
    //123456
    public long SumFirstLastDigit() {
        long lastDigit = number%10;
        long firstDigit = number;
        
        while(firstDigit>=10) {
            firstDigit/=10;
        }
        return firstDigit+lastDigit;
    }
}
