package InterfaceDemo;

import java.util.Date;

public class CloneableDemo<list1> {
    public static void main(String[] args) {
        Date ins1 = new Date();
        Date ins2 = (Date) ins1.clone();
        System.out.println(ins1 == ins2);
    }


}

