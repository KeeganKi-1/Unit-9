public class CalculateAverage{

    public double calculateAverage(int[] numbers){
        double average =0.0;
        CalculateSum sumClass = new CalculateSum();
        
        average = sumClass.calculateSum(numbers)/numbers.length;
        
        return average;
    }
    
    

}