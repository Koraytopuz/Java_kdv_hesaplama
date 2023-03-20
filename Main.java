import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int para;
        Scanner inp=new Scanner(System.in);
        System.out.println("Para Miktarını Giriniz:");
        para=inp.nextInt();
        int kdv=para+para/100*18;
        System.out.println(kdv+" Tl Kdv'li fiyat");
        int kdv1=kdv-para;
        System.out.println(kdv1+" Tl Kdv tutarı");
    }

}