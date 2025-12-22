package com.tanishq.method_overriding;

public class RBIDemo {
    public static void main(String[] args) {
        RBI s = new SBI();
        s.loan();

        RBI b = new BOB();
        b.loan();
    }
}
class RBI{
    public void loan(){
        System.out.println("Provide instruction for loan.");
    }
}
class SBI extends RBI{
    @Override
    public void loan(){
        System.out.println("Providing loan @ 9.6%");
    }
}
class BOB extends RBI {
    @Override
    public void loan(){
        System.out.println("Providing loan @ 8.6%");
    }
}
