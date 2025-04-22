public class Main3 {
    public static void PrintColor(int value){
        if(value <= 0){
            System.out.println("Red");
        }else if(value > 0 && value <= 100) {
            System.out.println("Yellow");
        }else if(value > 100){
                System.out.println("Green");
            }
        }
    public static void main(String[] args ){
        PrintColor(20);
    }
}
