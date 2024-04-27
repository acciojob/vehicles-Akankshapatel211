package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
    	
    	super(name,4,4,6,isManual,"Audi",6);
    	
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate;
        //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        int newGear;
        if (newSpeed <= 0) {
            newSpeed = 0; // Ensure speed is non-negative
            newGear = 1; // Set gear to 1 if speed is 0 or negative
        } else if (newSpeed <= 50) {
            newGear = 1;
        } else if (newSpeed <= 100) {
            newGear = 2;
        } else if (newSpeed <= 150) {
            newGear = 3;
        } else if (newSpeed <= 200) {
            newGear = 4;
        } else if (newSpeed <= 250) {
            newGear = 5;
        } else {
            newGear = 6;
        }





        //for all other cases, change the gear accordingly

//        if(newSpeed > 0) {
//           // changeSpeed(newSpeed, getCurrentDirection());
//
//            changeSpeed(newSpeed, newDirection);
//        }

    }

}
