interface Add{
    int calculate(int firstNum, int lastNum);
}
public class Class {
    public static void main(String[] args){
       
        Add a = (int firstNum, int lastNum) -> {
            int amount = 0;
            for(int i = firstNum; i<=lastNum; i++)
                amount+=i;
            return amount;
        };

        int answer = a.calculate(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        System.out.println("Amount " + answer);

    }

}


