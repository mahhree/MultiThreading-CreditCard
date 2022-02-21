public class creditcard {
    private String number;
    private int reversedNUM[];
    private boolean isValid = false;
    private int total = 0;
    private int onStep = 1;
    public creditcard(String str_num) {
        number = str_num;
        reversedNUM = new int[number.length()];
    }
    
    public void stringToNumber() {
        int j = 0;
        for(int i = number.length()-1; i >= 0; i--) 
        {
            reversedNUM[j] = number.charAt(i) - 48;
            j++;
        }
    }
    public void calculateAltDigitSum() 
    { 
        for(int i = 1; i < reversedNUM.length; i = i+2) {
            int num = reversedNUM[i]*2;
            if(num > 9)
            num = num - 9;
        reversedNUM[i] = num;
                    
        }
    }
    public void add() {
        for(int i = 0; i < reversedNUM.length; i++)
            total += reversedNUM[i];
    }
    public void findValidInvalid() 
    {
        if(total%10 == 0)
            isValid = true;
        else
            isValid = false;
    }
    public String company() 
    { 
        if(isValid) 
        {
            if(number.charAt(0) == '3')
                return "American Express";
            else if(number.charAt(0) == '6')
                return "Discover card";
            else if(number.charAt(0) == '5')
                return "Mastercard";
            else if(number.charAt(0) == '4')
                return "Visa";
            return null;
        }
        else return "invalid";
    }
    public void addStep() 
    {
        onStep++;
    }
    public int getStep() 
    {
        return onStep;
    }
}