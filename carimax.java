public class cariMAX {
    public static void main (String[] args){
    int angka1 = 10;
    int angka2 = 30;
    int angka3 = 70;
    
    int max = 0;
    
    max = angka1 >= max ? angka1 : max;
    max = angka2 >= max ? angka2 : max;
    max = angka3 >= max ? angka3 : max;
    
    System.out.println("Angka yang paling besar adalah" +max);
    }
}
