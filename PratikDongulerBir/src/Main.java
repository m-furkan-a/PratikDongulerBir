import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int sayi=0,s=0,ort=0,tp=0;
	    System.out.print("Sayı Giriniz : ");
	    sayi = input.nextInt();

	    for (int i=0 ; i <= sayi ; i++){
	        if (i %3==0 && i %4==0){
	            tp +=i;
	            s++;
            }
        }
	    ort=tp/s;
	    System.out.print("0'dan " + sayi + " olan sayıların 3 ve 4 e bölünenlerin ortalaması : " + ort);
    }
}
