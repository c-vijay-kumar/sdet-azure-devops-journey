package Day05;
import java.util.*;
class Payment{
    void pay(){
        System.out.println("Payment done");
    }
}
class UPIPayment extends Payment{
    @Override 
    void pay(){
        System.out.println("UPI Payment done");
    }
}
class CardPayment extends Payment{
    @Override 
    void pay(){
        System.out.println("Card Payment done");
    }
}
class netbankingPayment extends Payment{
    @Override 
    void pay(){
        System.out.println("Net Banking Payment done");
    }
}
public class runtimepolymorphsism {
    public static void main(String[] args){
        Payment p;
        p=new UPIPayment();
        p.pay();
        p=new CardPayment();
        p.pay();
        p=new netbankingPayment();
        p.pay();
    }
}
