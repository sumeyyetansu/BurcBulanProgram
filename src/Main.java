import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month , day = 0;
        System.out.print("Doğduğunuz ayı giriniz = ");
        month = scanner.nextInt();

        System.out.print("Doğduğunuz gün = ");
        day = scanner.nextInt();

        if(month == 1 && 1 <= day && day <=31){

            if( day < 22) {
                System.out.println("Oğlak burcu");
            }
            else {
                System.out.println("Kova burcu");
            }
        }

        else if(month == 2 && 1 <= day && day <=28){

            if (day < 18){
                System.out.println("Kova burcu");
            }
            else {
                System.out.println("Balık burcu");
            }

        }

        else if(month == 3 && 1<= day && day<=31){
            if(day < 21){
                System.out.println("Balık burcu");
            }
            else {
                System.out.println("Koç burcu");
            }
        }

        else if(month == 4 && 1 <= day && day <=30){
            if(day < 19){
                System.out.println("Koç burcu");
            }
            else {
                System.out.println("Boğa burcu");
            }
        }

        else if(month == 5 && 1 <= day && day <= 31){
            if (day < 20){
                System.out.println("Boğa burcu");
            }else {
                System.out.println("İkizler burcu");
            }
        }

        else if(month == 6 && 1 <= day && day <=30){
            if (day < 22){
                System.out.println("İkizler burcu");
            }else{
                System.out.println("Yengeç burcu");
            }
        }

        else if(month == 7 && 1 <= day && day <= 31){
            if (day < 21){
                System.out.println("Yengeç burcu");
            }else {
                System.out.println("Aslan burcu");
            }
        }

        else if(month == 8 && 1 <= day && day <=31){
            if (day < 22){
                System.out.println("Aslan burcu");
            }else {
                System.out.println("Başak burcu");
            }
        }

        else if(month == 9 && 1 <= day && day <=30){
            if(day < 21){
                System.out.println("Başak burcu");

            }else{
                System.out.println("Akrep burcu");
            }
        }

        else if(month == 10 && 1 <= day && day <=31){
            if(day < 21){
                System.out.println("Akrep burcu");

            }else{
                System.out.println("Terazi burcu");
            }
        }

        else if(month == 11 && 1 <= day && day <= 30){
            if(day < 20){
                System.out.println("Terazi burcu");

            }else{
                System.out.println("Yay burcu");
            }
        }

        else if(month == 12 && 1 <= day && day <= 31){
            if(day < 20){
                System.out.println("Yay burcu");

            }else{
                System.out.println("Oğlak burcu");
            }

        }
        else {
            System.out.println("Geçersiz giriş.");
        }
    }
}