public class Problem8 {
    public static void main(String[] args){
        System.out.println(hasTeen(18,6,24));
        System.out.println(isTeen(182));
    }
    public static boolean hasTeen (int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber >= 13 && firstNumber <= 19){
            return true;
        }else{
            if(secondNumber>=13 && secondNumber <=19){
                return true;
            }else{
                if(thirdNumber >= 13 && thirdNumber<=19){
                    return true;
                }else return false;
            }
        }
    }

    public static boolean isTeen(int number){
        return number >=13 && number<=19;
    }
}
