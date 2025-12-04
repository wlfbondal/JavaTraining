package com.bpi.helloworld.main.OOPActivity3;

public class Main {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    	//car1
        Car car1 = new Car();
        car1.setBrand("Mitsubishi");
        car1.setModel("Lancer Evo");
        car1.setYear(2005);
        car1.displayDetails();
        
        //spacer
        System.out.println();
        
        // car2
        Car car2 = new Car("Honda", "Civic", 2022);
        car2.displayDetails();
    }
}
