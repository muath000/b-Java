import java.util.Scanner;
public class basics {
    public static void main(String[] args) throws Exception {
          Scanner put = new Scanner(System.in);
          char op;
          double num1, num2 , result;
          System.out.print("enter number :");
          num1 = put.nextInt();
          System.out.print("input any with this \"[*,/,+,-]\" :");
          op = put.next().charAt(0);
          System.out.print("again number: ");
          num2 = put.nextInt();
          switch (op){
              case '+':
                  result = num1 + num2;
                  System.out.println(num1 + "+" + num2 + "=" + result);
                  break;
              case '-':
                  result = num1 - num2;
                  System.out.println(num1 + "-" + num2 + "=" + result);
                  break;
              case '/':
                  result = num1 / num2;
                  System.out.println(num1 + "/" + num2 + "=" + result);
                  break;
              case '*':
                  result = num1 * num2;
                  System.out.println(num1 + " X " + num2 + " = " + result);
                  break;
              default: System.out.println("ERROR IN operator: ");
              break;


          }












//


//        System.out.print(n);  String n = myinput.nextLine();


//     int a =12 ,b=10;
//     int sum = a++ - b;
//     System.out.print(sum);
//
//        boolean b1 = true, b2 = false, b3 = true;
//        System.out.println( b1 && b2 && ! b3 );
//
//
//
//        int i = 10, j = 12, k = 1;
//        k += i++ - --j;
//        System.out.println(k);
//
//
//
//        int i = 10;
//        i++;i++;++i;
//        int j = i++;
//        System.out.println(j);

//        System.out.print("gave me number: ");
//        int num = myinput.nextInt();
//        System.out.print("more number");
//        int num1 = myinput.nextInt();
//        int st= 50;
//        System.out.print(  st++);

//        int x=4 , y=6 , z=8;
//        x -= ++y ;
//        System.out.println(x);
//        if (z >= x ){
//            int mul = myinput.nextInt();
//            System.out.println("tha Z is great than from X:\n"+ mul *3);
//        }else{
//            System.out.print("error: ");

//        }
//        System.out.print("gave me number ");
//        int num1 = put.nextInt();
//        System.out.println("more number :");
//        int num2 = put.nextInt();
//        if (num1 >= num2){
//            int rand = (int) (Math.random() * 101);
//            System.out.println(rand);
//        }else{
//            float f1 = (float)(Math.sqrt(64));
//            System.out.println(f1);
//        }
//        int time = 20;
//        String result = (time > 18) ? "Good day." : "Good evening.";
//        System.out.println(result);



//        if (num < 10){
//            System.out.println("good moaring:");
//        } else if (num <18) {
//            System.out.println("good DAY:");
//
//        }else{
//            System.out.println("good eveing.: ");

    }


    }


