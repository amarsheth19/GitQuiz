interface Add{
    int calculate(int firstNum, int lastNum);
}
public class Class {
    public static void main(String[] args){
        int firstNumber =0;
        int lastNumber = 0;
        for(int i = 0; i <args.length; i++)
            System.out.println(args[i]);


        Add a = (int firstNum, int lastNum) -> {
            int amount = 0;
            for(int i = firstNumber; i<=lastNumber; i++)
                amount+=i;
            return amount;
        };

        int answer = a.calculate(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        System.out.println("Amount" + answer);

    }

}


