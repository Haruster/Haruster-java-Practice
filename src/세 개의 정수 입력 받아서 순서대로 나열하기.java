import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("정수를 입력하시오 : ");
        a = input.nextInt();
        System.out.println("정수를 입력하시오 : ");
        b = input.println();
        System.out.println("정수를 입력하시오 : ");
        c = input.nextInt();

        if(a<b){
            if(a<c){
             if(b<c)
              System.out.print("정렬된 숫자"+a+""+b+""+c);      
             else
              System.out.print("정렬된 숫자"+a+""+c+""+b);
            }
           
            else{
             if(b<a)
              System.out.print("정렬된 숫자"+c+""+b+""+a);
             else
             System.out.print("정렬된 숫자"+c+""+a+""+b);          
            
            
            }
           }
            else{
             if(b<c){
              if(a<c)
              System.out.print("정렬된 숫자"+b+""+a+""+c);     
             else
              System.out.print("정렬된 숫자"+b+""+c+""+a);
             }
             else{
              if(b<a)
               System.out.print("정렬된 숫자"+c+""+b+""+a);
              else
               System.out.print("정렬된 숫자"+c+""+a+""+b);
             }    
            
           }
         
          }
         
         }
