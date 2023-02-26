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
            else if(text.equals("4")) {
                while(true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {
                        double number = Integer.parseInt(scan.nextLine());
                        double[] arr = new double[4];
                        for (int i = 0; i < 4; i++) {
                            double p = Math.round(((number / 10) - (Math.floor(number / 10))) * 10);
                            arr[i] = p;
                            number = Math.floor(number / 10);
                        }
                        if((arr[0] == arr[3]) && (arr[1] == arr[2])){
                            System.out.println("Паліндром");
                        }
                        else{
                            System.out.println("Не паліндром");
                        }
                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("5")){
                while(true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {
                        int month = Integer.parseInt(scan.nextLine());
                        int l = month % 2;
                        if (month == 2){
                            System.out.println("28");
                        }
                        else if ((l == 1 && month < 8) || (l == 0 && month > 7)){
                            System.out.println("31");
                        }
                        else{
                            System.out.println("30");
                        }
                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("6")){
                while (true) {
                    System.out.println("Go or q");
                    text = scan.nextLine();
                    if (text.equals("go")) {
                        int age = Integer.parseInt(scan.nextLine());
                        int q = age % 10;
                        if (q == 1){
                            System.out.println(age + " рік");
                        }
                        else if (q > 1 && q < 5){
                            System.out.println(age + " роки");
                        }
                        else{
                            System.out.println(age + " років");
                        }
                    }
                    else if (text.equals("q")) {
                        break;
                    }
                }
            }
            else if(text.equals("q")){
                break;
            }
        }
    }
}