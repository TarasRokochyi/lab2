import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Task:");
            String text = scan.nextLine();
            if(text.equals("1")){
                while (true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {
                        System.out.println("Math: ");
                        float n = scan.nextFloat();
                        scan.nextLine();
                        System.out.println("Philosophy: ");
                        n = (n + scan.nextFloat()) / 2;
                        scan.nextLine();
                        System.out.println("Programming: ");
                        n = (n + scan.nextFloat()) / 2;
                        scan.nextLine();
                        if (n > 5) {
                            System.out.println("Incorrect input");
                        }
                        else if (n > 4.50){
                            System.out.println("Your scholarship is 1790 grn");
                        }
                        else if (n > 4){
                            System.out.println("Your scholarship is 1400 grn");
                        }
                        else{
                            System.out.println("You don't get scholarship");
                        }
                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("2")) {
                while (true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {
                        float x = scan.nextFloat();
                        scan.nextLine();
                        float y = scan.nextFloat();
                        scan.nextLine();
                        if(x < 0 && y < 0){
                            System.out.println("x: " + Math.abs(x) + "  y: " + Math.abs(y));
                        }
                        else if(x < 0 || y < 0){
                            System.out.println("x: " + (x + 1) + "  y: " + (y + 1));
                        }
                        else if((x > 2 && x < 9) && (y > 2 && y < 9)){
                            System.out.println("x: " + (x / 10) + "  y: " + (y / 10));
                        }
                        else{
                            System.out.println("x: " + x + "  y: " + y);
                        }



                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("3")){
                while (true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {
                        int a = Integer.parseInt(scan.nextLine());
                        int b = Integer.parseInt(scan.nextLine());
                        int c = Integer.parseInt(scan.nextLine());
                        if ((a + b) < c || (a + c) < b || (c + b) < a){
                            System.out.println("Такого трикутника не існує");
                        }
                        else if ( a == b && b == c){
                            System.out.println("Трикутник рівносторонній");
                        }
                        else if (((a*a) + (b*b) == (c*c)) || ((a*a) + (c*c) == (b*b)) || ((c*c) + (b*b) == (a*a))){
                            System.out.println("Трикутник прямокутний");
                        }
                        else if (((a == b) && (a != c)) || ((a == c) && (a != b)) || ((c == b) && (c != a))){
                            System.out.println("Трикутник рівнобедрений");
                        }
                        else {
                            System.out.println("Трикутник довільний");
                        }
                    } else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("4")){
                System.out.println("Go or q");
                text = scan.nextLine();
                if (text.equals("go")){

                }
                else if (text.equals("q")){
                    break;
                }
            }
            else if(text.equals("5")){
                System.out.println("Go or q");
                text = scan.nextLine();
                if (text.equals("go")){

                }
                else if (text.equals("q")){
                    break;
                }
            }
            else if(text.equals("6")){
                System.out.println("Go or q");
                text = scan.nextLine();
                if (text.equals("go")){

                }
                else if (text.equals("q")){
                    break;
                }
            }
            else if(text.equals("q")){
                break;
            }
        }
    }
}