// Convert KB to MB
public class Problem4 {
    public static void main(String[] args){
        printMBAndKB(18020604);
    }
    public static void printMBAndKB(int kiloBytes){
        if(kiloBytes < 0) {System.out.println("Invalid Value");}
        else{
            int mb = kiloBytes/1024;
            int remainingKB = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKB + " KB");
        }
    }
}
