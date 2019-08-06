public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 1){
            return "Fizz";
        } 
        if (number % 5 == 0 && number % 5 == 1){
            return "Buzz";
        }
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        else{
            return Integer.toString(number);
        }
      
        
    }
}