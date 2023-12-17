package Part1;

//Convert inches, feet to centimeters
public class Problem9 {
    public static void main(String[] args){
        System.out.println("6ft, 4in =  "+ convertToCM(6, 4)+ "cm");
        System.out.println("18in =  "+ convertToCM(18) + "cm");
    }

    public static double convertToCM(int inches){return inches*2.54;}
    public static double convertToCM(int feet, int inches){
        return convertToCM((feet*12)+inches);
    }
}
