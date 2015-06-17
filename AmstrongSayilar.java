package amstrong;

public class AmstrongSayilar {

	public static void main(String[] args) {
        
		int sayi,x,y,z,toplam,sayac = 0;
        
		System.out.println("100 ile 1000 arasindaki armstrong sayilari: ");
        
		for(int i=100; i<=999;i++) {
            sayi=i;
            z=sayi/100;
            sayi= sayi%100;
            y=sayi/10;
            x=sayi%10;
            toplam=x*x*x+y*y*y+z*z*z;
            sayac= sayac+1;
            
            if(toplam==i)
                
            	System.out.print( "sayi: "+i + " "+"sayac: "+sayac+"---");

        }
	}
}
