
package com.kelasd.week4;

import javax.swing.JButton;

public class Casting2 {
    public static void main(String[] args) {
        Object[] data = 
            {
                1,
                3.5,
                "4.0", 
                new JButton("Login")
            };
        
        for (Object o : data) {
            if(o instanceof JButton){
                JButton b = (JButton) o;
                System.out.println(b.getText());
            }else {
                System.out.println(o);
            }
            
        }
    }
}
