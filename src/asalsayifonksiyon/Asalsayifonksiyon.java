
package asalsayifonksiyon;
public class Asalsayifonksiyon {
    public static boolean asalBul(int asalSayi){
        for(int a=2;a<asalSayi;a++){
            if(asalSayi % a == 0)
                return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        int i;
        for(i=2 ; i<100; i++){
            if(asalBul(i))
                System.out.println(i + " bir asal sayidir");
        }
    }
    
}
