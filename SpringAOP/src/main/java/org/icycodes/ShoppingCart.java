package org.icycodes;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String str){
        System.out.println("This is checkOut Method");
    }
    public int quant(){
        return 10;
    }
}
