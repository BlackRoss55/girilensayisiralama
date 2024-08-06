import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N,b=0,c=0,d=0,i;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        N = sc.nextInt();
        for(i = 1;i<=N ;i++){
            System.out.print(i+". Sayıyı giriniz: ");
            b = sc.nextInt();
            if(b >= c){
                c = b;
            }
            else if(b<=d){
                d=b;
            }
        }
        System.out.println("En büyük sayı: "+c);
        System.out.print("En küçük sayı: "+d);
    }
}